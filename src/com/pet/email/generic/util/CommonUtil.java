package com.pet.email.generic.util;

public class CommonUtil {
	
	public static final int getInt(String s, int defaultValue) {
		int i = defaultValue;
		try {
			if(!isNullEmptyString(s))
				i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
		}
		return i;
	}
	
	public static final int toInt(boolean b) {
		if(b)
			return 1;
		else
			return 0;
	}
	
	public static final boolean isNullEmptyString(String s) {
		return s == null || s.equals("");
	}
	
	public static final boolean toBoolean(int i) {
		if(i == 1) 
			return true;
		return false;
	}

}
