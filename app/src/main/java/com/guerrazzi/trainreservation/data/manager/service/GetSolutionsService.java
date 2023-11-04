package com.guerrazzi.trainreservation.data.manager.service;

import com.guerrazzi.trainreservation.model.StationDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Interfaccia dei metodi di recupero dati da Viaggiatreno
 */
public interface GetSolutionsService {

    @GET("/viaggiatrenonew/resteasy/viaggiatreno/soluzioniViaggioNew/{origine}/{destino}/{data}")
    Call<String> getSolutions(@Path("origine") String origine, @Path("destino") String destino, @Path("data") String data);

    @GET("/viaggiatrenonew/resteasy/viaggiatreno/autocompletaStazione/{initialString}")
    Call<String> getStations(@Path("initialString") String initialString);

    @GET("/viaggiatrenonew/resteasy/viaggiatreno/cercaNumeroTrenoTrenoAutocomplete/{numberTrain}")
    Call<String> getTrainInfo(@Path("numberTrain") String numberTrain);
}
