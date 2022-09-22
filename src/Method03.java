import java.util.Scanner;

public class Method03 {
    static Scanner scan = new Scanner(System.in);


//    //        문제 2)

    public static int input() {        // 메서드 선언부
        System.out.println("2~9 사이의 숫자 하나를 입력하시오.");    //메서드 실행부
        int dansu = scan.nextInt();
        return dansu;   // 단수값 리턴
    }

    public static void output(int dansu) {          // ()내부에 값 입력하여 해당 단수 출력
        for (int i = 1; i < 10; i++) {
            System.out.println(dansu + " * " + i + " = " + (dansu * i));
        }
    }






//              문제 3)

    public static int inputScore() {
        System.out.println(" 점수를 입력해 주세요.");
        int score = scan.nextInt();
        return score;
    }

    public static String callevel(int score) {
        String level = "F";
        if (score >= 90) {
            level = "A";
        } else if (score >= 80) {
            level = "B";
        } else if (score >= 70) {
            level = "C";
        } else if (score >= 60) {
            level = "D";
        }

        return level;
    }

    public static void printResult(int score, String level) {
        System.out.println("당신의 점수는 " + score + "점 이고, 등급은 " + level + "입니다.");
    }






    public static int scoreInput(String course) {
        System.out.println(course + "점수를 입력해 주세요.");
        int score = scan.nextInt();

        return score;
    }

    public static int totalCal(int kor, int eng, int math) {
        return kor + eng + math;
    }

    public static double avgCal(int total) {
        return (double)total / 3;        // (double) : 강제 형변환
    }

    public static String levelCal(double avg) {
        String level = "F";
        if (avg >= 90) {
            level = "A";
        } else if (avg >= 80) {
            level = "B";
        } else if (avg >= 70) {
            level = "C";
        } else if (avg >= 60) {
            level = "D";
        }

        return level;
    }

    public static void printResult(int total, double avg, String level) {
        System.out.println("당신의 총점은 " + total + "점 이고, 평균 점수는 " + avg + "점이며 등급은 " + level + "입니다.");
    }

    public static void main(String[] args) {

//          함수만들 때 우선 기능이 동작하도록 코드를 짜고 코드를 부분으로 나눠서 함수를 만들면 편함


//        문제 2) 사용자입력을 통해 2~9의 숫자를 입력받아 해당하는 단수의 구구단을 출력하는 프로그램 작성

        int dansu = input();    // 단수값 저장
        System.out.println(dansu);
        output(dansu);  // 단수값 출력






//        문제 3) 사용자 입력을 통해 국어, 영어, 수학의 점수 3개를 입력받고, 총점과 평균, 등급을 출력하는 프로그램 작성

        int kor = 0;
        int eng = 0;
        int math = 0;
        int total= 0;
        double avg= 0.0;
        String level = "F";


        kor = scoreInput("국어");
        eng = scoreInput("영어");
        math = scoreInput("수학");

        total = totalCal(kor, eng, math);
        avg = avgCal(total);

        level = levelCal(avg);
        System.out.println(level);

        printResult(total, avg, level);


//        System.out.println("국어 점수를 입력해 주세요.");
//        kor = scan.nextInt();
//        System.out.println("영어 점수를 입력해 주세요.");
//        eng = scan.nextInt();
//        System.out.println("수학 점수를 입력해 주세요.");
//        math = scan.nextInt();
//
//        total = kor + eng + math;
//        avg = (double)total / 3;    // (double) : 강제 형변환
//
//        if (avg >= 90) {
//            level = "A";
//        } else if (avg >= 80) {
//            level = "B";
//        } else if (avg >= 70) {
//            level = "C";
//        } else if (avg >= 60) {
//            level = "D";
//        }
//
//        System.out.println("당신의 총점은 " + total + "점 이고, 평균 점수는 " + avg + "점이며 등급은 " + level + "입니다.");







//        int score = inputScore();
//        String level = callevel(score);
//        printResult(score, level);
//
//
//
//        System.out.println(" 점수를 입력해 주세요.");
//        int score = scan.nextInt();
//        String level = "F";
//        if (score >= 90) {
//            level = "A";
//        } else if (score >= 80) {
//            level = "B";
//        } else if (score >= 70) {
//            level = "C";
//        } else if (score >= 60) {
//            level = "D";
//        }
//        System.out.println("당신의 점수는 " + score + "점 이고, 등급은 " + level + "입니다.");
//



    }

}
