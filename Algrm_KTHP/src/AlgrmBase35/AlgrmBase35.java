/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase35;

import LibraryOfAlgrm.XuLySNT;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,t=0;
        while (n<1) {
            System.out.print("Nhap vao so can kiem tra (n>0): ");
            n = sc.nextInt();
        }
        while (t<1) {
            System.out.print("Nhap so lan lap (t>0): ");
            t = sc.nextInt();
        }
        boolean res = XuLySNT.isPrimeMillerRabin(n, t);
        if(res){
            System.out.println(n+" la so nguyen to !");
        }else {
            System.out.print(n+" khong la so nguyen to !");
        }
        System.out.println("\nXac suat dung la: "+(1-Math.pow(0.25, t)));
    }
}
