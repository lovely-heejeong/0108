package org.example.knn;

public class Main {

    //타입, 이름, (파라미터, 변수)
    public static double calcDistance(Point p1, Point p2) {

        //지역변수
        double result = 0;

        //거리계산
        //squrt: 수학의 루트, pow: 제곱
        result = Math.sqrt(
                Math.pow(p1.xpos - p2.xpos, 2) +
                        Math.pow(p1.ypos - p2.ypos, 2)
        );
        return result; //return: 실행의 제어를 반납한다는 의미
    }

    public static void main(String[] args) {

        Point p1 = new Point(1,1);
        Point p2 = new Point(5,5);

        double distance = calcDistance(p1, p2);

        System.out.println(distance);
    }
}
