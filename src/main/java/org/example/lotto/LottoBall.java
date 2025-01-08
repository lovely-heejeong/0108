package org.example.lotto;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
//step 1. 명사로 클래스 정의
public class LottoBall {

    //로또 번호 필요
    int num;

    //int타입으로 번호 부여 - 제약조건 - 생성자 함수
    //public LottoBall(int value){
    //    this.num = value;
    // }



    //  Lombok은 어노테이션(@)을 사용하여 반복적인 코드 작성을 줄여줍니다.

    // @AllArgsConstructor가 아래 코드(매개변수가 있는 생성자 함수)를 대체함
    // public LottoBall(int num) {
    //    this.num = num;
    // }

    // @ToString이 아래 코드를 대체함
    // @Override
    // public String toString() {
    //    return "LottoBall{" +
    //           "num=" + num +
    //          '}';
    // }


    }



