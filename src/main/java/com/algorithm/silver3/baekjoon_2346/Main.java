package com.algorithm.silver3.baekjoon_2346;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Integer> dq1 = new ArrayDeque<>();
        Deque<Integer> dq2 = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            dq1.addLast(i);
            dq2.addLast(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < N; i++) {
            int popBalloon = dq1.pollFirst();
            int number = dq2.pollFirst();
            sb.append(popBalloon).append(" ");

            if (dq1.isEmpty()) {
                break;
            }

            if (0 < number) {
                int turn = (number-1) % dq1.size();
                for (int j = 0; j < turn; j++) {
                    dq1.addLast(dq1.pollFirst());
                    dq2.addLast(dq2.pollFirst());
                }
            } else {
                int turn = -(number) % dq1.size();
                for (int j = 0; j < turn; j++) {
                    dq1.addFirst(dq1.pollLast());
                    dq2.addFirst(dq2.pollLast());
                }
            }
        }
        System.out.print(sb);
    }
}