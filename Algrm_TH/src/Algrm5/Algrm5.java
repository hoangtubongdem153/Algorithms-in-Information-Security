/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algrm5;

import LibraryOfAlgrm.MathFunctions;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class Algrm5 {
    public static void main(String[] args) {
        int w = 8;
        Scanner sc=new Scanner(System.in);
        //nhap
        System.out.print("Nhap p (p<(2*32)): ");
        int p=sc.nextInt();
        System.out.print("Nhap a (a<p): ");
        int a = sc.nextInt();
        System.out.print("Nhap b (b<p): ");
        int b = sc.nextInt();
        int truTrenFp= (a-b)%p;
        // chuyen doi a,b thanh mang tu-w bit tren truong p
        ArrayList<Integer> arrA = new ArrayList<Integer>(MathFunctions.DecimalToWordByte(a, w, p));
        ArrayList<Integer> arrB = new ArrayList<Integer>(MathFunctions.DecimalToWordByte(b, w, p));
        MathFunctions.resultSum sum = MathFunctions.subtraction(arrA, arrB, w, p);
        //in
        System.out.print("Ket qua phep tru chinh xac boi:(e,c)= "+"("+sum.e+","+sum.c+")\n");
        System.out.println("Tru tren Fp: c= "+ truTrenFp);
    }
}
