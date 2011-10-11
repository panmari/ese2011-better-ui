package models;

import java.util.Date;
import java.util.List;

public class CalendarUtil {

	private static java.util.Calendar cal = java.util.Calendar.getInstance();
	private static CalendarUtil util;
	
	private CalendarUtil(){
		cal.set(cal.DATE, 1);
	}
	
	/**
	 * Months are written in <code>int</code>'s from 0 to 11. <br>
	 *	TODO: form 1 to 12 please!
	 * Example: June would be <code> 5. </code>
	 * Wrong input is not handled.
	 * 
	 * @param month
	 */
	public static CalendarUtil getInstanceToday(){
		util = new CalendarUtil();
		return util;	
	}
	
	/**
	 * Returns the current month as <code> int</code>, starting <br>
	 * with <code>0</code> (January) and ending with <code> 11</code> (December).<br>
	 * 
	 * @return month
	 */
	public static int getMonth(){
		int month = cal.get(cal.MONTH) + 1;
		return month;
	}
	/**
	 * Sets month within the same year.<br>
	 */
	public static void setMonth(int month){
		cal.set(cal.MONTH, (month-1));
	}
	/**
	 * Sets the default time stamp one month ahead.
	 */
	public static void nextMonth(){
		cal.add(cal.MONTH, 1);
	}
	
	/**
	 * Sets the default time stamp one month back.
	 */
	public static void previousMonth(){
		cal.add(cal.MONTH, -1);
	}
	
	public static int getNumberOfDaysOfMonth(){
		return cal.getActualMaximum(cal.DATE);
	}
	
	/**
	 * Returns the first weekday of this month as <code> int</code>. <br>
	 * Sunday is the 1. and so on till Saturday as the 7. day.<br>
	 * For example, if Tuesday is the first day in a month, then <code> 3 </code> is returned.
	 * 
	 * @return weekday
	 */
	public static int getFirstDayInMonth(){
		return cal.get(cal.DAY_OF_WEEK);
	}

	public List<Integer> getLastMonthDates() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Integer> getThisMonthDates() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Integer> getNextMonthDates() {
		// TODO Auto-generated method stub
		return null;
	}
}	