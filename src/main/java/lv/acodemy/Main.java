package lv.acodemy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //one-line  comment

    /*
    THIS IS
    multi line
    comments
     */

        //Primitive data type

        //double - floating numbers
        double pi = 3.14;
        System.out.println(pi);

        //float - floating numbers  (iz za togo, cto 2 cifri dobavljajem f, ctobi itnisilosj k float)
        float weight = 70.34f;
        System.out.println(weight);

        //int (integer)
        int populationOfLatvia = 1700000;
        System.out.println(populationOfLatvia);

        //char
        char myFirstNameChar = 'A';
        System.out.println(myFirstNameChar);

        //byte
        byte age = 28;
        System.out.println(age);

        //boolean is, has
        boolean isSummer = true;
        System.out.println(isSummer);
        boolean isWinter = false;
        System.out.println(isWinter);

        // String
        String name = "Anastasija";
        String surname = "Trambovecka";
        System.out.println("My name is: " + name + ". " + "My surname is:" + surname);
        System.out.println(name + " " + surname);
        System.out.printf("My name is: %s. My surname is: %s\n", name, surname);
        System.out.printf("%s %s\n", name, surname);
        System.out.println(String.format("My name is: %s. My surname is: %s\n", name, surname));


//operator
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c);

        double e = 20.54;
        double f = 9.61;
        double g = e - f;
        System.out.println(g);
        System.out.println(a + c - f);

        int x = 10;
        int y = 10 % 4;  //reminder ostatok s delenija
        System.out.println(y);

    }
}