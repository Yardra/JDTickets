package com.yardra.jdtickets;

import java.io.Serializable;

public class user implements Serializable {

    private String ID;
    private String PlaceFrom;
    private String TimeFrom;
    private String PlaceTo;
    private String TimeTo;
    private String Cost;

    public user(String ID, String placeFrom, String timeFrom, String placeTo, String timeTo, String cost) {
        this.ID = ID;
        PlaceFrom = placeFrom;
        TimeFrom = timeFrom;
        PlaceTo = placeTo;
        TimeTo = timeTo;
        Cost = cost;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPlaceFrom() {
        return PlaceFrom;
    }

    public void setPlaceFrom(String placeFrom) {
        PlaceFrom = placeFrom;
    }

    public String getTimeFrom() {
        return TimeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        TimeFrom = timeFrom;
    }

    public String getPlaceTo() {
        return PlaceTo;
    }

    public void setPlaceTo(String placeTo) {
        PlaceTo = placeTo;
    }

    public String getTimeTo() {
        return TimeTo;
    }

    public void setTimeTo(String timeTo) {
        TimeTo = timeTo;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String cost) {
        Cost = cost;
    }
}
