package Lv2;

import java.util.Scanner;

/* 사분면 고르기
* (0,0) 기준으로 작성하면 쉽다.
* Quadrant1 Quadrant2 Quadrant3 Quadrant4
* */
public class No14681 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x>0 && y < 0) {
            System.out.println("4");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x<0 && y < 0) {
            System.out.println("3");
        }


    }
}
