package com.algorithm.bronze2.baekjoon_10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] fibonacci = new int[N + 1];

        if (N == 0) {
            fibonacci[0] = 0;
        } else if (N == 1) {
            fibonacci[0] = 0;
            fibonacci[1] = 1;
        } else if (2 <= N) {
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            for (int i = 2; i <= N; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        sb.append(fibonacci[N]);
        System.out.print(sb);
    }
}
