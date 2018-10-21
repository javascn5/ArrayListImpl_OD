package com.sda.git;
// implementacja wlasnej Arraylisty

import java.util.Arrays;

public class CustomList<E> {

    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public CustomList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            resize();
            //elements[0] = e;// w takiej postaci bedzie sie nadpisywac pozycja 0

    }
        elements[size++] = e; // bedzie dodawac za kazdym razem  nastepna pozycje
    }

    private void resize() {
        int newSize = elements.length * 2;
        /*Zadanie
        1. Stworzenie nowej tablicy o nowym rozmiarze
        2. Przekopiowanoe starej tablicy do nowej
         */

        Object tmp[] = new Object[newSize];
        for (int i = 0; i < elements.length; i++) {
            tmp[i] = elements[i];
        }
        elements = tmp;
        // elements = Arrays.copyOf(elements,newSize) - inna metoda


    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Nie ma takiego elementu");
        }
        return (E) elements[i];
    }

    public int size() {
        return size;
    }

}


