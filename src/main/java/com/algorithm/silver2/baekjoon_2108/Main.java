package com.algorithm.silver2.baekjoon_2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        // -4000 부터 4000까지(0포함 8001개)의 최빈값을 찾기위한 배열
        int[] range = new int[8001];
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            A[i] = a;
            range[a + 4000]++;
        }

        Arrays.sort(A);

        int one = 0;
        for (int i = 0; i < N; i++) {
            one += A[i];
        }
        one = (int) Math.round((double) one / N);
        sb.append(one).append('\n');

        int two = A[N / 2];
        sb.append(two).append('\n');

        int three = 0;
        int max = 0;
        boolean secondHigh = false;

        for (int i = 0; i < range.length; i++) {
            if (range[i] > max) {
                max = range[i];
            }
        }

        for (int i = 0; i <= 8000; i++) {
            if (range[i] == max) {
                three = i - 4000;
                if (secondHigh) {
                    break;
                }
                secondHigh = true;
            }
        }
        sb.append(three).append('\n');

        int four;
        if (N == 1) {
            four = 0;
        } else {
            four = A[N - 1] - A[0];
        }
        sb.append(four).append('\n');

        System.out.print(sb);
    }
}
