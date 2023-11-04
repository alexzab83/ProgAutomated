package com.guerrazzi.trainreservation.data.manager.utils;

import com.google.android.gms.common.util.Strings;
import com.guerrazzi.trainreservation.model.Stations;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe utility per convertire una stringa in un array di oggetti
 */
public class Converter {


    private static final String REGEX_PIPE = "\\|";
    private static final String REGEX_NEWLINE = "\n";

    public static List<Stations> stringToListaStation(String stationsStrings) {
        if (Strings.isEmptyOrWhitespace(stationsStrings)) {
            return null;
        }
        String[] fullString = stationsStrings.split(REGEX_NEWLINE);
        List<Stations> localList = new ArrayList<>();
        for (int i = 0; i < fullString.length; i++) {
            String[] splittedFullStr = fullString[i].split(REGEX_PIPE);
            Stations st = new Stations();
            st.setDescription(splittedFullStr[0]);
            st.setId(splittedFullStr[1]);
            if (splittedFullStr[1].startsWith("S0"))
                st.setShotId(splittedFullStr[1].substring(2));
            else st.setShotId(splittedFullStr[1].substring(1));
            localList.add(st);
        }

        return localList;
    }
}
