package ru.itgirl;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        enum WeekdaysEnum {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY;
        }

        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Input the weekday name:");
        String givenDay = consoleInput.nextLine();

        try {
            WeekdaysEnum day = WeekdaysEnum.valueOf(givenDay.toUpperCase());
            switch (day) {
                case MONDAY -> System.out.println("Понедельник");
                case TUESDAY -> System.out.println("Вторник");
                case WEDNESDAY -> System.out.println("Среда");
                case THURSDAY -> System.out.println("Четверг");
                case FRIDAY -> System.out.println("Пятница");
                case SATURDAY -> System.out.println("Суббота");
                case SUNDAY -> System.out.println("Воскресенье");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect input");
        }


        }
    }
