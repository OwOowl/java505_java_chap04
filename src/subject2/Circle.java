package subject2;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

class CircleManager {
    static void copy(Circle src, Circle dest) {     // src를 dest에 복사
        dest.setRadius(src.getRadius());            // src의 반지름을 dest에 복사
    }
    static boolean equals(Circle a, Circle b) {     // a, b의 반지름이 같으면 true, 다르면 false
        if(a.getRadius() == b.getRadius()) {
            return true;
        }
        else {
            return false;
        }
    }
}
