package Lv2;

import java.io.*;
import java.util.*;

public class No9498 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (90<=score)
            System.out.println("A");
        else if(80<=score)
            System.out.println("B");
        else if(70<=score)
            System.out.println("C");
        else if(60<=score)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
