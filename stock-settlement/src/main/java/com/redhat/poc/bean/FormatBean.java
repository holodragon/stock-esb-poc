package com.redhat.poc.bean;

public class FormatBean {
	public Float stringToFloat(String in) {
		StringBuffer newString = new StringBuffer(in);
		newString.insert(in.length() - 2, ".");
		return Float.parseFloat(newString.toString());
	}
	
	public String stringToFloatString(String in) {
		StringBuffer newString = new StringBuffer(in);
		return newString.insert(in.length() - 2, ".").toString();
	}
}
