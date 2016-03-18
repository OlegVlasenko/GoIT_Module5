package com.company;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by User on 18.03.2016.
 */
abstract public class Tools {

    public enum Order{ASC,DESC};

    //find min in array
    static int findMin(int[] paramArray){
        int min = paramArray[0];
        for (int item : paramArray){
            if ( item < min ) {
                min = item;
            }
        }
        return min;
    }
    //find max in array
    static int findMax(int[] paramArray){
        int max = paramArray[0];
        for (int item : paramArray){
            if ( item > max ) {
                max = item;
            }
        }
        return max;
    }
    //sort array
    static void sortAsc(int[] paramArray, Order sortOrder ) {

        boolean needSort;
        int temp;

        do {
            needSort = false;
            for( int i = 0; i < paramArray.length - 1; i++){
                if ( ((sortOrder == Order.ASC) && ( paramArray[i]<paramArray[i+1])) ||
                        ((sortOrder == Order.DESC) && ( paramArray[i]>paramArray[i+1]))) {
                    temp = paramArray[i];
                    paramArray[i] = paramArray[i+1];
                    paramArray[i+1] = temp;
                    needSort = true;
                }
            }
        } while (needSort);
    }

    //show array
    static void show(int[] paramArray){
        System.out.print("{");
        for ( int i = 0; i < paramArray.length; i++ ) {
             System.out.print( paramArray[i]);
            if (i < paramArray.length-1) System.out.print(",");
        }
        System.out.println("}");

    }

    //init array random numbers
    static void initArrayRandom(int[] paramArray){
        final int UPPER_BOUND = 100;
        for ( int i = 0; i < paramArray.length; i++ ) {
            paramArray[i] = (int) (Math.random()*UPPER_BOUND);
        }

    }

}
