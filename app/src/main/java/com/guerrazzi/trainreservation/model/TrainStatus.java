package com.guerrazzi.trainreservation.model;

import java.util.List;

public class TrainStatus {
    /**
     * tipoTreno : PG
     * orientamento : null
     * codiceCliente : 2
     * fermateSoppresse : null
     * dataPartenza : null
     * fermate : [{"orientamento":null,"kcNumTreno":null,"stazione":"VENTIMIGLIA","id":"S04501","listaCorrispondenze":null,"programmata":1572235920000,"programmataZero":null,"effettiva":1572236010000,"ritardo":2,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572235920000,"arrivo_teorico":null,"isNextChanged":false,"partenzaReale":1572236010000,"arrivoReale":null,"ritardoPartenza":2,"ritardoArrivo":0,"progressivo":1,"binarioEffettivoArrivoCodice":null,"binarioEffettivoArrivoTipo":null,"binarioEffettivoArrivoDescrizione":null,"binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":null,"binarioEffettivoPartenzaCodice":"11","binarioEffettivoPartenzaTipo":"0","binarioEffettivoPartenzaDescrizione":"1","binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"1","tipoFermata":"P","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"BORDIGHERA","id":"S04503","listaCorrispondenze":null,"programmata":1572236280000,"programmataZero":null,"effettiva":1572236400000,"ritardo":2,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572236340000,"arrivo_teorico":1572236280000,"isNextChanged":false,"partenzaReale":1572236520000,"arrivoReale":1572236400000,"ritardoPartenza":3,"ritardoArrivo":2,"progressivo":3,"binarioEffettivoArrivoCodice":"255","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"1","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"1","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"1","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"SANREMO","id":"S04505","listaCorrispondenze":null,"programmata":1572236760000,"programmataZero":null,"effettiva":1572236940000,"ritardo":3,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572236820000,"arrivo_teorico":1572236760000,"isNextChanged":false,"partenzaReale":1572237060000,"arrivoReale":1572236940000,"ritardoPartenza":4,"ritardoArrivo":3,"progressivo":4,"binarioEffettivoArrivoCodice":"1030","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"2","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"2","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"2","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"TAGGIA ARMA","id":"S04506","listaCorrispondenze":null,"programmata":1572237120000,"programmataZero":null,"effettiva":1572237240000,"ritardo":2,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572237180000,"arrivo_teorico":1572237120000,"isNextChanged":false,"partenzaReale":1572237360000,"arrivoReale":1572237240000,"ritardoPartenza":3,"ritardoArrivo":2,"progressivo":5,"binarioEffettivoArrivoCodice":"484","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"3","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"3","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"3","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"IMPERIA","id":"S04523","listaCorrispondenze":null,"programmata":1572237720000,"programmataZero":null,"effettiva":1572237750000,"ritardo":1,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572237780000,"arrivo_teorico":1572237720000,"isNextChanged":false,"partenzaReale":1572237900000,"arrivoReale":1572237750000,"ritardoPartenza":2,"ritardoArrivo":1,"progressivo":6,"binarioEffettivoArrivoCodice":"219","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"3","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"3","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"3","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"DIANO","id":"S04524","listaCorrispondenze":null,"programmata":1572238020000,"programmataZero":null,"effettiva":1572238140000,"ritardo":2,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572238080000,"arrivo_teorico":1572238020000,"isNextChanged":false,"partenzaReale":1572238260000,"arrivoReale":1572238140000,"ritardoPartenza":3,"ritardoArrivo":2,"progressivo":7,"binarioEffettivoArrivoCodice":"1037","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"2","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"2","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"2","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"ALASSIO","id":"S04515","listaCorrispondenze":null,"programmata":1572238680000,"programmataZero":null,"effettiva":1572238710000,"ritardo":1,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572238740000,"arrivo_teorico":1572238680000,"isNextChanged":false,"partenzaReale":1572238890000,"arrivoReale":1572238710000,"ritardoPartenza":3,"ritardoArrivo":1,"progressivo":10,"binarioEffettivoArrivoCodice":"176","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"3","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"3","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"3","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"ALBENGA","id":"S04516","listaCorrispondenze":null,"programmata":1572239100000,"programmataZero":null,"effettiva":1572239310000,"ritardo":4,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572239160000,"arrivo_teorico":1572239100000,"isNextChanged":false,"partenzaReale":1572239520000,"arrivoReale":1572239310000,"ritardoPartenza":6,"ritardoArrivo":4,"progressivo":11,"binarioEffettivoArrivoCodice":"135","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"2","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"2","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"2","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"LOANO","id":"S04519","listaCorrispondenze":null,"programmata":1572239460000,"programmataZero":null,"effettiva":1572239820000,"ritardo":6,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572239520000,"arrivo_teorico":1572239460000,"isNextChanged":false,"partenzaReale":1572240780000,"arrivoReale":1572239820000,"ritardoPartenza":21,"ritardoArrivo":6,"progressivo":14,"binarioEffettivoArrivoCodice":"369","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"2","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"2","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"2","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"PIETRA LIGURE","id":"S04520","listaCorrispondenze":null,"programmata":1572239700000,"programmataZero":null,"effettiva":1572240930000,"ritardo":21,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572239760000,"arrivo_teorico":1572239700000,"isNextChanged":false,"partenzaReale":1572241080000,"arrivoReale":1572240930000,"ritardoPartenza":22,"ritardoArrivo":21,"progressivo":15,"binarioEffettivoArrivoCodice":"469","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"1","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"1","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"1","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"FINALE LIGURE MARINA","id":"S04522","listaCorrispondenze":null,"programmata":1572240120000,"programmataZero":null,"effettiva":1572241320000,"ritardo":20,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572240180000,"arrivo_teorico":1572240120000,"isNextChanged":false,"partenzaReale":1572241440000,"arrivoReale":1572241320000,"ritardoPartenza":21,"ritardoArrivo":20,"progressivo":17,"binarioEffettivoArrivoCodice":"550","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"3","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"3","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"3","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"SPOTORNO NOLI","id":"S04526","listaCorrispondenze":null,"programmata":1572240540000,"programmataZero":null,"effettiva":1572241710000,"ritardo":20,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572240600000,"arrivo_teorico":1572240540000,"isNextChanged":false,"partenzaReale":1572241830000,"arrivoReale":1572241710000,"ritardoPartenza":21,"ritardoArrivo":20,"progressivo":18,"binarioEffettivoArrivoCodice":"205","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"3","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"3","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"3","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"SAVONA","id":"S04801","listaCorrispondenze":null,"programmata":1572241320000,"programmataZero":null,"effettiva":1572242190000,"ritardo":15,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572241500000,"arrivo_teorico":1572241320000,"isNextChanged":false,"partenzaReale":1572242370000,"arrivoReale":1572242190000,"ritardoPartenza":15,"ritardoArrivo":15,"progressivo":21,"binarioEffettivoArrivoCodice":"272","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"3","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"3","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"3","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"VARAZZE","id":"S04531","listaCorrispondenze":null,"programmata":1572241980000,"programmataZero":null,"effettiva":1572242640000,"ritardo":11,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572242040000,"arrivo_teorico":1572241980000,"isNextChanged":false,"partenzaReale":1572242790000,"arrivoReale":1572242640000,"ritardoPartenza":13,"ritardoArrivo":11,"progressivo":24,"binarioEffettivoArrivoCodice":null,"binarioEffettivoArrivoTipo":null,"binarioEffettivoArrivoDescrizione":null,"binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"3","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"3","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"COGOLETO","id":"S04532","listaCorrispondenze":null,"programmata":1572242400000,"programmataZero":null,"effettiva":1572242970000,"ritardo":10,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572242460000,"arrivo_teorico":1572242400000,"isNextChanged":false,"partenzaReale":1572243150000,"arrivoReale":1572242970000,"ritardoPartenza":12,"ritardoArrivo":10,"progressivo":25,"binarioEffettivoArrivoCodice":null,"binarioEffettivoArrivoTipo":null,"binarioEffettivoArrivoDescrizione":null,"binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"3","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"3","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"ARENZANO","id":"S04533","listaCorrispondenze":null,"programmata":1572242640000,"programmataZero":null,"effettiva":1572243210000,"ritardo":10,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572242700000,"arrivo_teorico":1572242640000,"isNextChanged":false,"partenzaReale":1572243810000,"arrivoReale":1572243210000,"ritardoPartenza":19,"ritardoArrivo":10,"progressivo":26,"binarioEffettivoArrivoCodice":null,"binarioEffettivoArrivoTipo":null,"binarioEffettivoArrivoDescrizione":null,"binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"2","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"2","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"GENOVA VOLTRI","id":"S04534","listaCorrispondenze":null,"programmata":1572243120000,"programmataZero":null,"effettiva":1572244080000,"ritardo":16,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572243180000,"arrivo_teorico":1572243120000,"isNextChanged":false,"partenzaReale":1572244290000,"arrivoReale":1572244080000,"ritardoPartenza":19,"ritardoArrivo":16,"progressivo":28,"binarioEffettivoArrivoCodice":"7","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"2","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"2","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"2","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"GENOVA SESTRI PONENTE","id":"S04537","listaCorrispondenze":null,"programmata":1572243720000,"programmataZero":null,"effettiva":1572244530000,"ritardo":14,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572243780000,"arrivo_teorico":1572243720000,"isNextChanged":false,"partenzaReale":1572244740000,"arrivoReale":1572244530000,"ritardoPartenza":16,"ritardoArrivo":14,"progressivo":34,"binarioEffettivoArrivoCodice":"367","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"1","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"1","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"1","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"GENOVA SAMPIERDARENA","id":"S04220","listaCorrispondenze":null,"programmata":1572244260000,"programmataZero":null,"effettiva":1572244890000,"ritardo":11,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572244320000,"arrivo_teorico":1572244260000,"isNextChanged":false,"partenzaReale":1572245100000,"arrivoReale":1572244890000,"ritardoPartenza":13,"ritardoArrivo":11,"progressivo":37,"binarioEffettivoArrivoCodice":"255","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"5","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"5","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"5","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"GENOVA P.PRINCIPE","id":"S04700","listaCorrispondenze":null,"programmata":1572244680000,"programmataZero":null,"effettiva":1572245370000,"ritardo":12,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572245400000,"arrivo_teorico":1572244680000,"isNextChanged":false,"partenzaReale":1572245940000,"arrivoReale":1572245370000,"ritardoPartenza":9,"ritardoArrivo":12,"progressivo":38,"binarioEffettivoArrivoCodice":"419","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"18","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"17","binarioEffettivoPartenzaCodice":"419","binarioEffettivoPartenzaTipo":"0","binarioEffettivoPartenzaDescrizione":"18","binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"17","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"ARQUATA SCRIVIA","id":"S04207","listaCorrispondenze":null,"programmata":1572247020000,"programmataZero":null,"effettiva":1572247830000,"ritardo":14,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572247080000,"arrivo_teorico":1572247020000,"isNextChanged":false,"partenzaReale":1572247980000,"arrivoReale":1572247830000,"ritardoPartenza":15,"ritardoArrivo":14,"progressivo":46,"binarioEffettivoArrivoCodice":"243","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"1","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"1","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"1","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"TORTONA","id":"S01810","listaCorrispondenze":null,"programmata":1572247860000,"programmataZero":null,"effettiva":1572248820000,"ritardo":16,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572247920000,"arrivo_teorico":1572247860000,"isNextChanged":false,"partenzaReale":1572248940000,"arrivoReale":1572248820000,"ritardoPartenza":17,"ritardoArrivo":16,"progressivo":48,"binarioEffettivoArrivoCodice":"0","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"3","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"3","binarioEffettivoPartenzaCodice":"0","binarioEffettivoPartenzaTipo":"0","binarioEffettivoPartenzaDescrizione":"3","binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"3","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"VOGHERA","id":"S01807","listaCorrispondenze":null,"programmata":1572248460000,"programmataZero":null,"effettiva":1572249450000,"ritardo":17,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572248580000,"arrivo_teorico":1572248460000,"isNextChanged":false,"partenzaReale":1572249630000,"arrivoReale":1572249450000,"ritardoPartenza":18,"ritardoArrivo":17,"progressivo":50,"binarioEffettivoArrivoCodice":"0","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"5","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"5","binarioEffettivoPartenzaCodice":"0","binarioEffettivoPartenzaTipo":"0","binarioEffettivoPartenzaDescrizione":"5","binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"5","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"PAVIA","id":"S01860","listaCorrispondenze":null,"programmata":1572249540000,"programmataZero":null,"effettiva":1572250410000,"ritardo":15,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572249660000,"arrivo_teorico":1572249540000,"isNextChanged":false,"partenzaReale":1572250560000,"arrivoReale":1572250410000,"ritardoPartenza":15,"ritardoArrivo":15,"progressivo":55,"binarioEffettivoArrivoCodice":"0","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"3","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"3","binarioEffettivoPartenzaCodice":"0","binarioEffettivoPartenzaTipo":"0","binarioEffettivoPartenzaDescrizione":"3","binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"3","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"MILANO ROGOREDO","id":"S01820","listaCorrispondenze":null,"programmata":1572250800000,"programmataZero":null,"effettiva":1572251490000,"ritardo":12,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572250920000,"arrivo_teorico":1572250800000,"isNextChanged":false,"partenzaReale":1572251640000,"arrivoReale":1572251490000,"ritardoPartenza":12,"ritardoArrivo":12,"progressivo":60,"binarioEffettivoArrivoCodice":"0","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"5","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"5","binarioEffettivoPartenzaCodice":"5270","binarioEffettivoPartenzaTipo":"0","binarioEffettivoPartenzaDescrizione":"5","binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"5","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"MILANO LAMBRATE","id":"S01701","listaCorrispondenze":null,"programmata":1572251340000,"programmataZero":null,"effettiva":1572251910000,"ritardo":10,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":1572251460000,"arrivo_teorico":1572251340000,"isNextChanged":false,"partenzaReale":1572252090000,"arrivoReale":1572251910000,"ritardoPartenza":11,"ritardoArrivo":10,"progressivo":61,"binarioEffettivoArrivoCodice":"4209","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"12","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"12","binarioEffettivoPartenzaCodice":"4622","binarioEffettivoPartenzaTipo":"0","binarioEffettivoPartenzaDescrizione":"12","binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":"12","tipoFermata":"F","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":0,"actualFermataType":1,"materiale_label":null},{"orientamento":null,"kcNumTreno":null,"stazione":"MILANO CENTRALE","id":"S01700","listaCorrispondenze":null,"programmata":1572252000000,"programmataZero":null,"effettiva":1572252480000,"ritardo":8,"partenzaTeoricaZero":null,"arrivoTeoricoZero":null,"partenza_teorica":null,"arrivo_teorico":1572252000000,"isNextChanged":false,"partenzaReale":null,"arrivoReale":1572252480000,"ritardoPartenza":0,"ritardoArrivo":8,"progressivo":62,"binarioEffettivoArrivoCodice":"1931","binarioEffettivoArrivoTipo":"0","binarioEffettivoArrivoDescrizione":"22","binarioProgrammatoArrivoCodice":null,"binarioProgrammatoArrivoDescrizione":"22","binarioEffettivoPartenzaCodice":null,"binarioEffettivoPartenzaTipo":null,"binarioEffettivoPartenzaDescrizione":null,"binarioProgrammatoPartenzaCodice":null,"binarioProgrammatoPartenzaDescrizione":null,"tipoFermata":"A","visualizzaPrevista":true,"nextChanged":false,"nextTrattaType":2,"actualFermataType":1,"materiale_label":null}]
     * anormalita : null
     * provvedimenti : null
     * segnalazioni : null
     * oraUltimoRilevamento : 1572252480000
     * stazioneUltimoRilevamento : MILANO CENTRALE
     * idDestinazione : S01700
     * idOrigine : S04501
     * cambiNumero : [{"nuovoNumeroTreno":"2184","stazione":"GENOVA P.PRINCIPE"}]
     * hasProvvedimenti : false
     * descOrientamento : ["--","--","--","--","--","--","--","--","--"]
     * compOraUltimoRilevamento : 09:48
     * motivoRitardoPrevalente : null
     * descrizioneVCO :
     * materiale_label : null
     * numeroTreno : 2183
     * categoria : REG
     * categoriaDescrizione : null
     * origine : VENTIMIGLIA
     * codOrigine : null
     * destinazione : MILANO CENTRALE
     * codDestinazione : null
     * origineEstera : null
     * destinazioneEstera : null
     * oraPartenzaEstera : null
     * oraArrivoEstera : null
     * tratta : 0
     * regione : 0
     * origineZero : VENTIMIGLIA
     * destinazioneZero : MILANO CENTRALE
     * orarioPartenzaZero : 1572235920000
     * orarioArrivoZero : 1572252000000
     * circolante : true
     * binarioEffettivoArrivoCodice : null
     * binarioEffettivoArrivoDescrizione : null
     * binarioEffettivoArrivoTipo : null
     * binarioProgrammatoArrivoCodice : null
     * binarioProgrammatoArrivoDescrizione : null
     * binarioEffettivoPartenzaCodice : null
     * binarioEffettivoPartenzaDescrizione : null
     * binarioEffettivoPartenzaTipo : null
     * binarioProgrammatoPartenzaCodice : null
     * binarioProgrammatoPartenzaDescrizione : null
     * subTitle :
     * esisteCorsaZero : 0
     * inStazione : false
     * haCambiNumero : false
     * nonPartito : false
     * provvedimento : 0
     * riprogrammazione : null
     * orarioPartenza : 1572235920000
     * orarioArrivo : 1572252000000
     * stazionePartenza : null
     * stazioneArrivo : null
     * statoTreno : null
     * corrispondenze : null
     * servizi : []
     * ritardo : 8
     * tipoProdotto :
     * compOrarioPartenzaZeroEffettivo : 05:20
     * compOrarioArrivoZeroEffettivo : 09:48
     * compOrarioPartenzaZero : 05:12
     * compOrarioArrivoZero : 09:40
     * compOrarioArrivo : 09:40
     * compOrarioPartenza : 05:12
     * compNumeroTreno : REG 2183
     * compOrientamento : ["--","--","--","--","--","--","--","--","--"]
     * compTipologiaTreno : regionale
     * compClassRitardoTxt : ritardo01_txt
     * compClassRitardoLine : ritardo01_line
     * compImgRitardo2 : /vt_static/img/legenda/icone_legenda/ritardo01.png
     * compImgRitardo : /vt_static/img/legenda/icone_legenda/ritardo01.png
     * compRitardo : ["ritardo 8 min.","delay 8 min.","Versp&#228;tung 8 Min.","retard de 8 min.","retraso de 8 min.","&icirc;nt&acirc;rziere 8 min.","遅延 8 分","误点 8分钟","опоздание на 8 минут"]
     * compRitardoAndamento : ["con un ritardo di 8 min.","8 minutes late","mit einer Verz&#246;gerung von 8 Min.","avec un retard de 8 min.","con un retraso de 8 min.","cu o &icirc;nt&acirc;rziere de 8 min.","8 分の遅延","误点 8分钟","с опозданием в 8 минут"]
     * compInStazionePartenza : ["","","","","","","","",""]
     * compInStazioneArrivo : ["","","","","","","","",""]
     * compOrarioEffettivoArrivo : /vt_static/img/legenda/icone_legenda/regolare.png09:48
     * compDurata : 4:28
     * compImgCambiNumerazione : &nbsp;&nbsp;
     */

