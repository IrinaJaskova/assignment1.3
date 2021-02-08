package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter day");
        short day = input.nextShort();
        System.out.println("Please enter month");
        short month = input.nextShort();
        System.out.println("Please enter year");
        int year = input.nextInt();

        if (month < 0 || month > 12) {
            System.out.println("Please enter correct month between 1 and 12");
        } else if (year <= 0) {
            System.out.println("Please enter correct year between 1 and 12");
        } else if (day < 1 || day > 31) {
            System.out.println("Please enter correct day between 1 and 31 ");

        } else if (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("For months 4, 6, 9, 11 day should be between 1 and 30 ");

        } else if ((day == 29 || day == 30 || day == 31) && month == 2 && year % 4 != 0) {
            System.out.println("For month 2 in non leap year day should be between 1 and 28 ");

        } else if ((day == 30 || day == 31) && month == 2 && year % 4 == 0) {
            System.out.println("For month 2 in leap year day should be between 1 and 29 ");

        } else {
            System.out.println("in what format you want to print out the date");
            System.out.println("1 - YYYY/MM/DD");
            System.out.println("2 - YYYY.MM.DD");
            short format = input.nextShort();
            if (format == 1) {
                System.out.println("your date is " + year + "/" + month + "/" + day);

            }
            if (format == 2) {
                System.out.println("your date is " + year + "." + month + "." + day);

            }
        }


    }

}


