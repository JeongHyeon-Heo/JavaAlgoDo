package Lv2;

import java.util.Scanner;

/* 윤년 출력 문제 */
public class No2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year / 4 == 0 && year / 100 != 0 || year % 400 == 0) {
            System.out.println("1");
        }
        else
            System.out.println("0");

    }
}