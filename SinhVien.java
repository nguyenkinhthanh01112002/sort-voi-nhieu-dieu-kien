/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortwithconditions;

/**
 *
 * @author KINHTHANH
 */
public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private double gpa;

    public SinhVien(String maSinhVien, String hoTen, String lop, double gpa) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "{" + "maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", lop=" + lop + ", gpa=" + gpa + '}';
    }

    
    
}
