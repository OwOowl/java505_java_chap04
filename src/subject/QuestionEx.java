package subject;


import java.util.Random;
import java.util.Scanner;

public class QuestionEx {
    private static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);

//        문제 1)
        System.out.print("알파벳 하나를 입력하세요 : ");
        String str = scan.next();
//        charAt() : string 타입의 데이터 중 지정한 index의 문자를 char 타입으로 변환
//        charAt(0) : 입력된 string 타입의 데이터 중 첫 번째 글자만 출력
        char c = str.charAt(0);

//        cahr 타입의 데이터 a는 아스키코드 문자로는 'a' 정수로는 97로 표현
        for (char a = 'a'; a <= c; a++) {
            for (char b = a; b <= c; b++) {
                System.out.print(b);
            }
            System.out.println();
        }


//        문제 2)
        int quiz2Arr[] = new int[10];
        for (int i = 0; i < quiz2Arr.length; i++) {
            System.out.println("정수 10개를 입력해주세요. (현재" + (i + 1) + "번 입력)");
            quiz2Arr[i] = scan.nextInt();
            if (quiz2Arr[i] % 3 == 0) {
                System.out.print(quiz2Arr[i] + " ");
            }
        }


//        문제 3)
//          1. eng배열을 전체 검색하여 사용자가 입력한 단어가 있는지 확인
//          2. 없으면 해당 index번호 확인하고 검색 중지
//          3. kor 배열의 index 번호에 있는 단어 출력
//          4. 입력된 단어가 exit 이면 프로그램 종료

        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};

        System.out.println("단어를 입력해주세요.");

//        while문의 무한반복문
        while (true) {
            String quiz3Str = scan.next();

            if (quiz3Str.equals("exit")) {
                System.out.println("종료합니다....");
                break;
            }

            int index = -1;
            for (int i = 0; i < eng.length; i++) {
                if (quiz3Str.equals(eng[i])) {
                    index = i;
                    break;
                }

                if (index > -1) {
                    System.out.println(kor[index]);
                } else {
                    System.out.println("그런 영어단어가 없습니다");
                }
            }
        }


//        for문의 무한반복문
//        for (;;) {
//
//        }
//


//        문제 4)
//          1. 0~99 컴퓨터가 랜덤 숫자 선택, 사용자가 키보드로 입력
//          2. 사용자 입력을 통해 얻은 데이터가 높은지 낮은지 판단(if~else문), 반복 실행
//          3. 정답을 맞춘 후 다시 게임을 할 것인지 확인

        Random r = new Random();    // 랜덤값 생성 클래스
        int card;   // 컴퓨터가 랜덤으로 생성한 데이터가 저장 될 변수
        int low;    // 카드에 적힌 수의 범위설정 변수
        int high;


//        게임 시작
        while (true) {
            int i = 1;  // 입력 횟수
            low = 0;
            high = 99;
            card = r.nextInt(100);
            System.out.println("UP&DOWN 게임입니다. 숨겨진 수를 맞추어 보세요.");

//            사용자 입력을 무한반복
            while (true) {
                System.out.println(low + " ~ " + high);
                System.out.print(i + ">>");

                int count = scan.nextInt();

                if (count > high || count < low) {
                    System.out.println("범위를 벗어났습니다.");
                } else {
                    if (count == card) {
                        System.out.println("정답입니다.");
                        break;
                    }
                    else if (count > card) {
                        System.out.println("더 낮게");
                        high = count;
                    }
                    else {
                        System.out.println("더 높게");
                        low = count;
                    }
                }
                i++;
            }

//            정답 후 다시시작할지 확인
            System.out.print("다시 시작하시겠습니다? (y/n) >>");
            if (scan.next().equals("n")) {
                break;
            }


        }





//        문제 5)
        int intArray[][];
        intArray = new int[3][4];
//        입력부분

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
//                Math.random() : 랜덤 숫자를 방생시키기 위한 수학 클래스 함수(0.0~0.1까지의 숫자 출력)
//                (int)를 사용하여 강제 형변환을 통해 소수점 삭제
                intArray[i][j] = (int)(Math.random() * 10);
            }
        }

        for (int i = 0; i <intArray.length ; i++) {
            for (int j = 0; j <intArray[i].length ; j++) {
                System.out.print(intArray[i][j] + "\t");
            }
            System.out.println();
        }

        int i = 0;
        int sum = 0;
        while (i < 3) {
            for (int j = 0; j < intArray[i].length; j++) {
                sum =sum + intArray[i][j];
            }
            i++;
        }

//          방법 2)
//        while (i < 3) {
//            int j = 0;
//            while (j < intArray.length) {
//                sum += intArray[i][j];
//                j++;
//            }
//            i++;
//        }


        System.out.println("합은 " + sum);

    }
}
