package com.guerrazzi.trainreservation.view.viewmodel;

import android.app.Application;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;

import com.guerrazzi.trainreservation.data.manager.DataManagerNetwork;
import com.guerrazzi.trainreservation.model.Soluzioni;
import com.guerrazzi.trainreservation.model.SoluzioniBean;
import com.guerrazzi.trainreservation.model.Stations;
import com.guerrazzi.trainreservation.utils.DateConverter;
import com.guerrazzi.trainreservation.view.adapter.SolutionsAdapter;
import com.guerrazzi.trainreservation.view.adapter.StationsAdapter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

public class ReservationViewModel extends BaseViewModel {

    private StationsAdapter stationsAdapter;
    private List<Stations> stationsList;
    private Stations originStation;
    private Stations destStation;
    private String dateDeparture;
    private SolutionsAdapter solutionsAdapter;
    public ObservableField<Boolean> loading = new ObservableField<>(false);
    public ObservableField<Boolean> obsOrigin = new ObservableField<>(false);
    public ObservableField<Boolean> obsDest = new ObservableField<>(false);
    public ObservableField<Boolean> obsNoResult = new ObservableField<>(false);


    public ReservationViewModel(@NonNull Application application) {
        super(application);
    }

    public void initAdapterStations() {
        stationsList = new ArrayList<Stations>();
        stationsAdapter = new StationsAdapter(getApplication(), android.R.layout.activity_list_item, stationsList);
    }
    public void initAdapterSolution(SolutionsAdapter.SolutionsAdapterInterface actionInterface) {
        solutionsAdapter = new SolutionsAdapter();
        solutionsAdapter.setActionInterface(actionInterface);
    }

    public TextWatcher getTextWatcher() {
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count > 2) getStation(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        return textWatcher;
    }

    public void getStation(String initialString) {
        LiveData<List<Stations>> liveData;
        liveData = DataManagerNetwork.getStations(initialString);
        liveData.observeForever(new Observer<List<Stations>>() {
            @Override
            public void onChanged(List<Stations> stations) {
                if (stations != null)
                    stationsAdapter.setDataSet(stations);

            }
        });
    }

    public void getSolutions() {
        LiveData<Soluzioni> liveData;
        loading.set(true);
        obsNoResult.set(false);
        liveData = DataManagerNetwork.getSolutions(originStation.getShotId(), destStation.getShotId(), dateDeparture);
        liveData.observeForever(new Observer<Soluzioni>() {
            @Override
            public void onChanged(Soluzioni soluzioni) {
                loading.set(false);
                List<SoluzioniBean> localList = filterSolutionNoChange(soluzioni.getSoluzioni());
                if (localList == null || localList.isEmpty()){
                    obsNoResult.set(true);
                }
                else getSolutionsAdapter().setSolutionList(localList, soluzioni.getOrigine(), soluzioni.getDestinazione());


            }
        });
    }

    public ArrayAdapter<Stations> getStationAdapter() {
        return stationsAdapter;
    }

    public SolutionsAdapter getSolutionsAdapter() {
        return solutionsAdapter;
    }

    public void setOriginStation(Stations s) {
        originStation = s;
    }

    public Stations getDestStation() {
        return destStation;
    }

    public Stations getOriginStation() {
        return originStation;
    }

    public void setDestStation(Stations destStation) {
        this.destStation = destStation;
    }

    public void setDateDeparture(Calendar c) {
        dateDeparture = DateConverter.convertCalendarToIsoFormat(c);
    }

    private List<SoluzioniBean> filterSolutionNoChange(List<SoluzioniBean> list){
        List<SoluzioniBean> locaList = new ArrayList<>();
        for (SoluzioniBean sb: list) {
            if (sb.getVehicles().size() < 2) locaList.add(sb);
        }
        return locaList;
    }
}
