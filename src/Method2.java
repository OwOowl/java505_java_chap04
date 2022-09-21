import java.util.Scanner;

public class Method2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

//        문제 1) 사칙연산을 하기 위한 메서드를 메서드 4가지 형태로 각각 생성하여 실행하는 프로그램 작성
//          1. 더하기, 빼기, 곱하기, 나누기 를 각각 4가지 형태로 생성
//          2. 함수이름 예시 : sum1, sub1, multi1, div1
//          3. 각각의 함수 모두를 실행하여 결과를 확인

        System.out.println("\n----- 1번 형태 -----");

        sum1();
        sub1();
        multi1();
        div1();

        System.out.println("\n----- 2번 형태 -----");

        sum2(2, 5);
        sub2(10, 2);
        multi2(10, 20);
        div2(10, 2);

        System.out.println("\n----- 3번 형태 -----");

        int result = 0;
        result = sum3();
        System.out.println("두 수의 합 : " + result);
        result = sub3();
        System.out.println("두 수의 차 : " + result);
        result = multi3();
        System.out.println("두 수의 곱 : " + result);
        double dResult = div3();
        System.out.println("두 수의 나누기 : " + dResult);

        System.out.println("\n------ 4번 형태 -----");

        result = sum4(5, 6);
        System.out.println("두 수의 합 : " + result);
        result = sub4(20, 10);
        System.out.println("두 수의 차 : " + result);
        result = multi4(20, 6);
        System.out.println("두 수의 곱 : " + result);
        dResult = div4(25, 3);
        System.out.println("두 수의 나누기 : " + dResult);


        System.out.println();


//        문제 2) 사용자입력을 통해 2~9의 숫자를 입력받아 해당하는 단수의 구구단을 출력하는 프로그램 작성
//          1. 구구단을 출력하는 부분을 함수로 구현 (함수명 : gugudan)
//          2. (선택) 사용자 입력부분 함수구현

        System.out.println("2~9 사이의 숫자 하나를 입력하시오.");
        gugudan();

//        2. (선택) 해설
//        int dansu = scan.printInt();
//        함수 :
//        public static void gugudan(int dan) {
//          for (int i = 1; i < 10; i++)  {
//            System.out.println(num + " * " + i + " = " + (num * i));
//          }
//        }

        System.out.println();

//        문제 3) 사용자 입력을 통해 국어, 영어, 수학의 점수 3개를 입력받고, 총점과 평균, 등급을 출력하는 프로그램 작성
//          1. 등급 계산 부분 함수로 구현 (함수명 : scores)
//          2. 총점과 평균 계산 부분을 함수로 구현 (함수명 : average)

        System.out.println("국어, 영어, 수학의 점수를 입력하시오.");
        scores();


        /* int kor = 0;
        int eng = 0;
        int math = 0;
        int total= 0;
        double avg= 0.0;
        String level = "F";

        System.out.println("국어 점수를 입력해 주세요.");
        kor = scan.nextInt();
        System.out.println("영어 점수를 입력해 주세요.");
        eng = scan.nextInt();
        System.out.println("수어 점수를 입력해 주세요.");
        math = scan.nextInt();

        total = kor + eng + math;
        avg = average(total);
        level = scores((int)avg);

        System.out.println();
*/


    }

    //    덧셈 함수
    public static void sum1() {
        int a = 1;
        int b = 2;
        int result = a + b;
        System.out.println(" 두 수의 합 : " + result);
    }

    public static void sum2(int a, int b) {
        int result = a + b;
        System.out.println(" 두 수의 합 : " + result);
    }

    public static int sum3() {
        int a = 1;
        int b = 2;
        int result = a + b;
        return result;
    }

    public static int sum4(int a, int b) {
        int result = a + b;
        return result;
    }

    //    뺄셈 함수
    public static void sub1() {
        int a = 4;
        int b = 1;
        int result = a - b;
        System.out.println("두 수의 차 : " + result);
    }

    public static void sub2(int a, int b) {
        int result = a - b;
        System.out.println("두 수의 차 : " + result);
    }

    public static int sub3() {
        int a = 4;
        int b = 1;
        int result = a - b;
        return result;
    }

    public static int sub4(int a, int b) {
        int result = a - b;
        return result;
    }

    //    곱셈 함수
    public static void multi1() {
        int a = 2;
        int b = 3;
        int result = a * b;
        System.out.println("두 수의 곱 : " + result);
    }

    public static void multi2(int a, int b) {
        int result = a * b;
        System.out.println("두 수의 곱 : " + result);
    }

    public static int multi3() {
        int a = 2;
        int b = 3;
        int result = a * b;
        return result;
    }

    public static int multi4(int a, int b) {
        int result = a * b;
        return result;
    }

    //    나눗셈 함수
    public static void div1() {
        int a = 10;
        int b = 3;
        double dResult = a / b;
        System.out.println("두 수의 나누기 : " + dResult);
    }

    public static void div2(int a, int b) {
        double dResult = a / b;
        System.out.println("두 수의 나누기 : " + dResult);
    }

    public static double div3() {
        int a = 10;
        int b = 3;
        double dResult = a / b;
        return dResult;
    }

    public static double div4(int a, int b) {
        double dResult = a / b;
        return dResult;
    }


    //    문제 2) 구구단 함수
    public static void gugudan() {
        int num = scan.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }


    //    문제 3) 등급 함수
    public static void scores() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int score = scan.nextInt();
            if (i == 0) {
                if (score >= 90) {
                    System.out.println("국어의 등급은 A등급 입니다.");
                } else if (score >= 80) {
                    System.out.println("국어의 등급은 B등급 입니다.");
                } else if (score >= 70) {
                    System.out.println("국어의 등급은 C등급 입니다.");
                } else if (score >= 60) {
                    System.out.println("국어의 등급은 D등급 입니다.");
                } else {
                    System.out.println("국어의 등급은 F등급 입니다.");
                }

            } else if (i == 1) {
                if (score >= 90) {
                    System.out.println("영어의 등급은 A등급 입니다.");
                } else if (score >= 80) {
                    System.out.println("영어의 등급은 B등급 입니다.");
                } else if (score >= 70) {
                    System.out.println("영어의 등급은 C등급 입니다.");
                } else if (score >= 60) {
                    System.out.println("영어의 등급은 D등급 입니다.");
                } else {
                    System.out.println("영어의 등급은 F등급 입니다.");
                }
            } else {
                if (score >= 90) {
                    System.out.println("수학의 등급은 A등급 입니다.");
                } else if (score >= 80) {
                    System.out.println("수학의 등급은 B등급 입니다.");
                } else if (score >= 70) {
                    System.out.println("수학의 등급은 C등급 입니다.");
                } else if (score >= 60) {
                    System.out.println("수학의 등급은 D등급 입니다.");
                } else {
                    System.out.println("수학의 등급은 F등급 입니다.");
                }
            }
            sum = sum + score;
        }
        int avg = sum / 3;
        System.out.println("당신의 총점은 " + sum + "점 입니다.");
        System.out.println("당신의 평균은 " + avg + "점 입니다.");
    }
}



//    총합과 평균 함수

/*      평균 함수
    public static double average(int total) {
        return total /  3;
    }
*/




  /*  public static void average() {
        int sum = 0;
        int i = 0;
        while(i < 3) {
            int score = scan.nextInt();
            sum = sum + score;
            i++;
        }
        int avg = sum / 3;
        System.out.println("당신의 총점은 " + sum + "점 입니다.");
        System.out.println("당신의 평균은 " + avg + "점 입니다.");
    }
}*/
