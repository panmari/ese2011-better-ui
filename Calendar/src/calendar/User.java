package calendar;

import hirondelle.date4j.DateTime;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TimeZone;

public class User {
	private String name;
	private List<Calendar> calendars;
	
	public User (String name){
		this.name = name;
		this.calendars = new LinkedList<Calendar>();
	}
	
	public String getName(){
		return name;
	}
	
	public Event addEvent(String eventName, String date, String time) {
		Event newEvent = new Event(eventName, date, time);
		return newEvent;
	}
	
	private Event getNextEvent() {
		//TODO fix this:
		for (Event e: eventList) {
			DateTime startTime = e.getStartTime();
			if (startTime.isInTheFuture(TimeZone.getDefault()))
				return e;
		}
		throw new NoSuchElementException();
	}
	
	
}
