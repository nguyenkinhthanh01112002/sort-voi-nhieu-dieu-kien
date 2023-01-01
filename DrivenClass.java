/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortwithconditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author KINHTHANH
 */
public class DrivenClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<SinhVien>();
        for(int i=0;i<n;i++)
        {
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            list.add(new SinhVien(id, ten, lop, gpa));                  
        }
        /*Collections.sort(list, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){ 
                return o1.getHoTen().compareTo(o2.getHoTen()); 
            }
        });*/
        //Collections.sort(list, (o1, o2) -> o1.getHoTen().compareTo(o2.getHoTen()));
        Collections.sort(list, new SortByGpaThenByName());
        for(SinhVien o:list)
        {
            System.out.println(""+o.toString());
        }
                
}
}
