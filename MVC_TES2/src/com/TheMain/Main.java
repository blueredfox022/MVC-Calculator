package com.TheMain;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Penjumlahan");
        Model model = new Model();
        View view = new View();
        Control control = new Control(model, view);
        control.Run();
    }
}
