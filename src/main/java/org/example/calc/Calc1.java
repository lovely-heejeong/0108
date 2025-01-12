package org.example.calc;

public class Calc1 {

    //f(x)=y에 해당
    public static int plus(int x, int y){

        //초기화
        int result = x + y;

        return result;
    } //내가 호출하려면 Calc1.plus(10,20)

    public static int roll(){ //static은 클래스에 붙는 스티커
        int result = 0;

        result = (int)(Math.random() * 6) + 1;

        return result;
    }


}