    private String tipoTreno;
    private String orientamento;
    private int codiceCliente;
    private String dataPartenza;
    private String anormalita;
    private String provvedimenti;
    private String segnalazioni;
    private long oraUltimoRilevamento;
    private String stazioneUltimoRilevamento;
    private String idDestinazione;
    private String idOrigine;
    private boolean hasProvvedimenti;
    private String compOraUltimoRilevamento;
    private Object motivoRitardoPrevalente;
    private String descrizioneVCO;
    private Object materiale_label;
    private int numeroTreno;
    private String categoria;
    private String categoriaDescrizione;
    private String origine;
    private String codOrigine;
    private String destinazione;
    private String codDestinazione;
    private String origineEstera;
    private String destinazioneEstera;
    private String oraPartenzaEstera;
    private String oraArrivoEstera;
    private int tratta;
    private int regione;
    private String origineZero;
    private String destinazioneZero;
    private long orarioPartenzaZero;
    private long orarioArrivoZero;
    private boolean circolante;
    private String binarioEffettivoArrivoCodice;
    private String binarioEffettivoArrivoDescrizione;
    private String binarioEffettivoArrivoTipo;
    private String binarioProgrammatoArrivoCodice;
    private String binarioProgrammatoArrivoDescrizione;
    private String binarioEffettivoPartenzaCodice;
    private String binarioEffettivoPartenzaDescrizione;
    private String binarioEffettivoPartenzaTipo;
    private String binarioProgrammatoPartenzaCodice;
    private String binarioProgrammatoPartenzaDescrizione;
    private String subTitle;
    private String esisteCorsaZero;
    private boolean inStazione;
    private boolean haCambiNumero;
    private boolean nonPartito;
    private int provvedimento;
    private Object riprogrammazione;
    private long orarioPartenza;
    private long orarioArrivo;
    private String stazionePartenza;
    private String stazioneArrivo;
    private String statoTreno;
    private String corrispondenze;
    private int ritardo;
    private String tipoProdotto;
    private String compOrarioPartenzaZeroEffettivo;
    private String compOrarioArrivoZeroEffettivo;
    private String compOrarioPartenzaZero;
    private String compOrarioArrivoZero;
    private String compOrarioArrivo;
    private String compOrarioPartenza;
    private String compNumeroTreno;
    private String compTipologiaTreno;
    private String compClassRitardoTxt;
    private String compClassRitardoLine;
    private String compImgRitardo2;
    private String compImgRitardo;
    private String compOrarioEffettivoArrivo;
    private String compDurata;
    private String compImgCambiNumerazione;
    private List<FermateBean> fermate;
    private List<CambiNumeroBean> cambiNumero;
    private List<String> descOrientamento;
    private List<?> servizi;
    private List<String> compOrientamento;
    private List<String> compRitardo;
    private List<String> compRitardoAndamento;
    private List<String> compInStazionePartenza;
    private List<String> compInStazioneArrivo;

