package com.demo.utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {
	static DateFormat dateFormat;
	static Date date;

	public static final long PAGE_LOAD_TIMEOUT = 100;

	public static final long IMPLICIT_WAIT = 10;

	public static String getDate(String format) {
		dateFormat = new SimpleDateFormat(format);
		date = new Date();
		return dateFormat.format(date);
	}

}
