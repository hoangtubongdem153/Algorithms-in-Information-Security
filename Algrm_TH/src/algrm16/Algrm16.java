/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algrm16;

import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class Algrm16 {

    /**
     * @param text
     * @param pattern
     * @return 
     */
    public static int findString(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int i = 0, j = 0;
        while (i < n) {
            while (j < m) {
                if (j == m - 1 && pattern.charAt(j) == text.charAt(i)) {
                    return i - j;
                }
                if (pattern.charAt(j) == text.charAt(i)) {
                    i++;
                    j++;

                } else {
                    j = 0;
                    i++;
                    if(i>=n){
                        return -1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //nhap chuoi
        System.out.print("Nhap vao chuoi 1: ");
        String input1 = sc.nextLine();

        System.out.print("Nhap vao chuoi 2: ");
        String input2 = sc.nextLine();

        //xu ly
        if (findString(input1, input2) != -1) {
            System.out.print("Tim thay chuoi o vi tri: " + findString(input1, input2) + "\n");

        } else {
            System.out.print("Khong tim thay chuoi!\n");
        }

    }

}
