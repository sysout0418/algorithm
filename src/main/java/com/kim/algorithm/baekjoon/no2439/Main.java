package com.kim.algorithm.baekjoon.no2439;

import java.io.*;

/**
 * 별 찍기 - 2
 *
 * 문제
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 *
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 * 출력
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 *
 * 예제 입력 1
 * 5
 * 예제 출력 1
 *     *
 *    **
 *   ***
 *  ****
 * *****
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            for (int j = a - 1; j > i; j--) {
                bw.write(" ");
            }
            for (int j = 0; j <= i; j++) {
                bw.write("*");

            }
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
