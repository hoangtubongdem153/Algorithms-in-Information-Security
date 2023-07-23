/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algrmbase16;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class AlgrmBase16 {

    /**
     * @param args the command line arguments
     */
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Nhap kich thuoc mang (n>0): ");
        int n = sc.nextInt();
        while(n<1){
            System.out.print("Moi ban nhap lai: ");
            n=sc.nextInt();
        }
        boolean co = false;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> prime = new ArrayList<Integer>();
        //tao mang ngau nhien kich thuoc n
        for (int i = 0; i < n; i++) {
            int x = rand.nextInt(100);
            arr.add(x);
            if (!prime.contains(x) && isPrime(x)) {
                prime.add(x);
                co = true;
            }
        }
        System.out.print("Mang ngau nhien la: " + arr + "\n");
        // kiem tra va in mang snt
        if (co == false) {
            System.out.print("Khong co so nguyen to nao trong mang!");
        } else {
            System.out.print("Cac so nguyen to trong mang la: " + prime + "\n");
        }

    }
}
