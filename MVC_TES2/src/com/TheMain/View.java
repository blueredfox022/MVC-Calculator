package com.TheMain;

public class View {

    public int GetNumberFirst() {
        System.out.print("Masukkan angka pertama : ");
        try {
            return Integer.parseInt(System.console().readLine());
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Mohon masukkan bilangan bulat.");
            return GetNumberFirst();
        }

    }

    public int GetNumberSecond() {
        System.out.print("Masukkan angka Kedua : ");
        try {
            return Integer.parseInt(System.console().readLine());
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Mohon masukkan bilangan bulat.");
            return GetNumberSecond();
        }
    }

    public void ShowHasil(int hasil) {
        System.out.println("Hasilnya adalah = " + hasil);
    }

}
