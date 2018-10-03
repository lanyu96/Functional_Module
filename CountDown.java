package com.lanyu96.test1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 获取2022年"北京-张家口"冬奥会倒计时还有多少天
 */
public class CountDown {
	public static void main(String[] args) {
//		Thread t1 = new Thread();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Calendar c = Calendar.getInstance();
		Date date = new Date();
		c.setTime(date);
		long timeNow = c.getTimeInMillis();
		String s = sdf.format(date);
		System.out.println("现在是" + s);// 显示当前时刻
		c.set(2022, 2 - 1, 4);
		long timeEnd = c.getTimeInMillis();
		long day = timeEnd - timeNow; // 用结束时间减去当前时间
		long dayCountDown = day / 1000 / 60 / 60 / 24;// 获取毫秒,格式化成天
		System.out.println("距离张家口冬奥会还有" + dayCountDown + "天");
	}
}
