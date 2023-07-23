/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryOfAlgrm;

import static java.lang.Math.log;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Tung
 */
public class XuLySNT {

    public static boolean isPrime(int n) {
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

    public static int gcd(int a, int b) {
        while (b > 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
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

    public static void cSangErosthenes(int n) {
        boolean[] Eros = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            Eros[i] = true;
        }
        //kiem tra
        for (int i = 2; i <= n; i++) {
            if (Eros[i] == true) {
                for (int j = 2 * i; j <= n; j += i) {
                    Eros[j] = false;
                }
            }
        }
        System.out.println("Day so nguyen to (p<=n) : ");
        for (int i = 2; i <= n; i++) {
            if (Eros[i] == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean[] eratothenes(int n) {
        boolean[] prime = new boolean[n + 1];
        prime[0] = false;
        prime[1] = false;
        for (int p = 2; p <= n; p++) {
            prime[p] = true;
        }
        for (int p = 2; p <= n; p++) {
            if (prime[p]) {
                for (int i = p + p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        return prime;
    }

    public static List<Integer> phantichthuaso(int n) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 2, a = n;
        while (a > 1 && i <= n / 2) {
            if (a % i == 0) {
                a /= i;
                if (!list.contains(i)) {
                    list.add(i);
                }
            } else {
                i++;
            }
        }
        if (list.isEmpty()) {
            list.add(a);
        }
        return list;
    }

    public static boolean isPrimeFermat(int n, int t) {
        if (n == 2) {
            return true;
        }
        if (n < 2 || n % 2 == 0) {
            return false;
        }
        Random rand = new Random();
        for (int i = 0; i < t; i++) {
            int a = rand.nextInt(n - 2) + 2;
            if (nhanBinhPhuongLap(a, n - 1, n) != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeMillerRabin(int n, int t) {
        if (n == 2) {
            return true;
        }
        if (n < 3 || n % 2 == 0) {
            return false;
        }
        int r = n - 1;

        while (r % 2 == 0) {
            //s++;
            r /= 2;
        }
        int s = (int) (log((n - 1) / r) / log(2));
        Random rand = new Random();
        for (int i = 1; i <= t; i++) {
            int a = rand.nextInt(n - 2) + 2;            
            int y = nhanBinhPhuongLap(a, r, n);
            if (y != 1 && y != n - 1) {
                int j = 1;
                while (j <= s - 1 && y != n - 1) {
                    y = (y * y) % n;
                    if (y == 1) {
                        return false;
                    }
                    j++;
                }
                if (y != n - 1) {
                    return false;
                }
            }

        }

        return true;
    }

    public static void printPrimePairs(int n) {
        boolean[] prime = eratothenes(n);
        System.out.print("Cac cap so thoa man la: ");
        boolean empty = true;
        int pre = -1;
        for (int i = 3; i <= n; i += 2) {
            if (prime[i]) {
                if (pre != -1) {
                    empty = false;
                    System.out.println("(" + pre + "," + i + ")");
                }
                pre = i;
            } else {
                pre = -1;
            }
        }
        if (empty) {
            System.out.println("Không có cặp số nào.");
        }
    }

    public static int getRandomBit(int k) {
        Random rand = new Random();
        return rand.nextInt((int) Math.pow(2, k));
    }

    public static int randomSearch(int k, int t) {
        int n = getRandomBit(k);
        for (int i = 2; i < 100; i++) {
            if (n == i) {
                continue;
            }
            if (n % i == 0) {
                return randomSearch(k, t);
            }
        }
        if (isPrimeMillerRabin(n, t)) {
            return n;
        }
        return randomSearch(k, t);
    }
}
