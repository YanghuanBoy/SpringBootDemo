package com.example.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by Administrator on 2017-3-13.
 */

/*@RestController
@EnableAutoConfiguration*/
public class demo {

    /*@RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "Hello World!!";
    }*/

    public static  void main (String[] args){
        List<String> list1=new ArrayList<String>();
        List<String> list2=new ArrayList<String>();
        List<String> list3=new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");

        list2.add("3");
        list2.add("4");
        list2.add("5");

        list3.add("4");
        list3.add("3");
        list3.add("6");
        list3.add("7");
        list3.add("1");
        //         1  2  3    3  4  5  4     3  6   7  1
        //要求输出 1   2  3     4  5  4  3  6  7  1
        List<String> allList=new ArrayList<>();
        allList.addAll(list1);
        allList.addAll(list2);
        allList.addAll(list3);

        int len = allList.size();
        for (int i=0;i<len-2;i++){
            if(allList.get(i)==allList.get(i+1)){
                allList.remove(i);
            }
        }
        int len1 = allList.size();
        for (int i=0;i<len1;i++){
            System.out.print(allList.get(i));
        }
    }
}
