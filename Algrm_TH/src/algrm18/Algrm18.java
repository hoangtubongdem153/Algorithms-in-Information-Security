/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algrm18;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Thuat toan kmp tim kiem chuoi -cau 18  thuc hanh
 */
public class Algrm18 {

    /**
     */
    public static int[] failureFunction(String pattern) {
    int[] failure = new int[pattern.length()];
    failure[0] = 0;
    int j = 0, i = 1;

    while (i < pattern.length()) {
        if (pattern.charAt(i) == pattern.charAt(j)) {
            failure[i] = j + 1;
            i++;
            j++;
        } else if (j > 0) {
            j = failure[j - 1];
        } else {
            failure[i] = 0;
            i++;
        }
    }

    return failure;
}
    public static List<Integer> KmpSearch(String text, String pattern) {
    int n = text.length();
    int m = pattern.length();
    int[] failure = failureFunction(pattern);
    List<Integer> matches = new ArrayList<>();
    int i = 0, j = 0;

    while (i < n) {
        if (text.charAt(i) == pattern.charAt(j)) {
            if (j == m - 1) {
                matches.add(i - j);
                j = failure[j];
            } else {
                i++;
                j++;
            }
        } else if (j > 0) {
            j = failure[j - 1];
        } else {
            i++;
        }
    }

    return matches;
}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng ký tự chữ thứ nhất
        System.out.print("Nhap mang ky tu thu nhat: ");
        String input1 = scanner.nextLine();
        
        // Nhập mảng ký tự chữ thứ hai
        System.out.print("Nhap mang ky tu thu hai: ");
        String input2 = scanner.nextLine();
        
        //in ket qua
        System.out.println("Vi tri cua chuoi can tim la: ");
        System.out.println(KmpSearch(input1, input2));
        
        
    }
    
}
