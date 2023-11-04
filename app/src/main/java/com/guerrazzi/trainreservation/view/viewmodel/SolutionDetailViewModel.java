package com.guerrazzi.trainreservation.view.viewmodel;

import android.app.Application;
import android.view.View;

import com.google.android.gms.common.util.Strings;
import com.guerrazzi.trainreservation.data.manager.DataManagerNetwork;
import com.guerrazzi.trainreservation.data.manager.DataManagerPrefs;
import com.guerrazzi.trainreservation.model.FermateBean;
import com.guerrazzi.trainreservation.model.SoluzioniBean;
import com.guerrazzi.trainreservation.model.Stations;
import com.guerrazzi.trainreservation.model.TrainStatus;
import com.guerrazzi.trainreservation.utils.DateConverter;
import com.guerrazzi.trainreservation.view.adapter.StopListAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

public class SolutionDetailViewModel extends BaseViewModel {

    private SoluzioniBean solutionBean;
    private SoluzioniBean solutionBeanToModify;


    public SolutionDetailViewModel(@NonNull Application application) {
        super(application);
    }

    public ObservableField<Boolean> btnVisibilityModify = new ObservableField<>(false);
    public ObservableField<Boolean> btnVisibilityReserve = new ObservableField<>(false);
    public TrainStatus localTrainStatus;
    public ObservableField<String> obsOrigin = new ObservableField<>();
    public ObservableField<String> obsDest = new ObservableField<>();
    public ObservableField<String> obsTimeDep = new ObservableField<>();
    public ObservableField<String> obsTimeArr = new ObservableField<>();
    public ObservableField<String> obsDelayText = new ObservableField<>();
    public ObservableField<Boolean> obsDelay = new ObservableField<>();
    public ObservableField<Boolean> obsNoResult = new ObservableField<>();
    public ObservableField<Boolean> loading = new ObservableField<>();


    private StopListAdapter stopListAdapter;

    public void initView(boolean flagModify, boolean flagReserve) {
        stopListAdapter = new StopListAdapter();
        obsNoResult.set(false);
        btnVisibilityModify.set(flagModify);
        btnVisibilityReserve.set(flagReserve);

    }

    public void getTrainInfo() {
        LiveData<String> liveData;
        loading.set(true);
        liveData = DataManagerNetwork.getTrainInfo(solutionBean.getVehicles().get(0).getNumeroTreno());
        liveData.observeForever(new Observer<String>() {

            @Override
            public void onChanged(String trainInfo) {

                if (Strings.isEmptyOrWhitespace(trainInfo)){
                    obsNoResult.set(true);
                    loading.set(false);
                    return;
                }

                else {
                    String[] splitted = trainInfo.split("-");
                    getTrainStatus(splitted[0].trim(), splitted[1].trim());
                }

            }
        });
    }

    // S04501/2183
    private void getTrainStatus(String numberTrain, String origin) {
        LiveData<TrainStatus> liveData;
        liveData = DataManagerNetwork.getTrainStatus(origin, numberTrain);
        liveData.observeForever(new Observer<TrainStatus>() {

            @Override
            public void onChanged(TrainStatus trainStatus) {
                loading.set(false);
                if (trainStatus == null || trainStatus.getFermate() == null){
                    obsNoResult.set(true);
                    return;
                }

                obsDelay.set(true);
                obsDelayText.set(""+trainStatus.getRitardo());
                for (FermateBean f: trainStatus.getFermate()) {
                    if (f.getStazione().equals(solutionBean.getOrigine())){
                        f.setDeparture(true);
                    }else if (f.getStazione().equals(solutionBean.getDestinazione())){
                        f.setArrive(true);
                    }
                }
                if (trainStatus != null)
                        stopListAdapter.setList(trainStatus.getFermate());
                obsOrigin.set(solutionBean.getOrigine());
                obsDest.set(solutionBean.getDestinazione());
                obsTimeArr.set(DateConverter.millisecondsToDateView(trainStatus.getOrarioArrivo()));
                obsTimeDep.set(DateConverter.millisecondsToDateView(trainStatus.getOrarioPartenza()));
            }
        });

    }

    public StopListAdapter getAdapter() {
        return stopListAdapter;
    }

    private void setTrainsStatus(TrainStatus trainStatus) {
        localTrainStatus = trainStatus;

    }

    public void setSolutionBean(SoluzioniBean soluzioniBean) {
        this.solutionBean = soluzioniBean;
    }
    public void setSolutionBeanToModify(SoluzioniBean soluzioniBean) {
        this.solutionBeanToModify = soluzioniBean;
    }

    public boolean reserveSolution() {
        solutionBean.setId(new Random().nextInt());
        List<SoluzioniBean> listReservation = DataManagerPrefs.getAllReservation(getApplication());
        if (listReservation == null)
            listReservation = new ArrayList<>();
        listReservation.add(solutionBean);
        String jsonListReservation = "";
        DataManagerPrefs.removeAllReservation(getApplication());
        return DataManagerPrefs.putReservations(getApplication(), listReservation);
    }
    public boolean modifySolution(int id) {
        List<SoluzioniBean> listReservation = DataManagerPrefs.getAllReservation(getApplication());
        List<SoluzioniBean> localistReservation = new ArrayList<>();
        if (listReservation == null)
            listReservation = new ArrayList<>();
        //listReservation.add(solutionBean);
        for (SoluzioniBean sb: listReservation) {
            if(solutionBeanToModify.getId() == sb.getId()){
                solutionBean.setOriginCode(solutionBeanToModify.getOriginCode());
                solutionBean.setOrigine(solutionBeanToModify.getOrigine());
                solutionBean.setDestCode(solutionBeanToModify.getDestCode());
                solutionBean.setDestinazione(solutionBeanToModify.getDestinazione());
                localistReservation.add(solutionBean);
            }else localistReservation.add(sb);
        }
        String jsonListReservation = "";
        DataManagerPrefs.removeAllReservation(getApplication());
        return DataManagerPrefs.putReservations(getApplication(), localistReservation);
    }

    public void removeReservation(){
        List<SoluzioniBean> listReservation = DataManagerPrefs.getAllReservation(getApplication());
        List<SoluzioniBean> newListReservation = new ArrayList<>();
        for (SoluzioniBean sb: listReservation) {
            if (sb.getId() != solutionBean.getId()){
                newListReservation.add(sb);
            }
        }
        DataManagerPrefs.removeAllReservation(getApplication());
        DataManagerPrefs.putReservations(getApplication(), newListReservation);
    }


    public void reserveTrain(View v){

    }
}
