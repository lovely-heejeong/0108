package org.example;

import org.example.knn.Point;
import org.example.lotto.LottoBall;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static double calcDistance(Point p1, Point p2) {

        double result = 0;

        result = Math.sqrt(
                Math.pow(p1.xpos - p2.xpos, 2) +
                        Math.pow(p1.ypos - p2.ypos, 2)
        );
        return result;
    }


    public static void main(String[] args) {


//        ArrayList<LottoBall> balls = new ArrayList<>();
//
//        for(int i = 1; i <= 45; i++){
//            balls.add(new LottoBall(i));
//        }
//
//        for (int i = 0; i < 3; i++) {
//            Collections.shuffle(balls);
//            System.out.println(balls.subList(0,6));
//            System.out.println("--------------------");
//            System.out.println(balls.size());


//               LottoBall b1 = new LottoBall(1);
//               balls.add(b1);
//               balls.add(new LottoBall(1));
//               System.out.println(balls);
//        }

    }
}







