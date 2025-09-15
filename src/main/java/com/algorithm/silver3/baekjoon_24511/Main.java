package com.algorithm.silver3.baekjoon_24511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 자료구조의 갯수
        int N = Integer.parseInt(br.readLine());

        // 자료구조의 구성
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] stackQueue = new int[N];
        for (int i = 0; i < N; i++) {
            stackQueue[i] = Integer.parseInt(st.nextToken());
        }

        // 배열
        st = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        // 수열의 길이
        int length = Integer.parseInt(br.readLine());

        // 삽입할 원소
        st = new StringTokenizer(br.readLine());

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            if (stackQueue[i] == 0) {
                dq.addLast(array[i]);
            }
        }

        for (int i = 0; i < length; i++) {
            int x = Integer.parseInt(st.nextToken());
            dq.addFirst(x);
            sb.append(dq.pollLast()).append(" ");
        }

        System.out.print(sb);
    }
}
