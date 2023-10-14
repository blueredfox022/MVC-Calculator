package com.TheMain;

public class Model {
    private int numberFirst;
    private int numberSecond;

    public void addNumberFirst(int numberFirst) {
        this.numberFirst = numberFirst;

    }

    public void addNumberSecond(int numberSecond) {
        this.numberSecond = numberSecond;

    }

    public int getHasil() {
        return numberFirst + numberSecond;
    }

}
