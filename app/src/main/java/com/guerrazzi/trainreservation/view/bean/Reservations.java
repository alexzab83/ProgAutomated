package com.guerrazzi.trainreservation.view.bean;

public class Reservations {

    private String idSolution;
    private String originDesc;
    private String idOrigin;
    private String destDesc;
    private String idDest;
    private long dataPartenza;
    private String numberTrain;
    private String durata;
    private String categoria;
    private String codeCategoria;

    public Reservations() {
    }

    public String getIdSolution() {
        return idSolution;
    }

    public void setIdSolution(String idSolution) {
        this.idSolution = idSolution;
    }

    public String getOriginDesc() {
        return originDesc;
    }

    public void setOriginDesc(String originDesc) {
        this.originDesc = originDesc;
    }

    public String getIdOrigin() {
        return idOrigin;
    }

    public void setIdOrigin(String idOrigin) {
        this.idOrigin = idOrigin;
    }

    public String getDestDesc() {
        return destDesc;
    }

    public void setDestDesc(String destDesc) {
        this.destDesc = destDesc;
    }

    public String getIdDest() {
        return idDest;
    }

    public void setIdDest(String idDest) {
        this.idDest = idDest;
    }

    public long getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(long dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public String getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(String numberTrain) {
        this.numberTrain = numberTrain;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodeCategoria() {
        return codeCategoria;
    }

    public void setCodeCategoria(String codeCategoria) {
        this.codeCategoria = codeCategoria;
    }
}
