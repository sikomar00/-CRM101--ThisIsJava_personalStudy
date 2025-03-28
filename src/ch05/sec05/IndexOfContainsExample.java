package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");//subject 변수에서 programming의 시작 인덱스를 location에저장
        System.out.println(location); //3('프'의 시작 위치)
        String substring = subject.substring(location);// == substring(3): 3부터 끝까지 잘라내기
        System.out.println(substring); //프로그래밍

        location = subject.indexOf("자바"); //3 =
        if (location != -1) {//주어진 문자열이 포함되지 않은 경우, indexOf는 -1을 리턴
            System.out.println("자바와 관련돈 책이군요");
        } else {
            System.out.println("자바와 관련없는 책");
        }
        
        boolean result = subject.contains("자바"); //주어진 문자열의 단순 포함 여부 조사 > treu / false
        if (result) {
            System.out.println("자바와 관련 책");
        } else {
            System.out.println("자바와 관련 없는 책");
        }
    }
}
