// Lớp Rectangle
class Rectangle {
    private int width;
    private int height;

    // Constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Tính chu vi
    public int getPerimeter() {
        return 2 * (width + height);
    }

    // Tính diện tích
    public int getArea() {
        return width * height;
    }

    // Hiển thị thông tin
    public void display() {
        System.out.println("Hình chữ nhật:");
        System.out.println("Chiều rộng: " + width);
        System.out.println("Chiều cao: " + height);
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println("Diện tích: " + getArea());
    }
}

// Lớp Circle
class Circle {
    private int radius;

    // Constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Hiển thị thông tin
    public void display() {
        System.out.println("Hình tròn:");
        System.out.println("Bán kính: " + radius);
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println("Diện tích: " + getArea());
    }
}

// Lớp chính để chạy chương trình
public class b3 {
    public static void main(String[] args) {
        // Tạo đối tượng hình chữ nhật
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.display();

        // Tạo đối tượng hình tròn
        Circle circle = new Circle(7);
        circle.display();
    }
}
