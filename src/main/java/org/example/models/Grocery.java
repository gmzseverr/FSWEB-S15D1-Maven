package org.example.models;

import java.util.*;

public class Grocery {
    public static List groceryList  = new ArrayList<>();

    public static void addItems(String input){
        if(groceryList.contains(input)){
            groceryList.add(input);
        }
    }

    private static boolean checkItemIsInList(String input) {
        return groceryList.contains(input);
    }

    public static void removeItems(String input){
        groceryList.remove(input);
    }

    public static void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }


//nextLine()	Reads a String value from the user
    public static void startGrocery(){
        Scanner scanner = new Scanner(System.in);
        boolean quit =false;

        label:
        while (!quit){
            String input = scanner.nextLine().trim();
            switch (input) {
                case "0":
                    System.out.println("Uygulama durduruluyor.");
                    printSorted();
                    quit = true;
                    break;
                case "1":
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    addItems(scanner.nextLine());
                    printSorted();
                    break label;
                case "2":
                    System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                    removeItems(scanner.nextLine());
                    printSorted();


                    break;
            }
        }
    }
}
