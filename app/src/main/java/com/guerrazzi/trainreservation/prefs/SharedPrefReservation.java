package com.guerrazzi.trainreservation.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SharedPrefReservation {



    public static String getAllSolutions(Context c){
        SharedPreferences pref = c.getSharedPreferences(FirebaseAuth.getInstance().getCurrentUser().getEmail(), Context.MODE_PRIVATE);
        return pref.getString("listRes", "");
    }

    public static boolean save(Context c, String json){
        SharedPreferences pref = c.getSharedPreferences(FirebaseAuth.getInstance().getCurrentUser().getEmail(), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("listRes", json);
        return editor.commit();
    }

    public static void removeAll(Context c){
        SharedPreferences pref = c.getSharedPreferences(FirebaseAuth.getInstance().getCurrentUser().getEmail(), Context.MODE_PRIVATE);
        pref.edit().remove("listRes");
        pref.edit().commit();
    }
}
