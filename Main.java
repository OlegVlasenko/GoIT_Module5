package com.company;

import javax.tools.Tool;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //get the size of array
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter the size of array");
        int sizeOfArray = in.nextInt();

        // create array
        int[] numbers = new int[sizeOfArray];

        // initialize array
        Tools.initArrayRandom(numbers);

        //show res
        Tools.show(numbers);

        //find min number
        System.out.println("Min = " + Tools.findMin(numbers));

        //find max number
        System.out.println("Max = " + Tools.findMax(numbers));

        //sort
        Tools.sortAsc(numbers, Tools.Order.ASC);

        //show res
        Tools.show(numbers);

        //sort
        Tools.sortAsc(numbers, Tools.Order.DESC);

        //show res
        Tools.show(numbers);

    }
}