    public TrainStatus() {
    }

    public String getTipoTreno() {
        return tipoTreno;
    }

    public void setTipoTreno(String tipoTreno) {
        this.tipoTreno = tipoTreno;
    }

    public String getOrientamento() {
        return orientamento;
    }

    public void setOrientamento(String orientamento) {
        this.orientamento = orientamento;
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(int codiceCliente) {
        this.codiceCliente = codiceCliente;
    }


    public String getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(String dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public String getAnormalita() {
        return anormalita;
    }

    public void setAnormalita(String anormalita) {
        this.anormalita = anormalita;
    }

    public String getProvvedimenti() {
        return provvedimenti;
    }

    public void setProvvedimenti(String provvedimenti) {
        this.provvedimenti = provvedimenti;
    }

    public String getSegnalazioni() {
        return segnalazioni;
    }

    public void setSegnalazioni(String segnalazioni) {
        this.segnalazioni = segnalazioni;
    }

    public long getOraUltimoRilevamento() {
        return oraUltimoRilevamento;
    }

    public void setOraUltimoRilevamento(long oraUltimoRilevamento) {
        this.oraUltimoRilevamento = oraUltimoRilevamento;
    }

    public String getStazioneUltimoRilevamento() {
        return stazioneUltimoRilevamento;
    }

    public void setStazioneUltimoRilevamento(String stazioneUltimoRilevamento) {
        this.stazioneUltimoRilevamento = stazioneUltimoRilevamento;
    }

    public String getIdDestinazione() {
        return idDestinazione;
    }

    public void setIdDestinazione(String idDestinazione) {
        this.idDestinazione = idDestinazione;
    }

    public String getIdOrigine() {
        return idOrigine;
    }

    public void setIdOrigine(String idOrigine) {
        this.idOrigine = idOrigine;
    }

    public boolean isHasProvvedimenti() {
        return hasProvvedimenti;
    }

    public void setHasProvvedimenti(boolean hasProvvedimenti) {
        this.hasProvvedimenti = hasProvvedimenti;
    }

    public String getCompOraUltimoRilevamento() {
        return compOraUltimoRilevamento;
    }

    public void setCompOraUltimoRilevamento(String compOraUltimoRilevamento) {
        this.compOraUltimoRilevamento = compOraUltimoRilevamento;
    }

    public Object getMotivoRitardoPrevalente() {
        return motivoRitardoPrevalente;
    }

    public void setMotivoRitardoPrevalente(Object motivoRitardoPrevalente) {
        this.motivoRitardoPrevalente = motivoRitardoPrevalente;
    }

    public String getDescrizioneVCO() {
        return descrizioneVCO;
    }

    public void setDescrizioneVCO(String descrizioneVCO) {
        this.descrizioneVCO = descrizioneVCO;
    }

    public Object getMateriale_label() {
        return materiale_label;
    }

    public void setMateriale_label(Object materiale_label) {
        this.materiale_label = materiale_label;
    }

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

    public String getCategoriaDescrizione() {
        return categoriaDescrizione;
    }

    public void setCategoriaDescrizione(String categoriaDescrizione) {
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

    public String getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public String getCodDestinazione() {
        return codDestinazione;
    }

    public void setCodDestinazione(String codDestinazione) {
        this.codDestinazione = codDestinazione;
    }

    public String getOrigineEstera() {
        return origineEstera;
    }

    public void setOrigineEstera(String origineEstera) {
        this.origineEstera = origineEstera;
    }

    public String getDestinazioneEstera() {
        return destinazioneEstera;
    }

    public void setDestinazioneEstera(String destinazioneEstera) {
        this.destinazioneEstera = destinazioneEstera;
    }

    public String getOraPartenzaEstera() {
        return oraPartenzaEstera;
    }

    public void setOraPartenzaEstera(String oraPartenzaEstera) {
        this.oraPartenzaEstera = oraPartenzaEstera;
    }

    public String getOraArrivoEstera() {
        return oraArrivoEstera;
    }

    public void setOraArrivoEstera(String oraArrivoEstera) {
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

    public String getOrigineZero() {
        return origineZero;
    }

    public void setOrigineZero(String origineZero) {
        this.origineZero = origineZero;
    }

    public String getDestinazioneZero() {
        return destinazioneZero;
    }

    public void setDestinazioneZero(String destinazioneZero) {
        this.destinazioneZero = destinazioneZero;
    }

    public long getOrarioPartenzaZero() {
        return orarioPartenzaZero;
    }

    public void setOrarioPartenzaZero(long orarioPartenzaZero) {
        this.orarioPartenzaZero = orarioPartenzaZero;
    }

    public long getOrarioArrivoZero() {
        return orarioArrivoZero;
    }

    public void setOrarioArrivoZero(long orarioArrivoZero) {
        this.orarioArrivoZero = orarioArrivoZero;
    }

    public boolean isCircolante() {
        return circolante;
    }

    public void setCircolante(boolean circolante) {
        this.circolante = circolante;
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

    public String getBinarioEffettivoPartenzaDescrizione() {
        return binarioEffettivoPartenzaDescrizione;
    }

    public void setBinarioEffettivoPartenzaDescrizione(String binarioEffettivoPartenzaDescrizione) {
        this.binarioEffettivoPartenzaDescrizione = binarioEffettivoPartenzaDescrizione;
    }

    public String getBinarioEffettivoPartenzaTipo() {
        return binarioEffettivoPartenzaTipo;
    }

    public void setBinarioEffettivoPartenzaTipo(String binarioEffettivoPartenzaTipo) {
        this.binarioEffettivoPartenzaTipo = binarioEffettivoPartenzaTipo;
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

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getEsisteCorsaZero() {
        return esisteCorsaZero;
    }

    public void setEsisteCorsaZero(String esisteCorsaZero) {
        this.esisteCorsaZero = esisteCorsaZero;
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

    public Object getRiprogrammazione() {
        return riprogrammazione;
    }

    public void setRiprogrammazione(Object riprogrammazione) {
        this.riprogrammazione = riprogrammazione;
    }

    public long getOrarioPartenza() {
        return orarioPartenza;
    }

    public void setOrarioPartenza(long orarioPartenza) {
        this.orarioPartenza = orarioPartenza;
    }

    public long getOrarioArrivo() {
        return orarioArrivo;
    }

    public void setOrarioArrivo(long orarioArrivo) {
        this.orarioArrivo = orarioArrivo;
    }

    public String getStazionePartenza() {
        return stazionePartenza;
    }

    public void setStazionePartenza(String stazionePartenza) {
        this.stazionePartenza = stazionePartenza;
    }

    public String getStazioneArrivo() {
        return stazioneArrivo;
    }

    public void setStazioneArrivo(String stazioneArrivo) {
        this.stazioneArrivo = stazioneArrivo;
    }

    public String getStatoTreno() {
        return statoTreno;
    }

    public void setStatoTreno(String statoTreno) {
        this.statoTreno = statoTreno;
    }

    public String getCorrispondenze() {
        return corrispondenze;
    }

    public void setCorrispondenze(String corrispondenze) {
        this.corrispondenze = corrispondenze;
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

    public String getCompOrarioPartenzaZeroEffettivo() {
        return compOrarioPartenzaZeroEffettivo;
    }

    public void setCompOrarioPartenzaZeroEffettivo(String compOrarioPartenzaZeroEffettivo) {
        this.compOrarioPartenzaZeroEffettivo = compOrarioPartenzaZeroEffettivo;
    }

    public String getCompOrarioArrivoZeroEffettivo() {
        return compOrarioArrivoZeroEffettivo;
    }

    public void setCompOrarioArrivoZeroEffettivo(String compOrarioArrivoZeroEffettivo) {
        this.compOrarioArrivoZeroEffettivo = compOrarioArrivoZeroEffettivo;
    }

    public String getCompOrarioPartenzaZero() {
        return compOrarioPartenzaZero;
    }

    public void setCompOrarioPartenzaZero(String compOrarioPartenzaZero) {
        this.compOrarioPartenzaZero = compOrarioPartenzaZero;
    }

    public String getCompOrarioArrivoZero() {
        return compOrarioArrivoZero;
    }

    public void setCompOrarioArrivoZero(String compOrarioArrivoZero) {
        this.compOrarioArrivoZero = compOrarioArrivoZero;
    }

    public String getCompOrarioArrivo() {
        return compOrarioArrivo;
    }

    public void setCompOrarioArrivo(String compOrarioArrivo) {
        this.compOrarioArrivo = compOrarioArrivo;
    }

    public String getCompOrarioPartenza() {
        return compOrarioPartenza;
    }

    public void setCompOrarioPartenza(String compOrarioPartenza) {
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

    public List<FermateBean> getFermate() {
        return fermate;
    }

    public void setFermate(List<FermateBean> fermate) {
        this.fermate = fermate;
    }

    public List<CambiNumeroBean> getCambiNumero() {
        return cambiNumero;
    }

    public void setCambiNumero(List<CambiNumeroBean> cambiNumero) {
        this.cambiNumero = cambiNumero;
    }

    public List<String> getDescOrientamento() {
        return descOrientamento;
    }

    public void setDescOrientamento(List<String> descOrientamento) {
        this.descOrientamento = descOrientamento;
    }

    public List<?> getServizi() {
        return servizi;
    }

    public void setServizi(List<?> servizi) {
        this.servizi = servizi;
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
