package com.guerrazzi.trainreservation.model;

import com.guerrazzi.trainreservation.utils.DateConverter;
import com.guerrazzi.trainreservation.utils.StringsUtils;

import java.util.ArrayList;
import java.util.List;

public class    SoluzioniBean {
    /**
     * durata : 00:46
     * vehicles : [{"origine":"Pesaro","destinazione":"Cesena","orarioPartenza":"2019-10-27T11:19:00","orarioArrivo":"2019-10-27T12:05:00","categoria":"204","categoriaDescrizione":"IC","numeroTreno":"606"}]
     */
    private int id;
    private String durata;
    private String originCode;
    private String destCode;
    private String origine;
    private String destinazione;
    private List<VehiclesBean> vehicles;

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public List<VehiclesBean> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<VehiclesBean> vehicles) {
        this.vehicles = vehicles;
    }

    public String getOriginCode() {
        return originCode;
    }

    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }

    public String getDestCode() {
        return destCode;
    }

    public void setDestCode(String destCode) {
        this.destCode = destCode;
    }

    public String getFormattedTrains(){
        List<String> localList = new ArrayList<>();
        return StringsUtils.getStringWithComma(vehicles);
    }

    public String getTimeDepartureArrive(){
        if (vehicles != null && vehicles.size() > 0)
            return DateConverter.getTimeFromDate(vehicles.get(0).getOrarioPartenza())+ " - " +DateConverter.getTimeFromDate(vehicles.get(vehicles.size() - 1).getOrarioArrivo());
        return "";
    }

    public String getDateDepartureArrive(){
        if (vehicles != null && vehicles.size() > 0)
            return DateConverter.getDayFromDate(vehicles.get(0).getOrarioPartenza());
        return "";
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}