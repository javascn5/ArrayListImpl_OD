package com.sda.git;

public class Main {

    public static void main(String[] args) {

        CustomList<String> list= new CustomList<>();
        list.add("Jan");
        list.add("Maciej");
        list.add("M");
        list.add("f");
        list.add("Maciej");
        list.add("Maciej");
        list.add("Maciej");
        list.add("g");
        list.add("Maciej");
        list.add("e");
        list.add("w");
        list.add("Maciej");
        list.add("q");
        list.add("Maciej");

        for (int i =0; i <list.size();i++){
            System.out.println(list.get(i));
        }

// zadanie domowe dodac usunecie
    }
}
