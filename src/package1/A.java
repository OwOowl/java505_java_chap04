package package1;

//  접근 제한자 표시가 없으면 default 사용.
//  접근 제한자 default 사용 중(다른 패키지에서 사용 불가).
//class A {
////    B b = new B();
//    
//    
//    
//    
//}



//  생성자 접근 제한
//public class A {
////    멤버 변수
////    클래스의 객체를 생성하기 위해 생성자를 호출하는 부분
//
////    접근 제한자가 public인 생성자를 사용하여 객체 생성
//    A a1 = new A(true);
////    접근 제한자가 default인 생성자를 사용하여 객체 생성
//    A a2 = new A(1);
////    접근 제한자가 private인 생성자를 사용하여 객체 생성
//    A a3 = new A("문자열");
//
////    생성자
////    접근 제한자가 public인 생성자
//    public A(boolean b) {}
////    접근 제한자가 default인 생성자.
//    A(int b) {}
////    접근 제한자가 private인 생성자.
//    private A(String s) {}
//}


public class A {
    public int value1;
    int value2;
    private int value3;

    public A() {
//        생성자는 해당 클래스 내에서 동작
//        접근 제한자에 상관없이 모든 멤버 변수에 접근 가능
        value1 =1;
        value2 =1;
        value3 =1;
    }

    public void method1() {}
    void method2() {}
    private void method3() {}
}