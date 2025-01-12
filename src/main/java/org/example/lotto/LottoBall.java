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
    //Generate - Constructor 기능으로 간단하게 생성
    //public LottoBall(int value){
    //    this.num = value;
    // }

    //  Lombok은 어노테이션(@)을 사용하여 반복적인 코드 작성을 줄여줌

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
    public static void main(String[] args) {

        LottoBall b1 = new LottoBall(10);
        System.out.println(b1); //toString 만들고 나면 b1의 값이 나옴, 결과: LottoBall(num=10)

        //LottoBall은 타입: 내가 만든 클래스
//        ArrayList<LottoBall> balls = new ArrayList<>();

//            LottoBall b1 = new LottoBall(1);
//            balls.add(b1);
//            balls.add(new LottoBall(1)); //Lottoball의 리모컨을 balls 상자에 넣음
//            System.out.println(balls);

        //루프를 써보면...
        //인덱스 번호는 몰라도 됨
//        for(int i = 1; i <= 45; i++){
//            balls.add(new LottoBall(i));
//        }

        //재사용 - 로또 3번 뽑고 싶으면...
//        for (int i = 0; i < 3; i++) {
//            Collections.shuffle(balls); //공 섞기
//            System.out.println(balls.subList(0,6)); //인덱스 0부터 6번 전까지 끊어냄
//            System.out.println("--------------------");
//            System.out.println(balls.size()); //결과는 45, sublist를 한다고 해서 공이 줄어드는 것은 아님
//        }

    }
}









