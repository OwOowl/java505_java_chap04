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
    }
}
