package com.algorithm.silver3.baekjoom_15650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] choice;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        choice = new int[M];
        dfs(N, M, 0, 1);

        System.out.print(sb);
    }

    static void dfs(int N, int M, int depth, int start) {
        if (M == depth) {
            for (int i = 0; i < M; i++) {
                sb.append(choice[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i <= N; i++) {
            choice[depth] = i;
            dfs(N, M, depth + 1, i + 1);
        }
    }

}

