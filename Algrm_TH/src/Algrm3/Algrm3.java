/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algrm3;

import LibraryOfAlgrm.MathFunctions;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class Algrm3 {
    public static void main(String[] args) {
        int w = 8;
        int p = 2147483647;
        Scanner sc=new Scanner(System.in);
        //nhap
        System.out.print("Nhap a (a<p): ");
        int a = sc.nextInt();
        System.out.print("Nhap b (b<p): ");
        int b = sc.nextInt();
        // chuyen doi a,b thanh mang tu-w bit
        ArrayList<Integer> arrA = new ArrayList<Integer>();
        ArrayList<Integer> arrB = new ArrayList<Integer>();
        arrA = MathFunctions.DecimalToWordByte(a, w, p);
        arrB = MathFunctions.DecimalToWordByte(b, w, p);
        MathFunctions.resultSum hieu = MathFunctions.subtraction(arrA, arrB, w, p);
        //in
        System.out.print("Ket qua phep tru chinh xac boi:(e,c)= "+"("+hieu.e+","+hieu.c+")\n");
    }
}
