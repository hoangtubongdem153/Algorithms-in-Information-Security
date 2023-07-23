/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase40;

import LibraryOfAlgrm.XuLySNT;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase40 {

    /**
     *
     * @author Tung
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so phan tu mang (n>0): ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Vui long nhap vao mot so nguyen duong: ");
            n = sc.nextInt();
        }
        System.out.println("Nhap vao mang: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]<1){
                System.out.print("Nhap so nguyen duong! Nhap lai: ");
                arr[i]=sc.nextInt();
            }
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        boolean[] prime = XuLySNT.eratothenes(max);

        boolean check = false;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (prime[gcd(arr[i], arr[j])]) {
                    count++;
                    check = true;
                }
            }
        }
        if (check == false) {
            System.out.println("Khong co cap so nao!");
        } else {
            System.out.print("So cac cap so thoa man la: " + count + "\n");
        }
    }
}
