package com.guerrazzi.trainreservation.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateConverter {

    public static String convertCalendarToIsoFormat(Calendar c){
        Date date = c.getTime();
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("CET"));
        String text = sdf.format(date);
        return text;
    }

    public static String convertCalendarToViewDate(Calendar c){
        Date date = c.getTime();
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        sdf.setTimeZone(TimeZone.getTimeZone("CET"));
        String text = sdf.format(date);
        return text;
    }

    public static String getTimeFromDate(String date){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        DateFormat timeFormat = new SimpleDateFormat("HH:mm");
        String result = "";
        Date d = null;
        try {
            d = df.parse(date);
            return timeFormat.format(d);
        }catch (ParseException e){

        }

        return "";
    }

    public static String getDayFromDate(String date){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        DateFormat timeFormat = new SimpleDateFormat("dd/MM/yyyy");
        String result = "";
        Date d = null;
        try {
            d = df.parse(date);
            return timeFormat.format(d);
        }catch (ParseException e){

        }

        return "";
    }
    public static String millisecondsToDateView(long dateMills){
        Date date = new Date(dateMills);
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println(formatter.format(date));
        return formatter.format(date);
    }


    public static String generateNowDateFormatted(){
        return new SimpleDateFormat("EEE MMM dd yyyy HH:MM:ss", Locale.ENGLISH).format(new Date())+" GMT+0100";
    }
}
