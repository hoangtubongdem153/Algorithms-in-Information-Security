/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algrm17;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * Bài 17. Cài đặt thuật toán tìm kiếm mẫu P trong đoạn văn bản T
 * kết quả trả về vị trí xuất hiện của mẫu P theo phương pháp Boyer-Moore
 * Thuật toán BM hiệu quả trong chuỗi chứa tập kí tự lớn như bảng chữ cái lớn A..Z,a..z,1..9,..
 * Không hiệu quả trong trường chứa tập kí tự nhỏ như nhị phân
 */
public class Algrm17 {

    /**
     * @param pattern
     * @return 
     */
    public static int[] createSuffixTable(String pattern) {
        
        int m = pattern.length();
        int[] suffixTable = new int[m];
        suffixTable[m - 1] = m - 1;
        int i = m - 2, j = m - 1;
        while (i >= 0) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                suffixTable[i] = j;
                i--;
                j--;
            } else{
                suffixTable[i] = i;
                i--;
            }
        }
        return suffixTable;
    }
    public static int boyerMooreSearch(String text, String pattern) {
        
        int n = text.length();
        int m = pattern.length();
        
        // create shift table using bad character rule
        int[] shift = new int[256];
        Arrays.fill(shift, m);
        for (int i = 0; i < m - 1; i++) {
            shift[pattern.charAt(i)] = m - i - 1;
        }
        
        // create frequency table for good suffix rule
        int[] suffixShift = new int[m];
        int[] suffixTable = createSuffixTable(pattern);
        Arrays.fill(suffixShift, m);
        for (int i = m - 1; i >= 0; i--) {
            if (suffixTable[i] == i + 1) {
                for (int j = 0; j < m - i - 1; j++) {
                    if (suffixShift[j] == m) {
                        suffixShift[j] = m - i - 1;
                    }
                }
            }
        }
        for (int i = 0; i < m - 1; i++) {
            suffixShift[m - suffixTable[i] - 1] = m - i - 1;
        }
        
        // search for pattern in text
        int i = m - 1;
        while (i < n) {
            int j = m - 1;
            while (j >= 0 && text.charAt(i) == pattern.charAt(j)) {
                i--;
                j--;
            }
            if (j == -1) {
                return i + 1;
            }
            i += Math.max(shift[text.charAt(i)], suffixShift[j]);
        }
        
        return -1;
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
        System.out.println(createSuffixTable(input2));
        int index = boyerMooreSearch(input1, input2);
        
        if (index == -1) {
            System.out.println("Khong tim thay chuoi");
        } else {
            System.out.println("Tim thay chuoi o vi tri " + index);
        }
    }
    
}
