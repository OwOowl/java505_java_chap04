public class Circle {
//    클래스 Circle의 멤버 변수(필드) : 고유값
//    선언
//      멤버 변수는 클래스 안에 선언 (메서드 안에 선언하지 않음)
//    사용
//      1. 메서드 내에서 사용함(일반 변수 사용법과 동일)
//         단, 클래스의 멤버 변수 선언부에서 연산은 불가능(메서드 내부에서 사용해야 함)
//      2. 해당 클래스 외부에서 클래스를 통한 객체 생성 후 '객체명.멤버변수명' 형태로 사용

    int radius;
    String name;

//   클래스 Circle의 멤버 메서드(메서드) : 기능
    public  double getArea() {
        return 3.14 * radius * radius;
    }
}
