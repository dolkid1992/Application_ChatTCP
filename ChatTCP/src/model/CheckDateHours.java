/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Hieutt
 */
public class CheckDateHours {
    public static void main(String[] args) {
            java.util.Date sqldate = new java.util.Date();

            DateFormat df = new SimpleDateFormat("yyy/MM/dd hh:mm:ss");
            String text = df.format(sqldate);
            System.out.println(text);
    }
            
}
