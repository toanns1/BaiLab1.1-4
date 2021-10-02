import java.util.Scanner;
public class Lab4Bai4 {

	public static void main(String[] args) {
		double a,b,c,CBH;
		@SuppressWarnings( "resource" )
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a: ");
		a=scanner.nextDouble();
		System.out.println("Nhập b: ");
		b=scanner.nextDouble();
		System.out.println("Nhập c: ");
		c=scanner.nextDouble();
		CBH=Math.sqrt((Math.pow(b,2)-4*a*c));
		System.out.printf("Căn bậc hai của delta = " + CBH);
	}

}
