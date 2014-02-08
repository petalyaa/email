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
	
	public static final long toLong(String s) {
		long l = 0;
		try {
			l = Long.parseLong(s.trim());
		} catch (Exception e) {
		}
		return l;
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

	public static final long[] toLongArray(String[] s) {
		long[] l = new long[s.length];
		for(int i = 0;i < s.length; i++) {
			l[i] = toLong(s[i]);
		}
		return l;
	}
	
}
