package com.algorithm.bronze2.baekjoon_25501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int  count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            int b = isPalindrome(s);

            sb.append(b).append(" ").append(count).append('\n');
        }
        System.out.print(sb);
    }

    public static int recursion(String s, int l, int r) {
        count++;
        if (l >= r) {
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {
            return recursion(s, l + 1, r - 1);
        }
    }

    public static int isPalindrome(String s) {
        count = 0;
        return recursion(s, 0, s.length() - 1);
    }

}
