package org.example.game2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //박스 배열
        ArrayList<Box> boxes = new ArrayList<>();

        //데이터 넣기
        boxes.add(new Box("일을 하기는 하는데 뭘 하고 있는지 잘 모르겠다.", 1,3));
        boxes.add(new Box("일과 관련한 기록을 어떤 방식으로든 하고 있다.", 2,5));
        boxes.add(new Box("주변에 일 고민을 나눌 수 있는 사수나 동료가 없다.", 4,8));
        boxes.add(new Box("지나온 커리어가 나에게 어떤 의미인지 잘 알고 있다.", 6,4));
        boxes.add(new Box("지금 나에게 가장 필요한 건 일에 대한 피드백이다.", 8,7));
        boxes.add(new Box("일에서 실수가 잦은 게 고민이다.", 8,7));
        boxes.add(new Box("나의 커리어패스나 경험을 눈에 보이는 방식으로 한번 정리하고 싶다.", 9,7));
        boxes.add(new Box("사이드 프로젝트에 대한 생각이 있다.", 15,10));
        boxes.add(new Box("분명히 했던 일인데 또 하려면 어떻게 했는지 기억이 잘 나지 않는다.", 11,9));
        boxes.add(new Box("내 감정을 잘 설명하고 싶다.", 12,10));
        boxes.add(new Box("긴 글을 쓰고 싶다는 마음이 늘 있다.", 13,11));
        boxes.add(new Box("내가 일에서 뭘 원하는지, 뭘 하고 싶지 않은지 알고 싶다.", 14,15));

        boxes.add(new Box("A타입: 내가 어떻게 일하는지, 내 강점은 무엇인지 스스로 이미 너무 잘 알고 있어요."));
        boxes.add(new Box("B타입: 일에 대해 뭔가 하고 싶은 이야기는 있는데, 그게 어떤 방식으로 쓰일 수 있을지 감이 잡히지 않죠."));
        boxes.add(new Box("C타입: 일을 하고 있지만 내가 뭘 배우고 있는지, 내가 어떻게 '일하는 나'를 만들어가고 있는지 아직은 의문인 당신."));
        boxes.add(new Box("D타입: 지금 하고 있는 일에서 크게 고민되는 게 없거나, 지금 하는 일에 지루함을 느끼는 상황인가요?."));


        //현재 위치
        int currentIndex = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("심리테스트를 시작하려면 ENTER");
            scanner.nextLine();

            //첫번째 문제 출력


            System.out.println("YES 1, NO 2");

            //선택
            int choice = Integer.parseInt(scanner.nextLine());



            //yes, no일 경우 이동
            if (choice == 1) {

            } else {

            }

            //12번쨰 박스에서 종료
            if (currentIndex >= 12){


            }
        }




    }

}
