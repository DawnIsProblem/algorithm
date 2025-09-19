package com.algorithm.gold5.baekjoon_2447;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static char[][] coordinate;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        coordinate = new char[N][N];

        star(0, 0, N, false);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(coordinate[i][j]);
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }

    static void star(int x, int y, int N, boolean isBlank) {
        if (isBlank) {
            for (int i = x; i < x + N; i++) {
                for (int j = y; j < y + N; j++) {
                    coordinate[i][j] = ' ';
                }
            }
            return;
        }

        if (N == 1) {
            coordinate[x][y] = '*';
            return;
        }

        // 별이나 공백을 찍지 않고(즉, return되지 않고) 여기까지 오면 다시 star메서드를 호출
        int size = N / 3;
        int count = 0;

        for (int i = x; i < x + N; i += size) {
            for (int j = y; j < y + N; j += size) {
                count++;
                if (count == 5) { // 공백 칸일 경우
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                }
            }
        }
    }
}
