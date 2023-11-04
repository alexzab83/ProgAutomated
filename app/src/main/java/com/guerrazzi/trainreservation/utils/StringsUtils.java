package com.guerrazzi.trainreservation.utils;

import com.guerrazzi.trainreservation.model.VehiclesBean;

import java.util.List;

public class StringsUtils {

    /**
     * @param list
     * @return
     */
    public static String getStringWithComma(List<VehiclesBean> list){
        if (list == null) return "n/a";
        if (list.size() == 0) return "n/a";
        if (list.size() == 1) return list.get(0).getCategoriaDescrizione()+ " "+ list.get(0).getNumeroTreno();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(i == 0 ? list.get(i).getCategoriaDescrizione() + " "+  list.get(i).getNumeroTreno() : ", "+list.get(i).getCategoriaDescrizione() + " "+  list.get(i).getNumeroTreno());
        }
        return stringBuilder.toString();
    }
}
