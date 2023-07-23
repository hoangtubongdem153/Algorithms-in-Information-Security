/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryOfAlgrm;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;

public class MathFunctions {
    // chuyen doi dang thap phan sang dang tu bitbvoi do dai tu w, truong p

    public static ArrayList<Integer> DecimalToWordByte(int n, int w, int p) {
        int m = (int) Math.ceil(Math.log(p) / Math.log(2));
        int t = (int) Math.ceil((double) m / w);
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            a.add((n >> (w * i)) & ((int) Math.pow(2, w) - 1));
        }
        Collections.reverse(a);
        return a;
    }

    // chuyen doi tu bit sang dang thap phan voi do dai tu w, truong p
    public static int WordByteToDecimal(ArrayList<Integer> a, int w, int p) {
        int n = 0;
        int m = (int) Math.ceil(Math.log(p) / Math.log(2));
        int t = (int) Math.ceil((double) m / w);
        for (int i = 0; i < t; i++) {
            n = (n << w) + a.get(i);
        }
        return n;
    }
    //dinh dang kieu tra ve cho phep cong tren truong p 

    public static class resultSum {

        public int e;
        public ArrayList<Integer> c;

        public resultSum(int e, ArrayList<Integer> c) {
            this.e = e;
            this.c = c;
        }
    }

    public static resultSum addition(ArrayList<Integer> arrA, ArrayList<Integer> arrB, int w, int p) {
        Collections.reverse(arrA);
        Collections.reverse(arrB);
        ArrayList<Integer> c = new ArrayList<>();
        int m = (int) Math.ceil(Math.log(p) / Math.log(2));
        int t = (int) Math.ceil((double) m / w);
        int e = 0;
        for (int i = 0; i < t; i++) {
            //tinh tong voi value % 255
            c.add((arrA.get(i) + arrB.get(i) + e) & ((int) Math.pow(2, w) - 1));
            //bien gia tri nho e
            e = ((arrA.get(i) + arrB.get(i) + e) >> w) & 1;
        }
        Collections.reverse(c);
        Collections.reverse(arrA);
        Collections.reverse(arrB);
        resultSum ketqua = new resultSum(e, c);
        return ketqua;
    }

    public static resultSum subtraction(ArrayList<Integer> arrA, ArrayList<Integer> arrB, int w, int p) {
        Collections.reverse(arrA);
        Collections.reverse(arrB);

        ArrayList<Integer> c = new ArrayList<>();
        int m = (int) Math.ceil(Math.log(p) / Math.log(2));
        int t = (int) Math.ceil((double) m / w);

        Integer e = 0;

        for (int i = 0; i < t; i++) {
            c.add((arrA.get(i) - arrB.get(i) - e) & ((int) Math.pow(2, w) - 1));
            e = ((arrA.get(i) - arrB.get(i) - e) >> w) & 1;
        }

        Collections.reverse(c);
        Collections.reverse(arrA);
        Collections.reverse(arrB);
        resultSum ketqua = new resultSum(e, c);
        return ketqua;
    }

    public static ArrayList<Integer> multiprecision(ArrayList<Integer> arrA, ArrayList<Integer> arrB, int w, int p) {
        Collections.reverse(arrA);
        Collections.reverse(arrB);
        //khoi tao mang c kich thuoc 2*t all value =0
        int m = (int) Math.ceil(Math.log(p) / Math.log(2));
        int t = (int) Math.ceil((double) m / w);
        ArrayList<Integer> c = new ArrayList<>(Collections.nCopies(t * 2, 0));
        for (int i = 0; i < t; i++) {
            int u = 0;
            for (int j = 0; j < t; j++) {
                int sum = c.get(i + j) + arrA.get(i) * arrB.get(j) + u;
                u = sum >> w;
                c.set(i + j, sum & 0xff);
            }
            c.set(i + t, u);
        }
        Collections.reverse(c);
        return c;
    }

    public static int nhanBinhPhuongLap(int a, int b, int c) {
        int result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % c;
            }
            b = b / 2;
            a = (a * a) % c;

        }
        return result;
    }
    public static int nhanBinhPhuongLapp(int a, int k, int n) {
        int b = 1;
        if (k == 0) {
            return b;
        }
        int A = a;
        int t = (int) Math.round(Math.log(k) / Math.log(2));
        if (k % 2 == 1) {
            b = a;
        }
        k >>= 1;
        for (int i = 1; i <= t; i++) {
            A = A * A % n;
            if (k % 2 == 1) {
                b = A * b % n;
            }
            k >>= 1;
        }
        return b;
    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static class resultExEuclid {

        public int x2, y2, u;

        public resultExEuclid(int u, int x2, int y2) {
            this.u = u;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    public static resultExEuclid extendEuclid(int a, int b) {
        int u = a;
        int v = b;
        int x1 = 0;
        int x2 = 1;
        int y1 = 1;
        int y2 = 0;

        while (v != 0) {
            int q = u / v;
            int r = u % v;

            int x = x2 - q * x1;
            int y = y2 - q * y1;

            x2 = x1;
            y2 = y1;
            x1 = x;
            y1 = y;

            u = v;
            v = r;

        }
        resultExEuclid ketqua = new resultExEuclid(u, x2, y2);
        return ketqua;
    }
    

}
