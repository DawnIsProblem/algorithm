package com.algorithm.silver3.baekjoon_20920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /*
         * 1. 자주 나오는 단어 우선 배치
         * 2. 해당 단어의 길이가 길수록 앞에 배치
         * 3. 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치
         * */

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (M <= word.length()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        List<String> wordsList = new ArrayList<>(map.keySet());

        /*
         * compare(a, b) => b-a를 실행
         * 해당 값이 음수면 a가 b보다 크다 => a가 b의 앞으로
         * 해당 값이 양수면 a가 b보다 작다 => a가 b의 뒤로
         * */
        wordsList.sort((a, b) -> {
            // 빈도수 비교
            int c = Integer.compare(map.get(b), map.get(a));
            if (c != 0) {
                return c;
            }
            // 길이 비교
            c = Integer.compare(b.length(), a.length());
            if (c != 0) {
                return c;
            }
            // 오름차순 정렬
            return a.compareTo(b);
        });

        for (String w : wordsList) {
            sb.append(w).append('\n');
        }
        System.out.print(sb);
    }
}
