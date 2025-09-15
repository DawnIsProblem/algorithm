package com.algorithm.silver4.baekjoon_25192;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            if(name.equals("ENTER")){
                set.clear();
            } else {
                if(set.contains(name)){
                    continue;
                }
                set.add(name);
                result++;
            }
        }
        sb.append(result);
        System.out.print(sb);
    }
}
