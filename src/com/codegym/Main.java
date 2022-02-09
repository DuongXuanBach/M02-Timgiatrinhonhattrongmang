package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Bước 1: Khai báo mảng số nguyên với SIZE phần tử
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
//
//          Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element:" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

//        Bước 3: Duyệt mảng từ phần tử thứ 2 đến hết mang
        int min = array[0];
        int index = 1;
        for(int j = 0; j < array.length; j++) {
            if(array[j] < min) {
                min = array[j];
                index = j + 1;
           }
        }
//        Bước 4: Kết thúc duyệt mảng. In ra giá trị nhỏ nhất.
        System.out.println("Min in the array is : " + min + "at position : " + index);
    }
}
