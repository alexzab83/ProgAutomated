package com.guerrazzi.trainreservation.model;

import java.util.List;

public class StationDetails{

    /**
     * numeroTreno : 99439
     * categoria : ES*
     * categoriaDescrizione : null
     * origine : ROMA S.PIETRO
     * codOrigine : S08323
     * destinazione : null
     * codDestinazione : null
     * origineEstera : null
     * destinazioneEstera : null
     * oraPartenzaEstera : null
     * oraArrivoEstera : null
     * tratta : 0
     * regione : 0
     * origineZero : null
     * destinazioneZero : null
     * orarioPartenzaZero : null
     * orarioArrivoZero : null
     * circolante : true
     * codiceCliente : 1
     * binarioEffettivoArrivoCodice : 1925
     * binarioEffettivoArrivoDescrizione : 16
     * binarioEffettivoArrivoTipo : 0
     * binarioProgrammatoArrivoCodice : null
     * binarioProgrammatoArrivoDescrizione : null
     * binarioEffettivoPartenzaCodice : null
     * binarioEffettivoPartenzaDescrizione : null
     * binarioEffettivoPartenzaTipo : null
     * binarioProgrammatoPartenzaCodice : null
     * binarioProgrammatoPartenzaDescrizione : null
     * subTitle : null
     * esisteCorsaZero : null
     * orientamento : null
     * inStazione : true
     * haCambiNumero : true
     * nonPartito : false
     * provvedimento : 0
     * riprogrammazione : N
     * orarioPartenza : null
     * orarioArrivo : 1572546300000
     * stazionePartenza : null
     * stazioneArrivo : null
     * statoTreno : null
     * corrispondenze : null
     * servizi : null
     * ritardo : 0
     * tipoProdotto :
     * compOrarioPartenzaZeroEffettivo : null
     * compOrarioArrivoZeroEffettivo : null
     * compOrarioPartenzaZero : null
     * compOrarioArrivoZero : null
     * compOrarioArrivo : 19:25
     * compOrarioPartenza : null
     * compNumeroTreno : ES* 99439
     * compOrientamento : ["--","--","--","--","--","--","--","--","--"]
     * compTipologiaTreno : nazionale
     * compClassRitardoTxt :
     * compClassRitardoLine : regolare_line
     * compImgRitardo2 :
     * compImgRitardo : /vt_static/img/legenda/icone_legenda/regolare.png
     * compRitardo : ["in orario","on time","p&#252;nktlich","&agrave; l'heure","en horario","conform orarului","定刻","按时","по расписанию"]
     * compRitardoAndamento : ["in orario","on time","p&#252;nktlich","&agrave; l'heure","en horario","conform orarului","定刻","按时","по расписанию"]
     * compInStazionePartenza : ["Partito","Departed","angef&#228;hrt","Partit","Salido","Plecat","発車済","已出发","отправленный"]
     * compInStazioneArrivo : ["Arrivato","Arrived","angekommen","Arriv&eacute;","Llegado","Sosit","到着済","已到达","прибывший"]
     * compOrarioEffettivoArrivo : /vt_static/img/legenda/icone_legenda/regolare.png19:25
     * compDurata :
     * compImgCambiNumerazione : &nbsp;&nbsp;<img src="/vt_static/img/legenda/icone_legenda/numerazioni.png">
     * materiale_label : null
     */

