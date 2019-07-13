package com.example.demo.pi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PiDto {
	@JsonProperty("start")
	private int start;
	@JsonProperty("end")
	private int end;
	

	public PiDto(@JsonProperty("start") int start,@JsonProperty("end")int end) {
		this.start = start;
		this.end = end;
	}
	
	public int getStartIndex() {
		return start;
	}
	public int getEndIndex() {
		return end;
	}
}
