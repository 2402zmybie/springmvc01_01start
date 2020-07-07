package com.hr.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义类型转换器
 * 字符串转换为日期
 */
public class StringToDateConverter implements Converter<String, Date> {


    @Override
    public Date convert(String s) {
        if(s == null) {
            throw new RuntimeException("请你传入数据");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException("数据类型转换出现错误");
        }
    }
}
