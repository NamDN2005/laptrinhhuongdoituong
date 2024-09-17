public class b2 {
    // Thuộc tính
    private int width;
    private int height;

    // Constructor (Phương thức khởi tạo)
    public b2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Phương thức tính chu vi
    public int getPerimeter() {
        return 2 * (width + height);
    }

    // Phương thức tính diện tích
    public int getArea() {
        return width * height;
    }

    // Phương thức hiển thị thông tin
    public void display() {
        System.out.println("Chiều rộng: " + width);
        System.out.println("Chiều cao: " + height);
        System.out.println("Chu vi hình chữ nhật: " + getPerimeter());
        System.out.println("Diện tích hình chữ nhật: " + getArea());
    }

    // Hàm main để chạy chương trình
    public static void main(String[] args) {
        // Khởi tạo đối tượng Rectangle với chiều rộng và chiều cao
        b2 b2 = new b2(3, 4);

        // Hiển thị thông tin của hình chữ nhật
        b2.display();
    }
}
