public class Main3 {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(5, 3);
        Shape shape2 = new Circle(2);

        System.out.println("Chu vi hình chữ nhật: " + shape1.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: " + shape1.getArea());

        System.out.println("Chu vi hình tròn: " + shape2.getPerimeter());
        System.out.println("Diện tích hình tròn: " + shape2.getArea());
    }
}
