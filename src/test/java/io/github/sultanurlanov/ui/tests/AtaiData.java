package io.github.sultanurlanov.ui.tests;

public class AtaiData {


    private  String text;

    public AtaiData(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "AtaiData{" +
                "text='" + text + '\'' +
                '}';
    }
}

