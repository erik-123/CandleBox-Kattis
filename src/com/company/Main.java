package com.company;
import java.util.Scanner;
import java.util.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int ageDif = sc.nextInt();
        int RCandle = sc.nextInt();
        int TCandle = sc.nextInt();

        int totalCandle = RCandle + TCandle;
        int countingInt = 0;
        int RCounting = 0;
        int RAge = 4;
        int TAge = 4 - ageDif;
        while (countingInt != totalCandle) {
            countingInt += RAge;
            RCounting += RAge;
            if(TAge >= 3) {
                countingInt += TAge;

            }
            RAge++;
            TAge++;
        }
        System.out.println(RCandle - RCounting);



        sc.close();
    }

}



