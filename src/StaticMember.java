public class StaticMember {
    public static void main(String[] args) {

//        객체 생성 후 객체의 멤버를 사용
//        static : 정적멤버. 정적멤버는 일반객체 멤버 접근불가
//        정적멤버는 정적멤버만 사용가능
        StaticClass sc1 = new StaticClass();
        sc1.getInfo();
        System.out.println("나이 : " + sc1.age);
        System.out.println("이름 : " + sc1.name);


        StaticClass.job = "가수";
        System.out.println("static 직업 : " + StaticClass.job);
        StaticClass.getJob();


        System.out.println("\n\n");


//        Calc 클래스의 멤버 메서드인 abs, max, min이 모두 정적 멤버이기 때문에 객체생성없이 '클래스.이름'으로 직접 접근 가능
//        정적 멤버는 해당 클래스를 객체화하여 사용 시 객체화 된 모든 객체들과 메모리 공간을 공유함
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10, 8));
        System.out.println(Calc.min(-3, -8));

//        정적멤버도 객체생성 후 사용이 가능
        Calc c = new Calc();
        System.out.println(c.abs(-5));
        System.out.println(c.max(10, 8));
        System.out.println(c.min(10, 8));







//        일반 멤버를 사용한 연산
        Calc c1 = new Calc();
        Calc c2 = new Calc();

        c1.iNum1 = 10;
        c1.iNum2 = 20;
        c1.iResult = c1.iNum1 + c1.iNum2;
        System.out.println("객체 c1의 iResult : " + c1.iResult);

        c2.iNum1 = 100;
        c2.iNum2 = 200;
        c2.iResult = c2.iNum1 + c2.iNum2;
//        일반멤버의 경우 개별 객체에 저장되기 때문에 서로 메모리 공간을 가짐
        System.out.println("객체 c2의 iResult : " + c2.iResult);
        System.out.println("객체 c1의 iResult : " + c1.iResult);


        System.out.println();
//        정적 멤버를 사용한 연산
        c1.sNum1 = 10;
        c1.sNum2 = 20;
        c1.sResult = c1.sNum1 + c1.sNum2;
        System.out.println("객체 c1의 sResult : " + c1.sResult);

        c2.sNum1 = 100;
        c2.sNum2 = 200;
        c2.sResult = c2.sNum1 + c2.sNum2;
//        정적멤버의 경우 클래스에 저장되어 객체에 공유해주는 형식이기때문에 공통된 메모리를 가짐
        System.out.println("객체 c2의 sResult : " + c2.sResult);
        System.out.println("객체 c1의 sResult : " + c1.sResult);
        System.out.println("클래스의 sResult : " +Calc.sResult);








        System.out.println();

//        정적 초기화 블록 : 객체가 없어도 실행가능.
//        블록 내부에 인스턴스 필드나 메소드 사용 불가.
//        this 사용 불가. this 자체가 객체 자신을 나타내기 때문
        System.out.println(Tv.info);



    }
}
