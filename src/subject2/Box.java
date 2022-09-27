package subject2;

public class Box {
    private int width, height;              // 박스의 너비와 높이
    private char fillChar;                  // 박스 그리는데 사용하는 문자
    public Box() {                          // 매개변수 없는 생성자 10 x 1
        width = 10;
        height = 1;
    }

    public Box(int width, int height) {     // 너비와 높이 매개변수를 가지는 생성자
        this.width = width;
        this.height = height;
    }

    public void draw() {                    // 박스 그리는 메소드
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(fillChar);
            }
            System.out.println();
        }
    }

    public void fill(char c) {              // 박스 그릴 때 사용할 문자 설정
        this.fillChar = c;
    }
}
