package com.TheMain;

public class Control {

    private Model model;
    private View view;

    public Control(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void Run() {
        while (true) {
            int numF = view.GetNumberFirst();
            model.addNumberFirst(numF);
            int nums = view.GetNumberSecond();
            model.addNumberSecond(nums);
            int hasil = model.getHasil();
            view.ShowHasil(hasil);

        }

    }

}
