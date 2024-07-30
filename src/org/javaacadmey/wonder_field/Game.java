package org.javaacadmey.wonder_field;

import java.util.Scanner;

public class Game {
        // количество игроков - 3
    public static final int NUMBER_OF_PLAYERS = 3;
        // количество раундов - 4
    public static final int NUMBER_OF_ROUNDS = 4;
        // групповых раундов - 3
    public static final int GROUP_ROUNDS = 3;
        // индекс финального раунда - 3
    public static final int INDEX_OF_THE_FINAL_ROUND = 3;

        // Создай статическое поле scanner читающий из консоли ввод данных.
    static Scanner dataEntry = new Scanner(System.in);

        // init отвечает за инициализацию игры.
    void init() throws InterruptedException {
        System.out.println("Запуск игры Поле Чудес - подготовка к игре. " +
                            "Вам нужно ввести вопросы и ответы для игры.\n");
            // Создание вопрос/ответ вынес в отдельный метод.
        questions();
            // Игра засыпает на 5 секунд.
        Thread.sleep(5000);
            // После чего делается 50 пустых строк.
        System.out.println("\n".repeat(1));
    }

    private static void questions() {
            //Вопрос/ответ №1
        System.out.println("Введите вопрос #1:");
        String question1 = dataEntry.next();
        System.out.println("Введите ответ вопрос #1:");
        String answer1 = dataEntry.next();

            //Вопрос/ответ №2
        System.out.println("Введите вопрос #2:");
        String question2 = dataEntry.next();
        System.out.println("Введите ответ вопрос #2:");
        String answer2 = dataEntry.next();

            //Вопрос/ответ №3
        System.out.println("Введите вопрос #3:");
        String question3 = dataEntry.next();
        System.out.println("Введите ответ вопрос #3:");
        String answer3 = dataEntry.next();

            //Вопрос/ответ №4
        System.out.println("Введите вопрос #4:");
        String question4 = dataEntry.next();
        System.out.println("Введите ответ вопрос #4:");
        String answer4 = dataEntry.next();

        String[] quest = {question1, question2, question3, question4};
        String[] answer = {answer1, answer2, answer3, answer4};
        System.out.println("Иницализация закончена, игра начнется через 5 секунд!");

    }
}
