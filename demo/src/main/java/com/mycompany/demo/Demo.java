package com.mycompany.demo;

public class Demo {

    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Nguyen Khanh Duong", true, 165);
        sv1.ShowInfo();
        SinhVien sv2 = new SinhVien("Nguyen Yen Nhi", false, 155);
        sv2.ShowInfo();
        
    }
}
