package ch05.sec04;

public class NullPointerExceptionExample { //null인 상태의 참조 변수가 사용되고 있음
    public static void main(String[] args) {

        int[] intArray = null;
//        intArray[0] = 10;//NullPointerException

        String str = null;
//        System.out.println(str.length());

//        //null도 초기값으로 사용 가능
//        String refVar1 = "자바";
//        String refVar2 = null;
//
//        //참조 타입 변수가 null값을 가지는지 확인
//        refVar1 == null;
//        refVar1 != null;
//        refVar2 == null;
//        refVar2 != null;
    }
}
/*
* null: 참조타입 변수가 아직 번지를 저장하고 있지 않음
* null도 초기값으로 사용가능
*    String refVar2 = null;
*   */
