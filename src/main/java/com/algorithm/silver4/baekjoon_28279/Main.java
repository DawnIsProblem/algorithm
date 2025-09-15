package com.algorithm.silver4.baekjoon_28279;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());

            if(input == 1){
                int value = Integer.parseInt(st.nextToken());
                dq.addFirst(value);
            } else if(input == 2) {
                int value = Integer.parseInt(st.nextToken());
                dq.addLast(value);
            } else if(input == 3) {
                sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append("\n");
            } else if(input == 4) {
                sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append("\n");
            } else if(input == 5) {
                sb.append(dq.size()).append("\n");
            } else if(input == 6) {
                sb.append(dq.isEmpty() ? 1 : 0).append("\n");
            } else if(input == 7) {
                sb.append(dq.isEmpty() ? -1 : dq.getFirst()).append("\n");
            } else if(input == 8) {
                sb.append(dq.isEmpty() ? -1 : dq.getLast()).append("\n");
            }
        }

        System.out.print(sb);
    }
}
