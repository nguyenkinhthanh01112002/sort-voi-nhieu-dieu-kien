/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortwithconditions;

import java.util.Comparator;

/**
 *
 * @author KINHTHANH
 */
public class SortByGpaThenByName implements Comparator<SinhVien>{

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
       if(o1.getGpa()!=o2.getGpa())
       {
           if(o1.getGpa()>o2.getGpa())
           {
               return -1;
           }
           else
           {
               return 1;
           }
       }
       else
       {
           return o1.getHoTen().compareTo(o2.getHoTen());
       }
    }
    
}
