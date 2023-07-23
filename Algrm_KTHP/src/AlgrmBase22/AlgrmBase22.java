/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase22;

import java.util.Scanner;
import LibraryOfAlgrm.XuLySNT;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tung
 */
public class AlgrmBase22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao L (L>0): ");
        int l = sc.nextInt();
        while(l<1){
            System.out.print("Moi ban nhap lai: ");
            l=sc.nextInt();
        }
        System.out.print("Nhap vao R (R>L): ");
        int r = sc.nextInt();
        while(r<=l){
            System.out.print("Moi ban nhap lai: ");
            r=sc.nextInt();
        }
        boolean[] prime = XuLySNT.eratothenes(r);
        List<Integer> res = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (prime[i]) {
                res.add(i);
            }
        }

        int sum = 0;
        for (int i = 0; i < res.size() - 1; i++) {
            for (int j = i + 1; j < res.size(); j++) {
                sum += res.get(i) * res.get(j);
            }
        }
        System.out.println("Tong thoa man: " + sum);
    }
}
