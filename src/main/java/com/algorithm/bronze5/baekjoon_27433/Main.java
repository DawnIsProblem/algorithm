package com.algorithm.bronze5.baekjoon_27433;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        long result = 1;

        for (int i = N; 1 <= i; i--) {
            result *= i;
        }

        sb.append(result);
        System.out.print(sb);
    }
}
