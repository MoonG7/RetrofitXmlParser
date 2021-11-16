package com.smg.retrofitxmlparser.api;

import android.util.Log;

import com.tickaroo.tikxml.TypeConverter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateConverter implements TypeConverter<Date> {

    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd"); // SimpleDateFormat is not thread safe!

    @Override
    public Date read(String value) throws Exception {
        return formatter.parse(value);
    }

    @Override
    public String write(Date value) throws Exception {
        return formatter.format(value);
    }

}