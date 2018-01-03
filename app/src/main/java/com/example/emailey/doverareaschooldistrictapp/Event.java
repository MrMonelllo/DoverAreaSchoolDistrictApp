package com.example.emailey.doverareaschooldistrictapp;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Dictionary;
import java.util.Enumeration;

/**
 * Created by tsengia on 5/4/2017.
 * This class holds all of the information that is needed by a calendar event.
 * Each event has a start date, end date, color, description, and a title.
 */

class Event {
    private String title = "Default Name";
    private Date date = Calendar.getInstance().getTime(); // The "date" field is actually the start date of the event
    private Date endDate; //ending date of the event
    private String description = "This is an example description for a calendar event.";
    private int eventColor = Color.RED; // This will be the background color of the event bubble when viewed on the calendar
    ArrayList<String> EventList = new ArrayList<>();
    public Dictionary dictionaryEvent;

    public String getTitle() {
        return title;
    }

    public int getEventColor() {
        return eventColor;
    }

    public void setEventColor(int color) {
        if (dictionaryEvent==null){ // Prevents a crash by making a new dictionary if it returns null
            createDictionary();
        }
        this.eventColor = color;
        dictionaryEvent.put("school", color); // Places the string "school" into the dictionary with the data type color.
    }

    public void setTitle(String title) {
        if (dictionaryEvent==null){
            createDictionary();
        }
        this.title = title;
        dictionaryEvent.put("title", title);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (dictionaryEvent==null){
            createDictionary();
        }
        this.description = description;
        dictionaryEvent.put("desc", description);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        if (dictionaryEvent==null){
            createDictionary();
        }
        this.date = date;
        dictionaryEvent.put("sDate", date);
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date ending) {
        if (dictionaryEvent==null){
            createDictionary();
        }
        this.endDate = ending;
        dictionaryEvent.put("eDate", ending);
    }

    public Event(String title, Date date) { // Title and starting date is needed in this constructor
        this.title = title;
        this.date = date;
    }

    public void createDictionary(){ // Creates a new dictionary, though this functionality is largely unfinished.
        dictionaryEvent = new Dictionary() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Enumeration keys() {
                return null;
            }

            @Override
            public Enumeration elements() {
                return null;
            }

            @Override
            public Object get(Object o) {
                return null;
            }

            @Override
            public Object put(Object o, Object o2) {
                return null;
            }

            @Override
            public Object remove(Object o) {
                return null;
            }
        };
    }

}
