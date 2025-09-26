package com.algorithm.silver3.baekjoon_4779;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static char[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = br.readLine()) != null) {
            input = input.trim();

            if(input.isEmpty()){
                break;
            }

            int N = Integer.parseInt(input);
            int a = (int) Math.pow(3, N);
            result = new char[a];

            Arrays.fill(result, '-');

            cantor(0, a);

            sb.append(result).append('\n');
        }
        System.out.print(sb);

    }

    static void cantor(int start, int size) {
        if (size == 1) {
            return;
        }
        int nextSize = size / 3;
        for (int i = start + nextSize; i < start + (2 * nextSize); i++) {
            result[i] = ' ';
        }
        cantor(start, nextSize);
        cantor(start + (2 * nextSize), nextSize);
    }

}
