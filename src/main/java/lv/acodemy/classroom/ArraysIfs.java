package lv.acodemy.classroom;

import java.util.Arrays;

public class ArraysIfs {
    public static void main(String[] args) {

        //arroy

        int[] numbers = {1, 5, 10, 20, 30, 50};  //massivi, strogo ukazonnie kolicestvo
        System.out.println(numbers[3]);    //print 20
    /*
    numbers [0] = 1
    numbers [1] = 5
    numbers [2] = 10
    numbers [3] = 20
    numbers [...] = 50
     */
        //      System.out.println(numbers [7]); out of bounds

        int[] ages = new int[10];  //pustoi masiv, ukazano kolicestvo cifr skolko budet hranitj massiv
// v oboih variantah ne mozem dobavitj bolwe cisel cem bilo zaplanorovano

        ages[0] = 10;
        ages[3] = 24;
        System.out.println(Arrays.toString(ages));
        System.out.println(ages); // pokazivaetsa only kod

// string orrey
        String[] names = {"Anna", "Andrew", "Billy"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[2]);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ", ");
        }


//logical Statements
        /*
        if(condition) {}
        condition = boolen (true or false)

         */
        if (5 < 10) {
            System.out.println("Yes, this is true!");
        }

/*boolean isSummer = true;
if (isSummer) {
    System.out.println("Yes, this is summer");
}*/

        int x = -10;
        if (x > 0) {
            System.out.println("This is positive number:" + x);
        }
        if (x < 0) {
            System.out.println("This is negative number!" + x);
        }

        int a = 10;
        if (a % 2 == 0) {
            System.out.println("Number is divisible by 2:" + x);
        } // odno = prisvoenie, dva == sravnenie

// if and else
        /*
        If(true)
        {
        do something
        }
        else
        {
        do something another if false
        }
        */

        if (x > 0) {
            System.out.println("Number is positive: " + x);
        } else {
            System.out.println("Number is negative: " + x);
        }

        int s = 4;

        if (s % 2 == 0) {
            System.out.println("Number is even:" + s);
        } else {
            System.out.println("Number is odd:" + s);
        }

        int age = 18;
        if (age >= 18) {
            System.out.println("Person is eligible to vote");
        } else {
            System.out.println("Person is not eligible to vote");
        }


// <= (less or equals)
// >= (more or equals)
// ==compare


        // boolen -> true or false

        boolean isSummer = false;
        boolean isWinter = false;
        boolean isAutumn = false;

        if (isSummer) {
            System.out.println("Right, this is summer!");
        } else if (isWinter) {
            System.out.println("Right, this is winter!");
        } else if (isAutumn) {
            System.out.println("Right, this is autumn!");
        } else {
            System.out.println("This is spring!");
        }


        int grade = -1;
        if (grade == 10) {
            System.out.println("Grade: With distinction");
        } else if (grade == 9) {
            System.out.println("Grade: Excellent");
        } else if (grade == 8) {
            System.out.println("Grade: Very good");
        } else if (grade == 7) {
            System.out.println("Grade: Good");
        } else if (grade == 6) {
            System.out.println("Grade: Almost good");
        } else if (grade == 5) {
            System.out.println("Grade: Satisfactory");
        } else if (grade == 4) {
            System.out.println("Grade: Almost satisfactory");
        } else if (grade >= 1 && grade <= 3) {
            System.out.println("Grade: Unsatisfactory");
        } else {
            System.out.println("Incorrect grade");
        }


        int angle = 55;
        if (angle > 0 && angle < 90) {
            System.out.println("Angle - acute: " + angle);
        } else if (angle == 90) {
            System.out.println("Angle - right: " + angle);
        } else if (angle > 90 && angle < 180) {
            System.out.println("Angle - obtue: " + angle);
        } else if (angle == 180) {
            System.out.println("Angle - straight: " + angle);
        } else {
            System.out.println("Incorrect data: " + angle);
        }


        int[] numberArray = {5, 7, 10, 3, 4, 10, 50, 20, 30, 20, 10};
        // numberArray[0] = 5
        // numberArray[1] = 7
        // numberArray[2] = 10

        int max = 0;


        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > max) {
                max = numberArray[i];
            }
        }
        System.out.println("maximum is: " + max);

    }
}