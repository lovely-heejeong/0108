package org.example.knn;

public class Point {

    public String type; //J or Z
    public int xpos; //x좌표
    public int ypos; //y좌표

    //2가지 방법 존재 - 데이터(인자) 3개 다 주거나 데이터 2개만 주거나
    //Generate - Constructor
    public Point(String type, int xpos, int ypos) {
        this.type = type;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public Point(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }

}
