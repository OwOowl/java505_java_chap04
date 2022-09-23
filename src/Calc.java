public class Calc {
//    정적멤버
    public static int sNum1;
    public static int sNum2;
    public static int sResult;

//    일반멤버
    public int iNum1;
    public int iNum2;
    public int iResult;


//    정적 멤버는 일반멤버에 접근 불가능
    public static int sSum() {
        sResult = sNum1 + sNum2;
//        정적 멤버는 일반멤버에 접근 불가능. 오류발생
//        정적 멤버가 동작하는 순간에 일반 멤버가 메모리에 등록되어 있는지 알 수 없기 때문에 사용 할 수 없음
//        sResult = iNum1 + iNum2;
        return sResult;
    }


//    일반 멤버는 정적멤버에 접근 가능
    public int iSum() {
        iResult = iNum1 + iNum2;
//        일반 멤버는 객체 생성 후 사용하는 것이기 때문에 언제든지 정적 멤버에 접근이 가능함
//        iResult = sNum1 + sNum2;
        return iResult;
    }



    public static int abs(int a){
        if (a > 0) {
            return a;
        }
        else {
            return -a;
        }
    }


    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static int min(int a, int b) {
        if (a > b) {
            return b;
        }
        else {
            return a;
        }
    }



}
