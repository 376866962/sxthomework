package day03;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] num = new int[8];
        System.out.println("请输入8个数：");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            num[i] = sc.nextInt();
        }
        check(num);
    }

    private static void check(int[] num) {
        //统计奇数和偶数的个数m,n
        int m = 0, n = 0;
        for (int i = 0; i <= num.length-1; i++) {
            if (num[i] % 2 != 0) {
                m++;
            } else
                n++;
        }
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];

        //num按照奇数、偶数分别存放到两个数组arr1，arr2中
        int a = 0;
        int b = 0;
        for (int i = 0; i <= num.length-1; i++) {
            if (num[i] % 2 != 0) {
                arr1[a] = num[i];
                a++;
            } else {
                arr2[b] = num[i];
                b++;
            }
        }

        if (arr2.length > arr1.length) {  //如果偶数个数较多
            for (int i = 0; i <= arr1.length - 1; i++) { //把奇数全部输完
                System.out.print(arr1[i] + " " + arr2[i] + " ");
            }
            for (int i = arr1.length; i <= arr2.length - 1; i++) { //输出剩下的偶数
                System.out.print(arr2[i] + " ");
            }
        } else {  //如果奇数个数较多
            for (int i = 0; i <= arr2.length - 1; i++) { //把偶数全部输完
                System.out.print(arr1[i] + " " + arr2[i] + " ");
            }
            for (int i = arr2.length; i <= arr1.length - 1; i++) {  //输出剩下的奇数
                System.out.print(arr1[i] + " ");
            }
        }
    }
}