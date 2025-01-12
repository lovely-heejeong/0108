package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayEx {

    public static void main(String[] args) {

        //가변배열
        //<내용물의 타입> 명시, 대문자 사용
        ArrayList<Integer> list = new ArrayList<>();

        //인덱스 번호 몰라도 됨
        //int - Integer는 자동변환
        list.add(30);
        list.add(20);
        list.add(11);

        //Arrays.toString 쓰지 않고 그냥 써도 배열의 내용물 확인 가능
        System.out.println(list);
        System.out.println(list.size());

        //중간 내용물을 뺄 수도 있음
        list.remove(Integer.valueOf(20));
        System.out.println(list);
        System.out.println(list.size());

        //내용물 정렬
        //내부 알고리즘: Dual-pivot QuickSort 방법 이용 (JDK Ver.7~)
        Collections.sort(list);
        System.out.println(list);

    }
}
