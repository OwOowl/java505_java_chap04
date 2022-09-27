package subject2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Circle pizza = new Circle(5);
        Circle waffle = new Circle(1);

        boolean res = new CircleManager().equals(pizza, waffle);
        if (res == true) {
            System.out.println("pizza와 waffle 크기가 같음");
        }
        else {
            System.out.println("pizza와 waffle 크기가 다름");
        }

        CircleManager.copy(pizza, waffle);
        res = CircleManager.equals(pizza, waffle);
        if (res == true) {
            System.out.println("pizza와 waffle 크기가 같음");
        }
        else {
            System.out.println("pizza와 waffle 크기가 다름");
        }



        System.out.println();
//        문제 2)
        Box a = new Box();
        Box b = new Box(20, 3);
        a.fill('*');
        b.fill('%');
        a.draw();
        b.draw();



        System.out.println();




//        문제 3)
        Scanner scanner = new Scanner(System.in);
        Player [] p = new Player[2];

        for (int i = 0; i < p.length; i++) {
            System.out.print("선수 이름 입력 >> ");
            p[i] = new Player(scanner.next());
        }

        int n = 0;
        while (true) {
            System.out.print(p[n].getName() + "<Enter 외 아무키나 치세요");
            scanner.next();
            int [] val = new int [3];
            for (int i = 0; i < val.length; i++) {
                val[i] = (int)(Math.random() * 3);
                System.out.print(val[i] + "\t");
            }

            System.out.println();


            n++;
            n = n % 2;
        }

    }
}
