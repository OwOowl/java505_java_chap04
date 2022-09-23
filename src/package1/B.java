package package1;

//  접근 제한자 public 사용 (전체접근 가능)
//public class B {
////    A a;
//}



//  클래스 A를 사용하여 객체를 생성
//public class B {
////    클래스 A의 생성자 중 public을 사용한 생성자로 객체 생성
//    A a1 = new A(true);
////    클래스 A의 생성자 중 default를 사용한 생성자로 객체 생성. 같은 패키지에서만 사용 가능
//    A a2 = new A(1);
////    클래스 A의 생성자 중 private을 사용한 생성자로 객체 생성 시도. 오류발생 . 해당 클래스 내부에서만 사용 가능
////    A a3 = new A("문자열");
//}



public class B {
    public B() {
        A a = new A();
        a.value1 = 10;
        a.value2 = 20;
//        a.value3 = 30;    // private로 설정되어 해당 클래스 내에서만 사용가능. 오류발생

        a.method1();
        a.method2();
//        a.method3();      // private로 설정되어 해당 클래스 내에서만 사용가능. 오류발생
    }
}