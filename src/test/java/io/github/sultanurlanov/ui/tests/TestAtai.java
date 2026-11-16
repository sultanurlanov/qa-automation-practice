package io.github.sultanurlanov.ui.tests;

import java.util.ArrayList;
import java.util.List;



public class TestAtai{

    public static void main(String[] args) {

        AtaiData text1 = new AtaiData("кот");
        AtaiData text2 = new AtaiData("собака");
        AtaiData text3 = new AtaiData("лев");

        List<AtaiData> test = new ArrayList<>();
        test.add(text1);
        test.add(text2);
        test.add(text3);

        String res = "";
        for (AtaiData item : test) {
            if (item.getText().length() > res.length()) {
                res = item.getText();
            }
        }
        System.out.println(res);
    }
}