    private int numeroTreno;
    private String categoria;
    private Object categoriaDescrizione;
    private String origine;
    private String codOrigine;
    private Object destinazione;
    private Object codDestinazione;
    private Object origineEstera;
    private Object destinazioneEstera;
    private Object oraPartenzaEstera;
    private Object oraArrivoEstera;
    private int tratta;
    private int regione;
    private Object origineZero;
    private Object destinazioneZero;
    private Object orarioPartenzaZero;
    private Object orarioArrivoZero;
    private boolean circolante;
    private int codiceCliente;
    private String binarioEffettivoArrivoCodice;
    private String binarioEffettivoArrivoDescrizione;
    private String binarioEffettivoArrivoTipo;
    private Object binarioProgrammatoArrivoCodice;
    private Object binarioProgrammatoArrivoDescrizione;
    private Object binarioEffettivoPartenzaCodice;
    private Object binarioEffettivoPartenzaDescrizione;
    private Object binarioEffettivoPartenzaTipo;
    private Object binarioProgrammatoPartenzaCodice;
    private Object binarioProgrammatoPartenzaDescrizione;
    private Object subTitle;
    private Object esisteCorsaZero;
    private Object orientamento;
    private boolean inStazione;
    private boolean haCambiNumero;
    private boolean nonPartito;
    private int provvedimento;
    private String riprogrammazione;
    private Object orarioPartenza;
    private long orarioArrivo;
    private Object stazionePartenza;
    private Object stazioneArrivo;
    private Object statoTreno;
    private Object corrispondenze;
    private Object servizi;
    private int ritardo;
    private String tipoProdotto;
    private Object compOrarioPartenzaZeroEffettivo;
    private Object compOrarioArrivoZeroEffettivo;
    private Object compOrarioPartenzaZero;
    private Object compOrarioArrivoZero;
    private String compOrarioArrivo;
    private Object compOrarioPartenza;
    private String compNumeroTreno;
    private String compTipologiaTreno;
    private String compClassRitardoTxt;
    private String compClassRitardoLine;
    private String compImgRitardo2;
    private String compImgRitardo;
    private String compOrarioEffettivoArrivo;
    private String compDurata;
    private String compImgCambiNumerazione;
    private Object materiale_label;
    private List<String> compOrientamento;
    private List<String> compRitardo;
    private List<String> compRitardoAndamento;
    private List<String> compInStazionePartenza;
    private List<String> compInStazioneArrivo;

    public int getNumeroTreno() {
        return numeroTreno;
    }

