package org.example.game2;


public class Box {

    private String text; //질문, 설명
    private int yesIndex; //yes 이동위치
    private int noIndex; //no 이동위치

    //설명 + yes, no 없는 상자 4개
    public Box(String text) {
        this.text = text;
    }

    //질문 + yes, no 있는 상자 12개
    public Box(String text, int yesIndex, int noIndex) {
        this.text = text;
        this.yesIndex = yesIndex;
        this.noIndex = noIndex;
    }
}
