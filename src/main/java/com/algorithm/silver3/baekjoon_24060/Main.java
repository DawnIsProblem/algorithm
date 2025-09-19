package com.algorithm.silver3.baekjoon_24060;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int K;
    static int count = 0;
    static int answer = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st1.nextToken());
        K = Integer.parseInt(st1.nextToken());
        int[] A = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st2.nextToken());
        }

        int[] temp = new int[N];
        mergeSort(A, temp, 0, N - 1);

        sb.append(answer);
        System.out.print(sb);
    }

    static void mergeSort(int[] A, int[] temp, int left, int right) {
        if (left >= right) {// 계속 절반으로 쪼개서 계속 정렬
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(A, temp, left, mid);
        mergeSort(A, temp, mid + 1, right);
        merge(A, temp, left, mid, right);
    }

    static void merge(int[] A, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= right) {
            if (A[i] <= A[j]) {
                temp[t++] = A[i++];
            } else {
                temp[t++] = A[j++];
            }
        }

        // 밑의 2개의 while문이 동작한다는 것은 좌, 우 중 하나가 temp배열에 대입이 끝났음을 알림
        while (i <= mid) {
            temp[t++] = A[i++];
        }

        while (j <= right) {
            temp[t++] = A[j++];
        }

        // 이후 answer값 도출
        t = 0;
        int idx = left;
        while (idx <= right) {
            A[idx] = temp[t++];
            count++;
            if (count == K) {
                answer = A[idx];
            }
            idx++;
        }
    }

}
