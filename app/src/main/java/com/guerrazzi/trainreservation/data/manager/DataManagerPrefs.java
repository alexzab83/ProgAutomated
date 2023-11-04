package com.guerrazzi.trainreservation.data.manager;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.android.gms.common.util.Strings;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.guerrazzi.trainreservation.model.SoluzioniBean;
import com.guerrazzi.trainreservation.prefs.SharedPrefReservation;
import com.guerrazzi.trainreservation.view.bean.Reservations;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Classe per la che gestisce le prenotazoi salvate sulle shared preferences
 */
public class DataManagerPrefs {

    public DataManagerPrefs() {
    }


    public static List<SoluzioniBean> getAllReservation(Context c) {
        String listJson = SharedPrefReservation.getAllSolutions(c);
        if (Strings.isEmptyOrWhitespace(listJson)) {
            return null;
        }

        Gson gson = new Gson();
        Type listType = new TypeToken<List<SoluzioniBean>>() {
        }.getType();
        List<SoluzioniBean> localList = gson.fromJson(listJson, listType);

        return localList;
    }

    public static boolean putReservations(Context c, List<SoluzioniBean> list) {
        return SharedPrefReservation.save(c, new Gson().toJson(list));
    }

    public static void removeAllReservation(Context c) {
       SharedPrefReservation.removeAll(c);
    }

}
