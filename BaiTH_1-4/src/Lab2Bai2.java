import java.util.Scanner;

public class Lab2Bai2 {
	public static void main(String args[]) {
		double a,b,P,S,CNN;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài: ");
		a = scanner.nextDouble();
		System.out.println("Nhập chiều rộng: ");
		b = scanner.nextDouble();
		P=(a+b)*2;
		S=a*b;
		CNN=Math.min(a, b);
		System.out.printf("Chu vi hcn = " + P);
		System.out.printf("\nDiện tích hcn = " + S);
		System.out.printf("\nCạnh nhỏ nhất = " + CNN);
	}

}
