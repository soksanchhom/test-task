package com.example.demo.pi;

public class PiService {

	public static String SplitPi(PiDto piDto){
        String pi = Double.toString(Math.PI);
        System.out.println(pi);
        String a = pi.substring(pi.indexOf('.') ,pi.length());
        return a.substring(piDto.getStartIndex(),piDto.getEndIndex() + 1);
    }
}
