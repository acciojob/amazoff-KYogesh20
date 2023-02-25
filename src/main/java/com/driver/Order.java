package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
        this.id=id;
        String time[]= deliveryTime.split(":");
        int hour=Integer.valueOf(time[0]);
        int min= Integer.valueOf(time[1]);
        this.deliveryTime = (hour*60) + min;

    }

    public String getId() {

        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    public static String getDeliveryTimeAsString(int timeInt){
        int hours=timeInt/60;
        int min=timeInt%60;
        String hrStr="";
        String minStr="";

        if(hours<10){
            hrStr="0"+hours;
        }
        else{
            hrStr=""+hours;
        }

        if(min<10){
            minStr="0"+min;
        }
        else{
            minStr=""+min;
        }

        return hrStr+":"+minStr;
    }

    public static int getDeliveryTimeAsInt(String timeString){

        return (Integer.parseInt(timeString.substring(0,2)) * 60 )+
                Integer.parseInt(timeString.substring(3) );
    }
}