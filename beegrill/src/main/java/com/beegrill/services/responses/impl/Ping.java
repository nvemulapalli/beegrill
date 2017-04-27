package com.beegrill.services.responses.impl;

import java.util.Date;

public class Ping extends BaseResponse {

	private static final long serialVersionUID = 1L;
	
	private String pingName;
	private long pingTime;

	public Ping() {
		this.pingName = "Pinging Bee Grill";
		this.pingTime = new Date().getTime();
	}
	
	public String getPingName() {
		return pingName;
	}
	
	public void setPingName(String pingName) {
		this.pingName = pingName;
	}
	
	public long getPingTime() {
		return pingTime;
	}
	
	public void setPingTime(long pingTime) {
		this.pingTime = pingTime;
	}
	
}
