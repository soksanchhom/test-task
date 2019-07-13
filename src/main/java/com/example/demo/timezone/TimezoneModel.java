package com.example.demo.timezone;

public class TimezoneModel {
	private String cambodiaTimeZone;
	private String japanTimeZone;
	private String moscowTimeZone;
	
	
	public TimezoneModel(String cambodiaTimeZone,String japanTimeZone,String moscowTimeZone) {
        this.cambodiaTimeZone = cambodiaTimeZone;
        this.japanTimeZone	  = japanTimeZone;
        this.moscowTimeZone	  = moscowTimeZone;
    }

    public String getCambodiaTimeZone() {
        return cambodiaTimeZone;
    }
    
    public String getJapanTimeZone() {
        return japanTimeZone;
    }
    
    public String getMoscowTimeZone() {
        return moscowTimeZone;
    }
}
