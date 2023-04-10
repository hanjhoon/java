package circle;

public class Circle {
    private Double radius; // 기본 값이 1.0
    private String color = "red"; // 기본 값이 "red"

    // new Circle();
    // 여기서는 radius 기본값을 설정해야 합니다.
    public Circle() {
        // 생성자 중에 double 타입의 매개변수를 하나 받는 생성자를 찾아서 호출합니다
        // 그 때 radius에 1.0 값을 전달합니다.
        this(1.0);
    }

    // new Circle(radius 값);
    // 야기서는 radius 기본값을 설정할 필요가 없다
    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    /**
     * 작성자 : 한종훈
     * 작성일자 : 2023.4.5
     * @return 원의 너비를 구하여 double 타입으로 반환
     */
    public double getArea() {
        return Math.PI*radius*radius;
    }

    /**
     * 작성자 : 한종훈
     * 작성일자 : 2023.4.5
     * @return 원의 둘레를 구하여 double 타입으로 반환
     */
    public double getCircumference(){
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "], Circle[color=" + color +"]";
    }

    public Circle (double r, String c) {
        this.radius = r;
        this.color = c;
    }
    public String getColor() {
        return color;
    }

    public Circle(Double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = (double) radius;
    }
    public void setColor() {
        this.color = "red";
    }

    public void setColor(String color) {
        this.color = color;
    }
}
