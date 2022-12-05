package com.w.java418;

import java.util.Calendar;
import java.util.Date;

public class DataDome {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);

/**        SimpleFormatter simpleFormatter=new SimpleFormatter("yyyy-MM-dd HH:mm:ss");
        String string=new simpleFormatter.format(date);
        System.out.println(string);
 */

        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
        Date date1=calendar.getTime();
        System.out.println(date1);
        calendar.setTime(new Date());
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONDAY)+1 );
    }
}
