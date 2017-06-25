package com.date;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期时间
 * 取得年月日、小时分钟秒
 * 取得从1970年1月1日0时0分0秒到现在的毫秒数
 * 取得某月的最后一天
 * 格式化日期
 * @author chen
 * @date 2017-06-24
 */
public class DateTimeTest {
	public static void main(String[] args) {
		System.out.println("-----使用Calendar 类-------");
	    Calendar cal = Calendar.getInstance();
        System.out.println("年:"+cal.get(Calendar.YEAR));
        System.out.println("月:"+(cal.get(Calendar.MONTH)+1));    // 0 - 11
        System.out.println("日:"+cal.get(Calendar.DATE));
        System.out.println("时:"+cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分:"+cal.get(Calendar.MINUTE));
        System.out.println("秒:"+cal.get(Calendar.SECOND));
        
        System.out.println("-------Java 8 LocalDateTime ------------");
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("年:"+dt.getYear());
        System.out.println("月:"+dt.getMonthValue());     // 1 - 12
        System.out.println("日:"+dt.getDayOfMonth());
        System.out.println("时:"+dt.getHour());
        System.out.println("分:"+dt.getMinute());
        System.out.println("秒:"+dt.getSecond());
        
        System.out.println("---取得从1970年1月1日0时0分0秒到现在的毫秒数--");
        long time1 = Calendar.getInstance().getTimeInMillis();
        long time2 = System.currentTimeMillis();
        long time3 = Clock.systemDefaultZone().millis(); // Java 8
        System.out.println(time1+"\n"+time2+"\n"+time3);
        
        System.out.println("----取得某月的最后一天---");
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("当月最后一天:"+lastDay);
        
        System.out.println("----格式化日期----");
        System.out.println("使用SimpleDateFormat+Date: ");
        SimpleDateFormat oldFormatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date1 = new Date();
        System.out.println(oldFormatter.format(date1));
        
        System.out.println("使用DateTimeFormatter+LocalDate: ");
        // Java 8
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date2 = LocalDate.now();
        System.out.println(date2.format(newFormatter));
	}
}
