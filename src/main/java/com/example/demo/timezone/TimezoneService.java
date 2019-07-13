package com.example.demo.timezone;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public class TimezoneService {
	
	 public static Map<String,String> getTimezoneByArea(){
		 ArrayList<String> zones = new ArrayList<String>();
		 zones.add("Asia/Bangkok");
		 zones.add("Japan");
		 zones.add("Europe/Moscow");
		 Map<String,String> timezonesByArea = new HashMap<String,String>();
	     for (int i = 0; i < zones.size(); i++) {
	        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm ");
	        df.setTimeZone(TimeZone.getTimeZone(zones.get(i)));
	        timezonesByArea.put(zones.get(i),df.format(new Date()));
	     }
	     return timezonesByArea;
	 }
}
