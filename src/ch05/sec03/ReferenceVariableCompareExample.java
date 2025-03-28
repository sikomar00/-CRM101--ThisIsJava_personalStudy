package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1, 2, 3};
        arr2 = new int[] {1, 2, 3}; //저장 항목은 같지만 서로 다른 배열 객체로 생성되므로 각 변수에 대입되는 번지는 다름
        arr3 = arr2;//두 변수는 동일한 번지를 가지고 같은 배열 참조

        System.out.println(arr1 == arr2);//같은 배열을 참조하는지 검사 | false
        System.out.println(arr2 == arr3);//true
        System.out.println(arr3 == arr1);
    }
}

/*
* 참조 타입 변수의 값은 객체의 번지이므로
* 참조 타입 변수의 ==, != 연산자는 '번지'를 비교하는 것.
* 번지가 같다면 동일한 객체를 참조하는 것
* 다르다면 다른 객체를 참조하는 것
* */