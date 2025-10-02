package com.algorithm.silver3.baekjoon_15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] choice;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        choice = new int[M];
        visit = new boolean[N];

        dfs(N, M, 0);

        System.out.print(sb);
    }

    static void dfs(int N, int M, int depth) {
        if (M == depth) {
            for (int i = 0; i < M; i++) {
                sb.append(choice[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i ++) {
            if(!visit[i]){
                visit[i] = true;
                choice[depth] = i+1;
                dfs(N, M, depth+1);
                visit[i] = false;
            }
        }
    }

}
