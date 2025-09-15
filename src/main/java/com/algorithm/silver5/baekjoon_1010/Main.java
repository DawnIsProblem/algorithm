package com.algorithm.silver5.baekjoon_1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int X = Integer.parseInt(br.readLine());

        for (int y = 0; y < X; y++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int result = 1;

            for (int i = 1; i <= (M-N); i++) {
                result = result * (M-i+1) / i;
            }
            sb.append(result).append('\n');
        }
        System.out.print(sb);
    }
}
