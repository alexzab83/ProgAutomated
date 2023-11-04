package com.guerrazzi.trainreservation.data.manager;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.google.android.gms.common.util.Strings;
import com.google.gson.Gson;
import com.guerrazzi.trainreservation.data.manager.service.GetSolutionsService;
import com.guerrazzi.trainreservation.data.manager.service.GetStatoTrenoService;
import com.guerrazzi.trainreservation.data.manager.utils.Converter;
import com.guerrazzi.trainreservation.model.Soluzioni;
import com.guerrazzi.trainreservation.model.StationDetails;
import com.guerrazzi.trainreservation.model.Stations;
import com.guerrazzi.trainreservation.model.TrainStatus;
import com.guerrazzi.trainreservation.network.RetrofitUtils;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/**
 * Datamanager per gestire le chiamate di rete
 */
public class DataManagerNetwork {

    private static final String REGEX_PIPE = "\\|";

    public DataManagerNetwork() {

    }


    /**
     * Chiamata di rete per la ricerca delle stazione (per Autocomplete ricerca soluzioni )
     * @param initialStrng
     * @return lista di oggetti Stations
     */
    public static LiveData<List<Stations>> getStations(String initialStrng) {
        final MutableLiveData<List<Stations>> liveData = new MutableLiveData<>();
        GetSolutionsService service = RetrofitUtils.getRetrofitInstanceWithString().create(GetSolutionsService.class);
        Call<String> call = service.getStations(initialStrng);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.i("RESPONSE", response.body());
                liveData.postValue(Converter.stringToListaStation(response.body()));
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.e("RESPONSE", t.getMessage());
                liveData.postValue(null);
            }
        });


        return liveData;
    }

    /**
     * Chiamata di rete per ottenere le informazioni sullo stato del treno (Orari , fermate , ritardo)
     * @param origin
     * @param numberTrain
     * @return
     */
    public static LiveData<TrainStatus> getTrainStatus(String origin, String numberTrain) {
        final MutableLiveData<TrainStatus> liveData = new MutableLiveData<>();
        GetStatoTrenoService service = RetrofitUtils.getRetrofitInstanceWithGson().create(GetStatoTrenoService.class);
        Call<String> call = service.getTrainStatus(origin, numberTrain, System.currentTimeMillis());
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                TrainStatus t = new Gson().fromJson(response.body(), TrainStatus.class);
                liveData.postValue(t);

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                liveData.postValue(null);
            }
        });


        return liveData;
    }

    /**
     * Chiamata di rete per ottenere le soluzioni di viaggio
     * @param origin
     * @param dest
     * @param dateDeparture
     * @return
     */
    public static MutableLiveData<Soluzioni> getSolutions(String origin, String dest, String dateDeparture) {
        final MutableLiveData<Soluzioni> liveData = new MutableLiveData<>();
        GetSolutionsService service = RetrofitUtils.getRetrofitInstanceWithString().create(GetSolutionsService.class);
        Call<String> call = service.getSolutions(origin, dest, dateDeparture);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                String s = response.body();
                Gson gson = new Gson();
                Soluzioni sol = gson.fromJson(response.body(), Soluzioni.class);
                //Log.i("RESPONSE SOLUZIONI", s.getOrigine());
                liveData.setValue(sol);
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.e("ERROR", t.getLocalizedMessage());
                liveData.postValue(null);
            }
        });
        return liveData;
    }


    /**
     * Chiamata di rete che dato il numero del treno mi ritorna le info del treno(stazione origine , data partenza)
     * @param numberTrain
     * @return
     */
    public static MutableLiveData<String> getTrainInfo(String numberTrain) {
        final MutableLiveData<String> liveData = new MutableLiveData<>();
        GetSolutionsService service = RetrofitUtils.getRetrofitInstanceWithString().create(GetSolutionsService.class);
        Call<String> call = service.getTrainInfo(numberTrain);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                String s = response.body();
                if (Strings.isEmptyOrWhitespace(s)){
                    liveData.postValue(s);
                }else {
                    String[] splitted = s.split(REGEX_PIPE);
                    //Log.i("RESPONSE SOLUZIONI", s.getOrigine());
                    liveData.setValue(splitted[1]);
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.e("ERROR", t.getLocalizedMessage());
                liveData.postValue(null);
            }
        });
        return liveData;
    }

    public LiveData<List<StationDetails>> selectDeparturefromStation(String stationCode) {
        GetSolutionsService solutionsService = RetrofitUtils.getRetrofitInstanceWithString().create(GetSolutionsService.class);
        final MutableLiveData<List<Stations>> liveData = new MutableLiveData<>();
        return null;
    }

}




