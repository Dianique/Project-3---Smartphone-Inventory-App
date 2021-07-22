package com.objects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        // Allow the user to return a specific phone type list.
        // Add code to the main() method that shows only "android" phones.
        System.out.println("Welcome to Tech World. Please see our full inventory of available smartphones: \n");


        System.out.println("IPhone: ");
        Smartphone myiPhone1 = new Smartphone("Apple", "iPhonePro" + 12, "IOS", 265, "Electric Blue", 2, 999.99);
        myiPhone1.display();
        Smartphone myiPhone2 = new Smartphone("Apple", "iPhonePro" + 11, "IOS", 128, "Pitch Black", 2, 899.99);
        myiPhone2.display();


        System.out.println("Samsung: ");
        Smartphone myAndroid1 = new Smartphone("Galaxy", "S" + 21, "Android", 512, "Ghost Pewter", 2, 1299.99);
        myAndroid1.display();
        Smartphone myAndroid2 = new Smartphone("Galaxy", "S" + 20, "Android", 256, "Silver", 2, 1199.99);
        myAndroid2.display();


        System.out.println("Google: ");
        Smartphone myGoogle1 = new Smartphone("Google", "Pixel" + 4 + "a", "Android", 128, "Just Black", 2, 399.99);
        myGoogle1.display();
        Smartphone myGoogle2 = new Smartphone("Google", "Pixel" + 5 + "a", "Android", 128, "Sage", 2, 699.99);
        myGoogle2.display();

        System.out.println("----------------------------------------");

        ArrayList<Smartphone> ListOfAndroids = new ArrayList<Smartphone>();
        {
            ListOfAndroids.add(myAndroid1);
            ListOfAndroids.add(myAndroid2);

            {

            }
            for (Smartphone Android : ListOfAndroids) {
               // System.out.println(Androids.toString());
                Android.display();
            }

        }
    }
}














