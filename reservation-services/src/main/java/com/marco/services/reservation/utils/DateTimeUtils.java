package com.marco.services.reservation.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Component
public class DateTimeUtils {

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public Date createDateFromDateString(String dateString){
        Date date = null;
        if(StringUtils.isNotBlank(dateString)) {
            try {
                date = new Date(DATE_FORMAT.parse(dateString).getTime());
            }catch(ParseException pe){
                date = new Date(new java.util.Date().getTime());
            }
        }else{
            date = new Date(new java.util.Date().getTime());
        }
        return date;
    }

    String createDateStringFromDate(Date date){
        if(null == date){
            return DATE_FORMAT.format(new java.util.Date());
        }
        return DATE_FORMAT.format(date);
    }
}
