package com.guerrazzi.trainreservation.data.manager.service;

import com.guerrazzi.trainreservation.model.TrainStatus;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
/**
 * Interfaccia dei metodi di recupero dati da Viaggiatreno
 */
public interface GetStatoTrenoService {

    @GET("/viaggiatrenonew/resteasy/viaggiatreno/andamentoTreno/{origin}/{trainNumber}/{currentTimeStamp}")
    Call<String> getTrainStatus(@Path("origin") String origin, @Path("trainNumber") String TrainNumber, @Path("currentTimeStamp") long date);


}
