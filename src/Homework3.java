import java.util.Arrays;

public class Homework3 {
    /** Java 1. Homework 3.
     * @auther Ilya Tomov
     * @version 13.11.2021
     */
    public static void main(String[] args){
        ex1();
        ex2();
        ex3();
        ex6();
    }

    static void ex1() {
        int[] a = {1, 0, 0, 1, 1};
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 1){
                a[i] = 0;
            }
            else {
                a[i] = 1;
            }
            System.out.println(a[i]);
        }
    }

    static void ex2() {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.println(a[i]);
        }
    }

    static void ex3() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if(a[i] < 6){
                System.out.println(a[i] * 2);
            }
        }
    }

    static void ex4() {
        int[][] a = new int[4][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i == j) {
                    a[i][j] = 1;
                }
            }
        }
    }
    // ex5
    static int[] a (int len, int initialValue) {
        int b[] = new int[len];
        for (int i = 0; i < b.length; i++) {
            b[i] = initialValue;
        }
        return b;
    }

    static void ex6() {
        int[] a = {1, 4, 3, 6, 2, 5, 8};
        int min = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if(min > a[i]){
                min = a[i];
            }
            if (max < a[i]){
                max = a[i];
            }
        }
        System.out.println(min + "  " + max);
    }
}
