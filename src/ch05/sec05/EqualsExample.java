package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동"; //동일한 "홍길동" 객체의 메모리 주소를 참조

        if (strVar1 == strVar2) { //==는 객체의 메모리 주소를 비교
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1 strVar2 문자열 같음");
        }

        System.out.println("=====================================");

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");//new String()을 사용해 각각 새로운 객체를 생성 > 다른 메모리 주소를 참조

        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3 strVar4 문자열 같음");
        }
    }
}
/*
* String 객체 변수에 문자열 리터럴이 대입되면,
* 문자열은 String 객체로 생성되고, 객체의 번지가 각각 대입
*
* String name1 = new String("홍길동")
* String name2 = new String("홍길동") //new 연산자로 직접 String 객ㅊ를 생성하고 대입 | 서로 다른 String 객체의 번치를 갖게 됨
*
*
*
* */

