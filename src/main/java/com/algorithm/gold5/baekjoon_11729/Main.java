package com.algorithm.gold5.baekjoon_11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int K = (int) Math.pow(2, N) - 1;
        sb.append(K).append('\n');

        hanoi(N, 1, 3, 2);

        System.out.print(sb);
    }

    static void hanoi(int N, int start, int to, int sub) {
        if(N==0){
            return;
        }

        hanoi(N-1, start, sub, to );
        sb.append(start).append(" ").append(to).append('\n');
        hanoi(N-1, sub, to, start);
    }

}
