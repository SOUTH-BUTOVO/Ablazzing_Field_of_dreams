package org.javaacadmey.wonder_field;

public class Tableau {
        // правильный ответ
    String rightAnswer;
        // буквы на табло
    char[] lettersPanel = {};


        // метод инициализации табло - записывает правильный ответ и делает пустой
        // массив с размерностью ответа который записывается в буквы на табло.
    void initializationPanel(String rightAnswer, String rightAnswer2) {
        for (int i = 0; i < rightAnswer.length(); i++) {
            System.out.print("_|");
        }
    }
}
