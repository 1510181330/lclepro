package com.example.lclepro.Utils;

import com.example.lclepro.Bean.LcleFreeclass;

import java.util.List;

public class FreeclassUtils {

    public LcleFreeclass JsonToFreeclass(LcleFreeclass record, List<String> day1, List<String> day2, List<String> day3, List<String> day4, List<String> day5){
        if(day1.contains("第一大节")){
            record.setC11(1);
        }
        else{
            record.setC11(0);
        }
        if(day1.contains("第二大节")){
            record.setC12(1);
        }
        else{
            record.setC12(0);
        }
        if(day1.contains("第三大节")){
            record.setC13(1);
        }
        else{
            record.setC13(0);
        }
        if(day1.contains("第四大节")){
            record.setC14(1);
        }
        else{
            record.setC14(0);
        }
        if(day2.contains("第一大节")){
            record.setC21(1);
        }
        else{
            record.setC21(0);
        }
        if(day2.contains("第二大节")){
            record.setC22(1);
        }
        else{
            record.setC22(0);
        }
        if(day2.contains("第三大节")){
            record.setC23(1);
        }
        else{
            record.setC23(0);
        }
        if(day2.contains("第四大节")){
            record.setC24(1);
        }
        else{
            record.setC24(0);
        }
        if(day3.contains("第一大节")){
            record.setC31(1);
        }
        else{
            record.setC31(0);
        }
        if(day3.contains("第二大节")){
            record.setC32(1);
        }
        else{
            record.setC32(0);
        }
        if(day3.contains("第三大节")){
            record.setC33(1);
        }
        else{
            record.setC33(0);
        }
        if(day3.contains("第四大节")){
            record.setC34(1);
        }
        else{
            record.setC34(0);
        }
        if(day4.contains("第一大节")){
            record.setC41(1);
        }
        else{
            record.setC41(0);
        }
        if(day4.contains("第二大节")){
            record.setC42(1);
        }
        else{
            record.setC42(0);
        }
        if(day4.contains("第三大节")){
            record.setC43(1);
        }
        else{
            record.setC43(0);
        }
        if(day4.contains("第四大节")){
            record.setC44(1);
        }
        else{
            record.setC44(0);
        }
        if(day5.contains("第一大节")){
            record.setC51(1);
        }
        else{
            record.setC51(0);
        }
        if(day5.contains("第二大节")){
            record.setC52(1);
        }
        else{
            record.setC52(0);
        }
        if(day5.contains("第三大节")){
            record.setC53(1);
        }
        else{
            record.setC53(0);
        }
        if(day5.contains("第四大节")){
            record.setC54(1);
        }
        else{
            record.setC54(0);
        }
        return record;
    }
}