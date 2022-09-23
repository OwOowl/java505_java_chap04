package package2;

//    클래스 A는 접근제한자가 default이기 때문에 다른 패키지에서 사용 불가
//import package1.A;
//    클래스 B는 접근제한자가 public이기 때문에 다른 패키지에서 사용 가능
//import package1.B;
//
//public class C {
////    A a;
//    B b;
//}


import package1.A;

//  다른 패키지에 있는 클래스 A를 사용하여 객체 생성
//public class C {
////    클래스 A의 생성자 중 public을 사용한 생성자로 객체 생성
//    A a1 = new A(true);
////    클래스 A의 생성자 중 default를 사용한 생성자로 객체 생성 시도. 오류발생. 같은 패키지에서만 사용 가능
////    A a2 = new A(1);
////    클래스 A의 생성자 중 private을 사용한 생성자로 객체 생성 시도. 오류발생 . 해당 클래스 내부에서만 사용 가능
////    A a2 = new A("문자열");
//}


public class C {
    public C(){
        A a = new A();
        a.value1 = 1000;
//        a.value2 = 2000;    // default 오류
//        a.value3 = 3000;    // private 오류

        a.method1();
//        a.method2();    // default 오류
//        a.method3();    // private 오류
    }
}
