package com.guerrazzi.trainreservation.model;

import com.guerrazzi.trainreservation.utils.DateConverter;

public class FermateBean {
    /**
     * orientamento : null
     * kcNumTreno : null
     * stazione : VENTIMIGLIA
     * id : S04501
     * listaCorrispondenze : null
     * programmata : 1572235920000
     * programmataZero : null
     * effettiva : 1572236010000
     * ritardo : 2
     * partenzaTeoricaZero : null
     * arrivoTeoricoZero : null
     * partenza_teorica : 1572235920000
     * arrivo_teorico : null
     * isNextChanged : false
     * partenzaReale : 1572236010000
     * arrivoReale : null
     * ritardoPartenza : 2
     * ritardoArrivo : 0
     * progressivo : 1
     * binarioEffettivoArrivoCodice : null
     * binarioEffettivoArrivoTipo : null
     * binarioEffettivoArrivoDescrizione : null
     * binarioProgrammatoArrivoCodice : null
     * binarioProgrammatoArrivoDescrizione : null
     * binarioEffettivoPartenzaCodice : 11
     * binarioEffettivoPartenzaTipo : 0
     * binarioEffettivoPartenzaDescrizione : 1
     * binarioProgrammatoPartenzaCodice : null
     * binarioProgrammatoPartenzaDescrizione : 1
     * tipoFermata : P
     * visualizzaPrevista : true
     * nextChanged : false
     * nextTrattaType : 0
     * actualFermataType : 1
     * materiale_label : null
     */

    private Object orientamento;
    private Object kcNumTreno;
    private String stazione;
    private String id;
    private String listaCorrispondenze;
    private long programmata;
    private String programmataZero;
    private long effettiva;
    private int ritardo;
    private String partenzaTeoricaZero;
    private String arrivoTeoricoZero;
    private Long partenza_teorica;
    private Long arrivo_teorico;
    private boolean isNextChanged;
    private long partenzaReale;
    private String arrivoReale;
    private int ritardoPartenza;
    private int ritardoArrivo;
    private int progressivo;
    private String binarioEffettivoArrivoCodice;
    private String binarioEffettivoArrivoTipo;
    private String binarioEffettivoArrivoDescrizione;
    private String binarioProgrammatoArrivoCodice;
    private String binarioProgrammatoArrivoDescrizione;
    private String binarioEffettivoPartenzaCodice;
    private String binarioEffettivoPartenzaTipo;
    private String binarioEffettivoPartenzaDescrizione;
    private String binarioProgrammatoPartenzaCodice;
    private String binarioProgrammatoPartenzaDescrizione;
    private String tipoFermata;
    private boolean visualizzaPrevista;
    private boolean nextChanged;
    private int nextTrattaType;
    private int actualFermataType;
    private String materiale_label;
    private boolean arrive;
    private boolean departure;
    public FermateBean() {
    }

    public Object getOrientamento() {
        return orientamento;
    }

    public void setOrientamento(Object orientamento) {
        this.orientamento = orientamento;
    }

    public Object getKcNumTreno() {
        return kcNumTreno;
    }

    public void setKcNumTreno(Object kcNumTreno) {
        this.kcNumTreno = kcNumTreno;
    }

    public String getStazione() {
        return stazione;
    }

