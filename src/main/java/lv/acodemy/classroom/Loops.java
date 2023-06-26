package lv.acodemy.classroom;

import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //for; foreach, do while, while;

        for (int i = 0; i < 10; i++)
        //scetcik idet so znacenija 0, do kakih por budet dejstvovatj cils (10), i++ uvelicivaetsja 1
        {
            System.out.println("Hello World!");
        }


        String[] fruits = {"apple", "banana", "kiwi", "orange", "pear"};

        // fruit [0] = apple
        // fruit [1] = banana
        //....

        for (int i = 0; i < fruits.length; i++)
        // nazvanie sptings + lenght, avtomaticeski scitaet dlinu
        {
            System.out.println(fruits[i]);
        }

        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");  //v odnu strochku
        }
        System.out.println();

        for (int i = 0; i < fruits.length; i++)  //i < fruits.length mozno ogranicitj, naprimer i < 3
        {
            System.out.println(fruits[i]);
            if (fruits[i].equals("kiwi")) {
                System.out.println("I found kiwi!");
                break;
            }
        }

        // enhanced for (for each)
        for (String fruit : fruits) //ispolzuetsja kogda nuzno proiti po vsemu spisku
        {
            System.out.println("fruit = " + fruit); //soutv - ,eltn gtxfnfnmcz v cnhjxre

        }


//        Print the numbers from 20 to 40.
        for (int n = 20; n <= 40; n++) {
            System.out.println("Number = " + n);
        }


//        Calculate the sum of all even (chetnoe) numbers between 1 and 100.
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of even:" + sum); // nuzno v konce cikla, ctobi odin raz


//        Print the multiplication table of a given number.

        //6;

        int number = 6;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * number + " ");
        }
        System.out.println();
        System.out.println();

        //multiplication table 10
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }


        // WHILE LOOP
        int i = 10;
        while (i > 0) {
            System.out.println("Hello");
            i--;
        }

        int j = 0;
        while (j < 10) {
            System.out.print("HI ");
            j++;
        }
        System.out.println();


        int k = 0;
        do {
            System.out.println("Good Day!");
            k++;
        } while (k < 10);


        String name = "Anastasija";
        String reversed = "";
        for (int l = name.length() - 1; l >= 0; l--) {
            reversed = reversed + name.charAt(l);
        }
        System.out.println(reversed);
        

        Scanner myScanner = new Scanner(System.in);
        //klass - nazvanie objecta
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(5);
        System.out.println(randomNumber); //pokazivaet cislo

    /*
    System.out.println("Please enter number I guessed:");
    int inputNumber = myScanner.nextInt();  //myScanner.nextInt(); --> option +enter
    if (randomNumber == inputNumber) {
    System.out.println("You guessed the number");
    }else {
    System.out.println("Try again");
    }
    */

        boolean isGuessed = false;
        while (!isGuessed) //! - invert, s true na false delaet
        {
            System.out.println("Please enter number I guessed:");
            int inputNumber = myScanner.nextInt();
            if (randomNumber == inputNumber) {
                System.out.println("You guessed the number!");
                isGuessed = true;
            } else {
                System.out.println("Try again!");
            }
        }


    }
}