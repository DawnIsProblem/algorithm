package com.algorithm.bronze1.baekjoon_1037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long result;

        if (N == 1) {
            result = Integer.parseInt(st.nextToken());
            result = result * result;
            sb.append(result);
        } else if (N == 2) {
            long A = Integer.parseInt(st.nextToken());
            long B = Integer.parseInt(st.nextToken());
            result = A * B;
            sb.append(result);
        } else if (2 < N) {
            long x = Integer.parseInt(st.nextToken());
            long y = Integer.parseInt(st.nextToken());
            long big = Math.max(x, y);
            long small = Math.min(x, y);
            for (int i = 0; i < N - 2; i++) {
                long a = Integer.parseInt(st.nextToken());
                if (big < a) {
                    big = a;
                } else if (a < small) {
                    small = a;
                }
            }
            result = big * small;
            sb.append(result);
        }

        System.out.print(sb);
    }
}
