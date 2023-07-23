/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algrm2;

import java.util.Scanner;
import LibraryOfAlgrm.MathFunctions;
import java.util.ArrayList;
/**
 *
 * @author Tung
 */
public class Algrm2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
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
        MathFunctions.resultSum sum = MathFunctions.addition(arrA, arrB, w, p);
        //in
        System.out.print("Ket qua phep cong chinh xac boi:(e,c)= "+"("+sum.e+","+sum.c+")\n");
    }

}
