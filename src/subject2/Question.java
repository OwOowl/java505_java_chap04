package subject2;

import java.util.Scanner;

public class Question {

    public static void main(String[] args) {

//        문제 1)
        Song mySong = new Song("Nessun Dorma");
        Song yourSong = new Song("공주는 잠 못 이루고");

        System.out.println("내 노래는 " + mySong.getTitle());
        System.out.println("네 노래는 " + yourSong.getTitle());



//        문제 2)
        Scanner scan = new Scanner(System.in);
        Phone phone1;
        Phone phone2;


        System.out.println("이름과 전화번호입력 >>");
        phone1 = new Phone(scan.next(), scan.next());
        System.out.println("이름과 전화번호입력 >>");
        phone2 = new Phone(scan.next(), scan.next());

        System.out.println(phone1.getName() + "의 번호 " + phone1.getTel());
        System.out.println(phone2.getName() + "의 번호 " + phone2.getTel());



//        문제 3)
//          1. Rect 클래스 배열 생성
//          2. 반복문으로 4번 데이터 입력받기
//          3. 너비의 전체 합 출력
        Rect rectArray[]  = new Rect[4];

        for (int i = 0; i < rectArray.length; i++ ) {
            System.out.print((i + 1) + "너비와 높이 >>");
            rectArray[i] = new Rect(scan.nextInt(), scan.nextInt());
//              방법 2)
//            int width = scan.nextInt();
//            int height = scan.nextInt();
//            rectArray[i] = new Rect{width,height}
        }
        System.out.println("저장하였습니다...");
        int total = 0;
        for (int i = 0; i < rectArray.length; i++) {
            total += rectArray[i].getArea();
        }
        System.out.println("사각형 전체의 합은 " + total);





//        문제 4)
//          1. 사용자 입력을 통해서 전화번호를 저장할 배열크기 입력받음
//          2. 지정한 크기 만큼의 사용자 정보 입력받음
//          3. 사용자가 입력한 사용자 이름이 있는지 반복문을 통해 배열안의 내용과 비교
//          4. 있으면 정보 출력, 없으면 없습니다 출력
//          5. exit입력 시 프로그램 종료

        System.out.print("인원수>>");
        int size = scan.nextInt();

//        phone2 클래스 타입의 배열 생성, 사용자가 입력한 크기만큼
        Phone2 phoneBook[] = new Phone2[size];

        for(int i = 0; i < phoneBook.length; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력) >>");

//            지정한 위치에 phone2 클래스 타입의 객체 생성하여 저장
            phoneBook[i] = new Phone2(scan.next(), scan.next());
//            방법 2)
//            phoneBook[i].setName(scan.next());
//            phoneBook[i].setTel(scan.next());
        }
        System.out.println("저장되었습니다...");


//        이름검색 무한반복
        while (true) {
            System.out.print("검색할 이름 >>");
            String searchName = scan.next();
            int index = -1;     // 배열의 index 번호를 저장할 변수, -1이면 검색불가, 검색완료 : 검색된 index 번호

            if (searchName.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            for (int i = 0; i < phoneBook.length; i++) {
//                입력한 이름과 저장된 이름이 같은지 확인
                if (searchName.equals(phoneBook[i].getName())) {
                    index = i;  // 입력한 이름이 검색이 되면 index에 배열 값 저장
                    break;
                }
            }

//            검색한 결과 확인
            if (index > -1) {   // 이름이 검색 되었을 경우 저장된 이름과 번호 출력
                System.out.println(phoneBook[index].getName() + "의 번호는 " + phoneBook[index].getTel() + "입니다.");
            }
            else {      // 이름이 검색되지 않았을 경우
                System.out.println(searchName + "이 없습니다.");
            }

        }



//        문제 1) 사칙연산을 할 수 있는 클래스 calculator를 생성하고 정수를 두개 입력 받아 계산하는 프로그램 작성
//          1. 멤버 변수 : int num1, num2 result
//          2. 멤버 메서드 : sum, sub, multi, div
//          3. 모든 결과는 int 데이터 타입으로 사용, 메서드의 4가지 형태 중 아무거나 사용

        Calculator cal = new Calculator(20, 10);
        cal.sum();
        cal.sub();
        cal.multi();
        cal.div();






//        문제 2) 1~45 까지의 임의의 숫자 6개를 생성하여 그 결과를 출력하는 프로그램
//          1. 배열을 사용하여 랜덤으로 생성된 데이터를 저장

        Lotto num[] = new Lotto[6];

        for (int i = 0; i < num.length; i++) {
            num[i] = new Lotto((int)(Math.random() * 44)+ 1);
        }

        System.out.print("로또 당첨 번호는: ");
        for ( int i = 0; i < num.length; i++) {
            System.out.print(num[i].number() +"\t");
        }

        System.out.println();








//        문제 3) 문제2를 여러번 실행 시 배열에 저장되는 숫자가 중복되는 상황 제외하고 6개의 숫자를 저장하고 출력하는 프로그램
        int lotto2[] = new int[6];


        for (int i = 0; i < lotto2.length; i++) {
            int rnd = (int)((Math.random() * 44)+ 1);

//            i == 0일때 반복문 수행하지 않고 넘어감
//            중복 검사
            for (int j = 0; j < i; j++) {
//                동일한 값 있는지 확인
                if (rnd == lotto2[j]) {
//                    동일한 값 있을 경우 현재루프를 다시 한번 더 실행
                    i--;    // 나중에 자동으로 1 증가할 변수를 먼저 1 감소시켜 동일한 값이 나올 수 있도록 변경
                            // 동일한 번호의 루프를 돌 수 있게 함
                    break;
                }

                lotto2[i] = rnd;
            }

//            i == 0 일때 rnd값 lotto[i]에 저장
//            첫 번째 루프의 경우 중복 제거 루틴으로 빠지지 않기 때문에 데이터가 저장되는 부분 별도로 실행
            if (i == 0) {
                lotto2[i] = rnd;
            }
        }







    }
}
