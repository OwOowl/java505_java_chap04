public class Singleton {

//    싱글톤
//    private (접근제한자) : private로 지정된 멤버는 해당 클래스 내에서만 사용 가능
    private static Singleton singleton = new Singleton();


//    생성자의 접근제한자에 private를 사용하면 객체 생성 시 new 키워드를 사용할 수 없음
//    메모리에 등록이 안됨. 객체 생성 불가
    private Singleton() {}
    
    public static Singleton getInstance() {
        return singleton;
    }
}
