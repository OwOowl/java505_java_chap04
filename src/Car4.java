public class Car4 {
    public String name;
    public String type;


    //    생성자
//      1. 생성자는 new 키워드가 호출하여 사용하는 일종의 메서드
//      2. 생성자의 이름은 클래스의 이름과 동일해야 함
//      3. 생성자는 반환타입이 없음
//      4. 생성자는 실행되면서 클래스의 멤버 변수를 초기화하는데  사용함
//      5. 생성자끼리는 서로 호출하는 것이 가능
//      6. 클래스의 멤버 메서드가 생성자를 호출 할 수 있음
//      7. 기본 생성자 : 매개변수가 없는 형태의 생성자
//      8. 모든 클래스는 1개 이상의 생성자를 가지고있음 (생성자를 생략 할 경우 컴파일러가 기본 생성자를 생성함)
//      9. 클래스에 사용자가 생성자를 하나라도 선언 시 기본생성자는 자동 생성되지 않음

//    생성자 오버로딩 : 동일한 이름의 생성자를 여러개 선언하는 것,
//                   매개변수의 타입, 개수, 순서가 다를 경우 생성 가능
    public Car4(String carName, String carType) {
        name = carName;
        type = carType;
    }

    public Car4(String carName) {
        name = carName;
    }

    public Car4() {
    }


    public void run() {
        System.out.println(name + "가 달립니다.");
    }


    public void stop() {
        System.out.println(name + "가 멈춥니다.");
    }


    public void info() {
        System.out.println("차 이름은 " + name + "이고, 차종은 " + type + "입니다.");
    }
}