    public void setStazione(String stazione) {
        this.stazione = stazione;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getListaCorrispondenze() {
        return listaCorrispondenze;
    }

    public void setListaCorrispondenze(String listaCorrispondenze) {
        this.listaCorrispondenze = listaCorrispondenze;
    }

    public long getProgrammata() {
        return programmata;
    }

    public void setProgrammata(long programmata) {
        this.programmata = programmata;
    }

    public String getProgrammataZero() {
        return programmataZero;
    }

    public void setProgrammataZero(String programmataZero) {
        this.programmataZero = programmataZero;
    }

    public long getEffettiva() {
        return effettiva;
    }

    public void setEffettiva(long effettiva) {
        this.effettiva = effettiva;
    }

    public int getRitardo() {
        return ritardo;
    }

    public void setRitardo(int ritardo) {
        this.ritardo = ritardo;
    }

    public String getPartenzaTeoricaZero() {
        return partenzaTeoricaZero;
    }

    public void setPartenzaTeoricaZero(String partenzaTeoricaZero) {
        this.partenzaTeoricaZero = partenzaTeoricaZero;
    }

    public String getArrivoTeoricoZero() {
        return arrivoTeoricoZero;
    }

    public void setArrivoTeoricoZero(String arrivoTeoricoZero) {
        this.arrivoTeoricoZero = arrivoTeoricoZero;
    }

    public Long getPartenza_teorica() {
        return partenza_teorica;
    }

    public void setPartenza_teorica(Long partenza_teorica) {
        this.partenza_teorica = partenza_teorica;
    }

    public Long getArrivo_teorico() {
        return arrivo_teorico;
    }

    public void setArrivo_teorico(Long arrivo_teorico) {
        this.arrivo_teorico = arrivo_teorico;
    }

    public boolean isNextChanged() {
        return isNextChanged;
    }

    public void setNextChanged(boolean nextChanged) {
        isNextChanged = nextChanged;
    }

    public int getNextTrattaType() {
        return nextTrattaType;
    }

    public void setNextTrattaType(int nextTrattaType) {
        this.nextTrattaType = nextTrattaType;
    }

    public int getActualFermataType() {
        return actualFermataType;
    }

    public void setActualFermataType(int actualFermataType) {
        this.actualFermataType = actualFermataType;
    }

    public String getMateriale_label() {
        return materiale_label;
    }

    public void setMateriale_label(String materiale_label) {
        this.materiale_label = materiale_label;
    }

    public long getPartenzaReale() {
        return partenzaReale;
    }

    public void setPartenzaReale(long partenzaReale) {
        this.partenzaReale = partenzaReale;
    }

    public String getArrivoReale() {
        return arrivoReale;
    }

    public void setArrivoReale(String arrivoReale) {
        this.arrivoReale = arrivoReale;
    }

    public int getRitardoPartenza() {
        return ritardoPartenza;
    }

    public void setRitardoPartenza(int ritardoPartenza) {
        this.ritardoPartenza = ritardoPartenza;
    }

    public int getRitardoArrivo() {
        return ritardoArrivo;
    }

    public void setRitardoArrivo(int ritardoArrivo) {
        this.ritardoArrivo = ritardoArrivo;
    }

    public int getProgressivo() {
        return progressivo;
    }

    public void setProgressivo(int progressivo) {
        this.progressivo = progressivo;
    }

    public String getBinarioEffettivoArrivoCodice() {
        return binarioEffettivoArrivoCodice;
    }

    public void setBinarioEffettivoArrivoCodice(String binarioEffettivoArrivoCodice) {
        this.binarioEffettivoArrivoCodice = binarioEffettivoArrivoCodice;
    }

    public String getBinarioEffettivoArrivoTipo() {
        return binarioEffettivoArrivoTipo;
    }

    public void setBinarioEffettivoArrivoTipo(String binarioEffettivoArrivoTipo) {
        this.binarioEffettivoArrivoTipo = binarioEffettivoArrivoTipo;
    }

    public String getBinarioEffettivoArrivoDescrizione() {
        return binarioEffettivoArrivoDescrizione;
    }

    public void setBinarioEffettivoArrivoDescrizione(String binarioEffettivoArrivoDescrizione) {
        this.binarioEffettivoArrivoDescrizione = binarioEffettivoArrivoDescrizione;
    }

    public String getBinarioProgrammatoArrivoCodice() {
        return binarioProgrammatoArrivoCodice;
    }

    public void setBinarioProgrammatoArrivoCodice(String binarioProgrammatoArrivoCodice) {
        this.binarioProgrammatoArrivoCodice = binarioProgrammatoArrivoCodice;
    }

    public String getBinarioProgrammatoArrivoDescrizione() {
        return binarioProgrammatoArrivoDescrizione;
    }

    public void setBinarioProgrammatoArrivoDescrizione(String binarioProgrammatoArrivoDescrizione) {
        this.binarioProgrammatoArrivoDescrizione = binarioProgrammatoArrivoDescrizione;
    }

    public String getBinarioEffettivoPartenzaCodice() {
        return binarioEffettivoPartenzaCodice;
    }

    public void setBinarioEffettivoPartenzaCodice(String binarioEffettivoPartenzaCodice) {
        this.binarioEffettivoPartenzaCodice = binarioEffettivoPartenzaCodice;
    }

    public String getBinarioEffettivoPartenzaTipo() {
        return binarioEffettivoPartenzaTipo;
    }

    public void setBinarioEffettivoPartenzaTipo(String binarioEffettivoPartenzaTipo) {
        this.binarioEffettivoPartenzaTipo = binarioEffettivoPartenzaTipo;
    }

    public String getBinarioEffettivoPartenzaDescrizione() {
        return binarioEffettivoPartenzaDescrizione;
    }

    public void setBinarioEffettivoPartenzaDescrizione(String binarioEffettivoPartenzaDescrizione) {
        this.binarioEffettivoPartenzaDescrizione = binarioEffettivoPartenzaDescrizione;
    }

    public String getBinarioProgrammatoPartenzaCodice() {
        return binarioProgrammatoPartenzaCodice;
    }

    public void setBinarioProgrammatoPartenzaCodice(String binarioProgrammatoPartenzaCodice) {
        this.binarioProgrammatoPartenzaCodice = binarioProgrammatoPartenzaCodice;
    }

    public String getBinarioProgrammatoPartenzaDescrizione() {
        return binarioProgrammatoPartenzaDescrizione;
    }

    public void setBinarioProgrammatoPartenzaDescrizione(String binarioProgrammatoPartenzaDescrizione) {
        this.binarioProgrammatoPartenzaDescrizione = binarioProgrammatoPartenzaDescrizione;
    }

    public String getTipoFermata() {
        return tipoFermata;
    }

    public void setTipoFermata(String tipoFermata) {
        this.tipoFermata = tipoFermata;
    }

    public boolean isVisualizzaPrevista() {
        return visualizzaPrevista;
    }

    public void setVisualizzaPrevista(boolean visualizzaPrevista) {
        this.visualizzaPrevista = visualizzaPrevista;
    }

    public String setTimeArr(){
        if (this.getArrivo_teorico() == null) return "-";
        return DateConverter.millisecondsToDateView(this.getArrivo_teorico());
    }

    public String setTimeDep(){
        if (this.getPartenza_teorica() == null) return "-";
        return DateConverter.millisecondsToDateView(this.getPartenza_teorica());
    }

    public boolean isArrive() {
        return arrive;
    }

    public void setArrive(boolean arrive) {
        this.arrive = arrive;
    }

    public boolean isDeparture() {
        return departure;
    }

    public void setDeparture(boolean departure) {
        this.departure = departure;
    }
}