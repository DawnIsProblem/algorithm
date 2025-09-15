package com.algorithm.bronze5.baekjoon_10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            sb.append(1);
        } else {
            int result = N;
            for (int i = N-1; 1 <= i ; i--) {
                result *= i;
            }
            sb.append(result);
        }
        System.out.print(sb);
    }
}
