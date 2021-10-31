package com.array;

public class Main {

    public static void main(String[] args) {

        int[] my_array = new int[]{20, 30, 25, 35, -16, 60, -100};
        int suma = 0;
            for (int i =0; i < my_array.length; i++){
            // srednia arytmetyczna suma wszystkich elementow przez ilosc elementow
        suma = suma + my_array[i];

        //obliczam srednia
        double srednia = suma / my_array.length;
                System.out.println("Srednia wynosi = " + srednia);

        }
        }
    }

