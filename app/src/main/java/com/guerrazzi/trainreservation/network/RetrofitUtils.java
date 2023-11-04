package com.guerrazzi.trainreservation.network;

import com.guerrazzi.trainreservation.utils.ToStringConverterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Classe per la creazione di istanze Retrofit per le chimate di rete
 */
public class RetrofitUtils {

    private static Retrofit retrofit;
    private static final String BASE_URL_VIAGGIATRENO = "http://www.viaggiatreno.it";


    public static Retrofit getRetrofitInstanceWithString() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL_VIAGGIATRENO)
                    .addConverterFactory(ToStringConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static Retrofit getRetrofitInstanceWithGson() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL_VIAGGIATRENO)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


}
