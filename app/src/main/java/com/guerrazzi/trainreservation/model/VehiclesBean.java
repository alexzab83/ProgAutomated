package com.guerrazzi.trainreservation.model;

public class VehiclesBean {
    /**
     * origine : Pesaro
     * destinazione : Cesena
     * orarioPartenza : 2019-10-27T11:19:00
     * orarioArrivo : 2019-10-27T12:05:00
     * categoria : 204
     * categoriaDescrizione : IC
     * numeroTreno : 606
     */

    private String origine;
    private String destinazione;
    private String orarioPartenza;
    private String orarioArrivo;
    private String categoria;
    private String categoriaDescrizione;
    private String numeroTreno;

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

    public String getOrarioPartenza() {
        return orarioPartenza;
    }

    public void setOrarioPartenza(String orarioPartenza) {
        this.orarioPartenza = orarioPartenza;
    }

    public String getOrarioArrivo() {
        return orarioArrivo;
    }

    public void setOrarioArrivo(String orarioArrivo) {
        this.orarioArrivo = orarioArrivo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoriaDescrizione() {
        return categoriaDescrizione;
    }

    public void setCategoriaDescrizione(String categoriaDescrizione) {
        this.categoriaDescrizione = categoriaDescrizione;
    }

    public String getNumeroTreno() {
        return numeroTreno;
    }

    public void setNumeroTreno(String numeroTreno) {
        this.numeroTreno = numeroTreno;
    }
}
