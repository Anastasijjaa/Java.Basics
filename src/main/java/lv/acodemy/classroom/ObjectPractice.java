package lv.acodemy.classroom;

import static lv.acodemy.classroom.Sizes.*;

public class ObjectPractice {
    public static void main(String[] args) {
        //klass - nazvanie objecta
        Animal cat = new Animal();  // command + p

       /* P.S.1
       catTeodor.age = 1;
        catTeodor.name = "Teodor";
        System.out.println(catTeodor);
        */

        // name -null
        String catName = cat.getName();// getName+ option + enter-> introduce local variable
        System.out.println(catName);
        System.out.println(cat);

        //name - Teodor
        cat.setName("Teodor");
        System.out.println(cat);
        System.out.println("My cat name is: " + cat.getName());

        // age = 5
        cat.setAge(5);
        System.out.println("My cat is " + cat.getAge() + " year old");

        cat.setWeight(6.54);
        System.out.println("My cat weight is: " + cat.getWeight() + "kg");

        cat.setColor("grey");
        System.out.println("My cat color is: " + cat.getColor());

        cat.setSize(Sizes.L);
        // Sizes + option + enter -> butet togda kak nize
        cat.setSize(L);
        System.out.println("My cat size is: " + cat.getSize());
        System.out.println(cat);


        Animal dog = new Animal(13, "Balzik"); //s zadanimi parametrami (djphfcn b bvz
        // My name is Ballzik. I am 13 years old.
        System.out.printf("My name is %s. I am %d years old.\n", dog.getName(), dog.getAge());
        System.out.println("My name is " + dog.getName() + ". I am " + dog.getAge() + " years old.");


        // Create All argument constructor;
        Animal piggy = new Animal(7, 15.67, "pink", XL, "Pupsik", true);
        System.out.println(piggy);

        piggy.speak();
        /* in animal class
        public void speak() {
            System.out.println("I'm speaking with you");
        }*/
        piggy.food("bulka");

        piggy.speak();
        piggy.getEnergy();

        piggy.speak();
        piggy.speak();
        piggy.speak();
        piggy.speak();

        piggy.getEnergy();
        piggy.food(" hled");
        piggy.food(" hled");
        piggy.food(" hled");
        piggy.getEnergy();


    }
}
