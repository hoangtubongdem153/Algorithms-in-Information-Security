/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgrmBase34;

import java.util.Scanner;
import LibraryOfAlgrm.XuLySNT;

/**
 *
 * @author Tung
 * kiem tra fermat!
 */
public class AlgrmBase34 {
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
        boolean res = XuLySNT.isPrimeFermat(n, t);
        if(res){
            System.out.println(n+" la so nguyen to !");
        }else {
            System.out.print(n+" khong la so nguyen to !");
        }
        
    }
}
//Trong trường hợp n là số carmichael thì thuật toánn Fermat sẽ cho kết quả sai
//Điều kiện cần và đủ để hợp số n là số carmichael la:
// không chia hết cho bình phương của bất kỳ số nguyên tố nào
// n-1 chia het cho p-1 với mọi p là ước của n