    public void setNumeroTreno(int numeroTreno) {
        this.numeroTreno = numeroTreno;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Object getCategoriaDescrizione() {
        return categoriaDescrizione;
    }

    public void setCategoriaDescrizione(Object categoriaDescrizione) {
        this.categoriaDescrizione = categoriaDescrizione;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getCodOrigine() {
        return codOrigine;
    }

    public void setCodOrigine(String codOrigine) {
        this.codOrigine = codOrigine;
    }

    public Object getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(Object destinazione) {
        this.destinazione = destinazione;
    }

    public Object getCodDestinazione() {
        return codDestinazione;
    }

    public void setCodDestinazione(Object codDestinazione) {
        this.codDestinazione = codDestinazione;
    }

    public Object getOrigineEstera() {
        return origineEstera;
    }

    public void setOrigineEstera(Object origineEstera) {
        this.origineEstera = origineEstera;
    }

    public Object getDestinazioneEstera() {
        return destinazioneEstera;
    }

    public void setDestinazioneEstera(Object destinazioneEstera) {
        this.destinazioneEstera = destinazioneEstera;
    }

    public Object getOraPartenzaEstera() {
        return oraPartenzaEstera;
    }

    public void setOraPartenzaEstera(Object oraPartenzaEstera) {
        this.oraPartenzaEstera = oraPartenzaEstera;
    }

    public Object getOraArrivoEstera() {
        return oraArrivoEstera;
    }

    public void setOraArrivoEstera(Object oraArrivoEstera) {
        this.oraArrivoEstera = oraArrivoEstera;
    }

    public int getTratta() {
        return tratta;
    }

    public void setTratta(int tratta) {
        this.tratta = tratta;
    }

    public int getRegione() {
        return regione;
    }

    public void setRegione(int regione) {
        this.regione = regione;
    }

    public Object getOrigineZero() {
        return origineZero;
    }

    public void setOrigineZero(Object origineZero) {
        this.origineZero = origineZero;
    }

    public Object getDestinazioneZero() {
        return destinazioneZero;
    }

    public void setDestinazioneZero(Object destinazioneZero) {
        this.destinazioneZero = destinazioneZero;
    }

    public Object getOrarioPartenzaZero() {
        return orarioPartenzaZero;
    }

    public void setOrarioPartenzaZero(Object orarioPartenzaZero) {
        this.orarioPartenzaZero = orarioPartenzaZero;
    }

    public Object getOrarioArrivoZero() {
        return orarioArrivoZero;
    }

    public void setOrarioArrivoZero(Object orarioArrivoZero) {
        this.orarioArrivoZero = orarioArrivoZero;
    }

    public boolean isCircolante() {
        return circolante;
    }

    public void setCircolante(boolean circolante) {
        this.circolante = circolante;
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(int codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public String getBinarioEffettivoArrivoCodice() {
        return binarioEffettivoArrivoCodice;
    }

    public void setBinarioEffettivoArrivoCodice(String binarioEffettivoArrivoCodice) {
        this.binarioEffettivoArrivoCodice = binarioEffettivoArrivoCodice;
    }

    public String getBinarioEffettivoArrivoDescrizione() {
        return binarioEffettivoArrivoDescrizione;
    }

    public void setBinarioEffettivoArrivoDescrizione(String binarioEffettivoArrivoDescrizione) {
        this.binarioEffettivoArrivoDescrizione = binarioEffettivoArrivoDescrizione;
    }

    public String getBinarioEffettivoArrivoTipo() {
        return binarioEffettivoArrivoTipo;
    }

    public void setBinarioEffettivoArrivoTipo(String binarioEffettivoArrivoTipo) {
        this.binarioEffettivoArrivoTipo = binarioEffettivoArrivoTipo;
    }

    public Object getBinarioProgrammatoArrivoCodice() {
        return binarioProgrammatoArrivoCodice;
    }

    public void setBinarioProgrammatoArrivoCodice(Object binarioProgrammatoArrivoCodice) {
        this.binarioProgrammatoArrivoCodice = binarioProgrammatoArrivoCodice;
    }

    public Object getBinarioProgrammatoArrivoDescrizione() {
        return binarioProgrammatoArrivoDescrizione;
    }

    public void setBinarioProgrammatoArrivoDescrizione(Object binarioProgrammatoArrivoDescrizione) {
        this.binarioProgrammatoArrivoDescrizione = binarioProgrammatoArrivoDescrizione;
    }

    public Object getBinarioEffettivoPartenzaCodice() {
        return binarioEffettivoPartenzaCodice;
    }

    public void setBinarioEffettivoPartenzaCodice(Object binarioEffettivoPartenzaCodice) {
        this.binarioEffettivoPartenzaCodice = binarioEffettivoPartenzaCodice;
    }

    public Object getBinarioEffettivoPartenzaDescrizione() {
        return binarioEffettivoPartenzaDescrizione;
    }

    public void setBinarioEffettivoPartenzaDescrizione(Object binarioEffettivoPartenzaDescrizione) {
        this.binarioEffettivoPartenzaDescrizione = binarioEffettivoPartenzaDescrizione;
    }

    public Object getBinarioEffettivoPartenzaTipo() {
        return binarioEffettivoPartenzaTipo;
    }

    public void setBinarioEffettivoPartenzaTipo(Object binarioEffettivoPartenzaTipo) {
        this.binarioEffettivoPartenzaTipo = binarioEffettivoPartenzaTipo;
    }

    public Object getBinarioProgrammatoPartenzaCodice() {
        return binarioProgrammatoPartenzaCodice;
    }

    public void setBinarioProgrammatoPartenzaCodice(Object binarioProgrammatoPartenzaCodice) {
        this.binarioProgrammatoPartenzaCodice = binarioProgrammatoPartenzaCodice;
    }

    public Object getBinarioProgrammatoPartenzaDescrizione() {
        return binarioProgrammatoPartenzaDescrizione;
    }

    public void setBinarioProgrammatoPartenzaDescrizione(Object binarioProgrammatoPartenzaDescrizione) {
        this.binarioProgrammatoPartenzaDescrizione = binarioProgrammatoPartenzaDescrizione;
    }

    public Object getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(Object subTitle) {
        this.subTitle = subTitle;
    }

    public Object getEsisteCorsaZero() {
        return esisteCorsaZero;
    }

    public void setEsisteCorsaZero(Object esisteCorsaZero) {
        this.esisteCorsaZero = esisteCorsaZero;
    }

    public Object getOrientamento() {
        return orientamento;
    }

    public void setOrientamento(Object orientamento) {
        this.orientamento = orientamento;
    }

    public boolean isInStazione() {
        return inStazione;
    }

    public void setInStazione(boolean inStazione) {
        this.inStazione = inStazione;
    }

    public boolean isHaCambiNumero() {
        return haCambiNumero;
    }

    public void setHaCambiNumero(boolean haCambiNumero) {
        this.haCambiNumero = haCambiNumero;
    }

    public boolean isNonPartito() {
        return nonPartito;
    }

    public void setNonPartito(boolean nonPartito) {
        this.nonPartito = nonPartito;
    }

    public int getProvvedimento() {
        return provvedimento;
    }

    public void setProvvedimento(int provvedimento) {
        this.provvedimento = provvedimento;
    }

    public String getRiprogrammazione() {
        return riprogrammazione;
    }

    public void setRiprogrammazione(String riprogrammazione) {
        this.riprogrammazione = riprogrammazione;
    }

    public Object getOrarioPartenza() {
        return orarioPartenza;
    }

    public void setOrarioPartenza(Object orarioPartenza) {
        this.orarioPartenza = orarioPartenza;
    }

    public long getOrarioArrivo() {
        return orarioArrivo;
    }

    public void setOrarioArrivo(long orarioArrivo) {
        this.orarioArrivo = orarioArrivo;
    }

    public Object getStazionePartenza() {
        return stazionePartenza;
    }

    public void setStazionePartenza(Object stazionePartenza) {
        this.stazionePartenza = stazionePartenza;
    }

    public Object getStazioneArrivo() {
        return stazioneArrivo;
    }

    public void setStazioneArrivo(Object stazioneArrivo) {
        this.stazioneArrivo = stazioneArrivo;
    }

    public Object getStatoTreno() {
        return statoTreno;
    }

    public void setStatoTreno(Object statoTreno) {
        this.statoTreno = statoTreno;
    }

    public Object getCorrispondenze() {
        return corrispondenze;
    }

    public void setCorrispondenze(Object corrispondenze) {
        this.corrispondenze = corrispondenze;
    }

    public Object getServizi() {
        return servizi;
    }

    public void setServizi(Object servizi) {
        this.servizi = servizi;
    }

    public int getRitardo() {
        return ritardo;
    }

    public void setRitardo(int ritardo) {
        this.ritardo = ritardo;
    }

    public String getTipoProdotto() {
        return tipoProdotto;
    }

    public void setTipoProdotto(String tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }

    public Object getCompOrarioPartenzaZeroEffettivo() {
        return compOrarioPartenzaZeroEffettivo;
    }

    public void setCompOrarioPartenzaZeroEffettivo(Object compOrarioPartenzaZeroEffettivo) {
        this.compOrarioPartenzaZeroEffettivo = compOrarioPartenzaZeroEffettivo;
    }

    public Object getCompOrarioArrivoZeroEffettivo() {
        return compOrarioArrivoZeroEffettivo;
    }

    public void setCompOrarioArrivoZeroEffettivo(Object compOrarioArrivoZeroEffettivo) {
        this.compOrarioArrivoZeroEffettivo = compOrarioArrivoZeroEffettivo;
    }

    public Object getCompOrarioPartenzaZero() {
        return compOrarioPartenzaZero;
    }

    public void setCompOrarioPartenzaZero(Object compOrarioPartenzaZero) {
        this.compOrarioPartenzaZero = compOrarioPartenzaZero;
    }

    public Object getCompOrarioArrivoZero() {
        return compOrarioArrivoZero;
    }

    public void setCompOrarioArrivoZero(Object compOrarioArrivoZero) {
        this.compOrarioArrivoZero = compOrarioArrivoZero;
    }

    public String getCompOrarioArrivo() {
        return compOrarioArrivo;
    }

    public void setCompOrarioArrivo(String compOrarioArrivo) {
        this.compOrarioArrivo = compOrarioArrivo;
    }

    public Object getCompOrarioPartenza() {
        return compOrarioPartenza;
    }

    public void setCompOrarioPartenza(Object compOrarioPartenza) {
        this.compOrarioPartenza = compOrarioPartenza;
    }

    public String getCompNumeroTreno() {
        return compNumeroTreno;
    }

    public void setCompNumeroTreno(String compNumeroTreno) {
        this.compNumeroTreno = compNumeroTreno;
    }

    public String getCompTipologiaTreno() {
        return compTipologiaTreno;
    }

    public void setCompTipologiaTreno(String compTipologiaTreno) {
        this.compTipologiaTreno = compTipologiaTreno;
    }

    public String getCompClassRitardoTxt() {
        return compClassRitardoTxt;
    }

    public void setCompClassRitardoTxt(String compClassRitardoTxt) {
        this.compClassRitardoTxt = compClassRitardoTxt;
    }

    public String getCompClassRitardoLine() {
        return compClassRitardoLine;
    }

    public void setCompClassRitardoLine(String compClassRitardoLine) {
        this.compClassRitardoLine = compClassRitardoLine;
    }

    public String getCompImgRitardo2() {
        return compImgRitardo2;
    }

    public void setCompImgRitardo2(String compImgRitardo2) {
        this.compImgRitardo2 = compImgRitardo2;
    }

    public String getCompImgRitardo() {
        return compImgRitardo;
    }

    public void setCompImgRitardo(String compImgRitardo) {
        this.compImgRitardo = compImgRitardo;
    }

    public String getCompOrarioEffettivoArrivo() {
        return compOrarioEffettivoArrivo;
    }

    public void setCompOrarioEffettivoArrivo(String compOrarioEffettivoArrivo) {
        this.compOrarioEffettivoArrivo = compOrarioEffettivoArrivo;
    }

    public String getCompDurata() {
        return compDurata;
    }

    public void setCompDurata(String compDurata) {
        this.compDurata = compDurata;
    }

    public String getCompImgCambiNumerazione() {
        return compImgCambiNumerazione;
    }

    public void setCompImgCambiNumerazione(String compImgCambiNumerazione) {
        this.compImgCambiNumerazione = compImgCambiNumerazione;
    }

    public Object getMateriale_label() {
        return materiale_label;
    }

    public void setMateriale_label(Object materiale_label) {
        this.materiale_label = materiale_label;
    }

    public List<String> getCompOrientamento() {
        return compOrientamento;
    }

    public void setCompOrientamento(List<String> compOrientamento) {
        this.compOrientamento = compOrientamento;
    }

    public List<String> getCompRitardo() {
        return compRitardo;
    }

    public void setCompRitardo(List<String> compRitardo) {
        this.compRitardo = compRitardo;
    }

    public List<String> getCompRitardoAndamento() {
        return compRitardoAndamento;
    }

    public void setCompRitardoAndamento(List<String> compRitardoAndamento) {
        this.compRitardoAndamento = compRitardoAndamento;
    }

    public List<String> getCompInStazionePartenza() {
        return compInStazionePartenza;
    }

    public void setCompInStazionePartenza(List<String> compInStazionePartenza) {
        this.compInStazionePartenza = compInStazionePartenza;
    }

    public List<String> getCompInStazioneArrivo() {
        return compInStazioneArrivo;
    }

    public void setCompInStazioneArrivo(List<String> compInStazioneArrivo) {
        this.compInStazioneArrivo = compInStazioneArrivo;
    }
}
