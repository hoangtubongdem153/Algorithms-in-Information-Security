/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algrm8;

import java.util.Scanner;
import LibraryOfAlgrm.MathFunctions;

/**
 *
 * @author Tung thuat toan eclid mo rong
 */
public class Algrm8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;

        while (a < 1) {
            System.out.print("Nhap a: ");
            a = sc.nextInt();
        }
        while (b < 1) {
            System.out.print("Nhap b: ");
            b = sc.nextInt();
        }
        MathFunctions.resultExEuclid ketqua = MathFunctions.extendEuclid(a, b);
        System.out.print("Ket qua : u=(a,b)= " + ketqua.u + "\n");
        if (ketqua.u == 1) {
            System.out.print("a^(-1)mod b= " + ketqua.x2 + "\n");
            System.out.print("b^(-1)mod a= " + ketqua.y2 + "\n");
        }
    }

}
