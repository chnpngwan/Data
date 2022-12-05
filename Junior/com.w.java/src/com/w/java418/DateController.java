package com.w.java418;

import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 * @author admin
 */
public class DateController {
    public static int getWeekOfYear(String date){
        try {
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            Calendar calendar= Calendar.getInstance();
            calendar.setFirstDayOfWeek(Calendar.MONDAY);
            calendar.setMinimalDaysInFirstWeek(1);
            calendar.setTime(simpleDateFormat.parse(date));
            return calendar.get(Calendar.WEEK_OF_YEAR);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("2017年12月01日是2017年的第"+getWeekOfYear("2017-12-01")+"周");
    }
}
