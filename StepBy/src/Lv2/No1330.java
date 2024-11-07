package Lv2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No1330 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scanner.nextLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > b) {
            System.out.println(">");
        } else if (b > a) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }





}
