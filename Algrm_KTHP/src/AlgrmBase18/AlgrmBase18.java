/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase18;

import LibraryOfAlgrm.MathFunctions;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap a (a>0) : ");
        int a = sc.nextInt();
        while(a<1){
            System.out.print("Moi ban nhap lai: ");
            a=sc.nextInt();
        }
        System.out.print("Nhap b (b>0) : ");
        int b = sc.nextInt();
        while(b<1){
            System.out.print("Moi ban nhap lai: ");
            b=sc.nextInt();
        }
        
        int w = 8, p = 2147483647;

        ArrayList<Integer> arrA = new ArrayList<Integer>();

        ArrayList<Integer> arrB = new ArrayList<Integer>();
        arrA = MathFunctions.DecimalToWordByte(a, w, p);
        arrB = MathFunctions.DecimalToWordByte(b, w, p);

        MathFunctions.resultSum sum = MathFunctions.addition(arrA, arrB, w, p);

        System.out.println("Tong tren truong Fp: ");
        System.out.print("Dang ma tran: " + sum.c + " e=" + sum.e);
        System.out.print("\nDang so nguyen: " + MathFunctions.WordByteToDecimal(sum.c, w, p) + "\n");
    }
}
