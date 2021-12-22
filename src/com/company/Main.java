package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var loseWeight = 7*1000;
        var everydayWeight = 250;
        System.out.println("На похудение спортсмена уйдет " + loseWeight / everydayWeight + " дней");
        var loseWeight2 = 7*1000;
        var everydayWeight2 = 500;
        System.out.println("На похудение спортсмена уйдет " + loseWeight2 / everydayWeight2 + " дней");
        var day28 = loseWeight / everydayWeight;
        var day14 = loseWeight2 / everydayWeight2;
        System.out.println("В среднем для похудения спортсмену потребуется " + (day14 + day28) / 2 + " дней");

    }
}
