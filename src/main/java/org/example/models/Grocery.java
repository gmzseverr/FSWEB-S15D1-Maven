package org.example.models;

import java.util.*;

public class Grocery {
    private static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> groceryList = new ArrayList<>();

    public static void addItems(String itemsToAdd){
        String[] splitItem = itemsToAdd.split(",");
        for(String item : splitItem){
            item = item.trim();
            if(checkItemIsInList(item)){
                System.out.println("Girilen item listede mevcut");
            } else {
                groceryList.add(item);
            }
        }
        sortItems();
    }

    public static boolean checkItemIsInList(String item) {
        return groceryList.contains(item);
    }

    public static void removeItems(String itemsToRemove){
        String[] splitItems = itemsToRemove.split(",");
        for (String item: splitItems){
            item = item.trim();
            if (!checkItemIsInList(item)){
                System.out.println("Girilen item listede mevcut değil.");
            } else {
                groceryList.remove(item);
            }
        }
        sortItems();
    }

    public static void printSorted(){
        sortItems();
        System.out.println("Mevcut Pazar Listesi:");
        for(String item: groceryList) {
            System.out.println(item);
        }
    }

    public static void sortItems(){
        Collections.sort(groceryList);
    }

    public static void startGrocery(){
        int choice;
        do{
            System.out.println("Yapmak istediğiniz operasyonu seçiniz.( 0 - Çıkış , 1 - Ürünün ekle, 2 - Ürün çıkar)");
            choice = scanner.nextInt();
            scanner.nextLine(); // bir sonraki satırı oku
            switch (choice){
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String itemsToAdd = scanner.nextLine();
                    addItems(itemsToAdd);
                    printSorted();
                    break;
                case 2:
                    System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
                    String itemsToRemove = scanner.nextLine();
                    removeItems(itemsToRemove);
                    printSorted();
                    break;
            }
        } while (choice != 0);
    }

    public static void main(String[] args) {
        startGrocery();
    }
}
