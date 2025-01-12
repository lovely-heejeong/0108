package org.example.save;

public class PiggySave {

    //기본적으로 데이터 위주의 클래스
    //변수만 선언 - 유지하려고 하는 데이터
    //특별한 일 없으면 인스턴스 변수 앞에 거의 private(접근제한자) 사용
    private int total;

    //생성자 - 데이터가 변하므로 static은 쓰지 않음
    //입금, 출금 기능 선언
    //PiggySave에 접근해야 하니까 this.
    public void deposit(int amount){

        this.total += amount;
    }

    public int withdraw(){

        int result = this.total;
        this.total = 0;

        return result;

    }
}

