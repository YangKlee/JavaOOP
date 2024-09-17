/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo;

/**
 *
 * @author YANGLAPTOP
 */
public class SinhVien {
    private String HoTen;
    private boolean GioiTinh;
    private int ChieuCao;
    
    public SinhVien(String HoTen, boolean GioiTinh, int ChieuCao)
    {
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.ChieuCao = ChieuCao;
    }
    public void ShowInfo()
    {
        System.out.println("Ho va ten: "+ this.HoTen);
        if(this.GioiTinh)
        {
            System.out.println("Gioi tinh: Nam");
        }
        else
        {
            System.out.println("Gioi tinh: Nu");
        }
        System.out.println("Chieu Cao: " + this.ChieuCao);
    }
    
}
