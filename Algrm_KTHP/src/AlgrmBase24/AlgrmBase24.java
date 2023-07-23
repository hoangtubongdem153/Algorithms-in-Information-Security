/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase24;

import java.util.Scanner;
import LibraryOfAlgrm.XuLySNT;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Tung
 */
public class AlgrmBase24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao A (A>0): ");
        int a = sc.nextInt();
        while(a<1){
            System.out.print("Moi ban nhap lai: ");
            a=sc.nextInt();
        }
        System.out.print("Nhap vao B (B>A): ");
        int b = sc.nextInt();
        while(b<1){
            System.out.print("Moi ban nhap lai: ");
            b=sc.nextInt();
        }
        int count=0;
        boolean[] prime = XuLySNT.eratothenes(b);
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 1; i < Math.ceil(Math.sqrt(b)); i++) {
            if (i * i < b) {
                for (int j = 1; j < Math.ceil(Math.sqrt(b)); j++) {
                    if ((a <= i * i + j * j) && (i * i + j * j <= b) && prime[i * i + j * j]) {
                        if(!res.contains(i * i + j * j)){
                        res.add(i * i + j * j);
                        count++;
                    }
                }
            }
        }
        }
        if (res.size() == 0) {
            System.out.println("Khong co so nao!");
        } else {
                System.out.print("So cac so thoa man la: "+count);
            }
        }
    }

