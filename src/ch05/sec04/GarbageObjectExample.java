package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행"; //hobby는 "여행" 객체의 메모리 주소를 가리키
        hobby = null; //"여행"에 해당하는 String 객체를 쓰레기로 만듬 | hobby가 더 이상 "여행" 객체를 참조하지 않는 상태가 됩 | "여행" 객체는 참조하는 변수가 없으므로 쓰레기(Garbage)가 됩

        String kind1 = "car";
        String kind2 = kind1; //kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
        kind1 = null; //"car"에 해당하는 String 객체는 쓰레기가 아님 | kind1은 더 이상 "car" 객체를 참조하지 않지만, kind2가 여전히 "car" 객체를 참조 > "car" 객체는 여전히 유효
        System.out.println("kind2: " + kind2); //kind2: car
    }
}
//