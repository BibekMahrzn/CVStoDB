package com.me;

/**
 * Created by Just Me on 10/31/2017.
 */
public class Report2 {

    private String Date;
    private String Impressions;
    private String Clicks;
    private String Earning;

    public Report2(String date, String impressions, String clicks, String earning) {
        Date = date;
        Impressions = impressions;
        Clicks = clicks;
        Earning = earning;
    }

    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }
    public String getImpressions() {
        return Impressions;
    }
    public void setImpressions(String impressions) {
        Impressions = impressions;
    }
    public String getClicks() {
        return Clicks;
    }
    public void setClicks(String clicks) {
        Clicks = clicks;
    }
    public String getEarning() {
        return Earning;
    }
    public void setEarning(String earning) {
        Earning = earning;
    }
}
