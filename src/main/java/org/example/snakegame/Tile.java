package org.example.snakegame;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class Tile {

    private int num;
    private String desc; //설명
    private String type; //뱀 or 고속도로
    private int moving; //타일 이동

    //Generate - Constructor
    //타일 번호 필요
    public Tile(int num) {
        this.num = num;
    }


}
