import java.util.Scanner;

public class Lab1Bai1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Họ và tên: ");
		String hoTen = scanner.nextLine();
		System.out.println("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		System.out.printf("%s %f điểm",hoTen,diemTB);
	}
}
