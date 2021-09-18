import java.util.Scanner;
public class Lab3Bai3 {

	public static void main(String[] args) {
		double V,canh;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập cạnh klp: ");
		canh=scanner.nextDouble();
		V=Math.pow(canh,3);
		System.out.println("Thể tích kcn = " + V);
	}

}
