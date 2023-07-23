/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algrm15;

import java.util.Arrays;
import LibraryOfAlgrm.XuLySNT;
import java.util.Scanner;

/**
 * khong hieu, khong biet lam a
 *
 * @author Tung
 */
public class Algrm15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        System.out.print("Nhap vao so bit(k>0): ");
        int k=sc.nextInt();
        System.out.println("So nguyen to: "+XuLySNT.randomSearch(k, 10));
        
    }
}
    
