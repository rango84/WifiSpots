package com.leaf.wifispots.models;

public class WSNetwork {

	private String mSSID;
	private String mName;
	
	public WSNetwork(String Name, String SSID) {
		mName = Name;
		mSSID = SSID;
	}
	
	public String getName() {
		return mName;
	}
	
	public String getSSID() {
		return mSSID;
	}
}
