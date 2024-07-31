package org.javaacadmey.wonder_field;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        Tableau tableau = new Tableau();
        game.init();

        String[][] questionsAnswers = game.questionsAndAnswers;
        for (String[] strings : questionsAnswers) {
            for (String str : strings)
            System.out.println(str);
        }
//        tableau.initializationPanel(str);
    }
}
