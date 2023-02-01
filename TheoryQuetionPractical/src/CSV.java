
import java.util.Scanner;

public class CSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A1");
		int A1=sc.nextInt();
		System.out.println("Enter A2");
		int A2=sc.nextInt();
		System.out.println("Enter A3");
		int A3=sc.nextInt();
		System.out.println("Enter B1");
		int B1=sc.nextInt();
		System.out.println("Enter B2");
		int B2=sc.nextInt();
		System.out.println("Enter B3");
		int B3=sc.nextInt();
		
		int C1=5+A1;
		int C2=A2+B1;
		int C3=C2+B3;
		
		System.out.print(A1+" "+A2+" "+A3);
		System.out.print(B1+" "+B2+" "+B3);
		System.out.print(C1+" "+C2+" "+C3);
	}

}
