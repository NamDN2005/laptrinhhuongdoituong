public class b1{
    public static void main(String[] args) {
        // Kiểm tra số lượng tham số
        if (args.length != 2) {
            System.out.println("Vui lòng nhập đúng 2 tham số: width và height.");
            return;
        }

        try {
            // Chuyển tham số dòng lệnh thành các số nguyên
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);

            // Kiểm tra width và height là số nguyên dương
            if (width <= 0 || height <= 0) {
                System.out.println("Vui lòng nhập các giá trị width và height là các số nguyên dương.");
            } else {
                // Tính chu vi và diện tích
                int perimeter = 2 * (width + height);
                int area = width * height;

                // In kết quả
                System.out.println("Chu vi hình chữ nhật: " + perimeter);
                System.out.println("Diện tích hình chữ nhật: " + area);
            }
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập các giá trị width và height hợp lệ.");
        }
    }
}
