import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v1, v2, v3, v4, temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Value 1 : ");
		v1=scan.nextInt();
		System.out.print("Enter Value 2 : ");
		v2=scan.nextInt();
		System.out.print("Enter Value 3 : ");
		v3=scan.nextInt();
		System.out.print("Enter Value 4 : ");
		v4=scan.nextInt();
		
		if( v1>v2 ){ temp=v1; v1=v2; v2=temp; }
		if( v1>v3 ){ temp=v1; v1=v3; v3=temp; }
		if( v1>v4 ){ temp=v1; v1=v4; v4=temp; }
		if( v2>v3 ){ temp=v2; v2=v3; v3=temp; }
		if( v2>v4 ){ temp=v2; v2=v4; v4=temp; }
		if( v3>v4 ){ temp=v3; v3=v4; v4=temp; }
		System.out.print("\nRectangle Area = : "+""+v3+""+" * "+v1+" = "+v3*v1);
	}

}
