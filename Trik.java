import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l=1, c=0, r=0, temp, x;
		String swap;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Value : ");
		swap = scan.next();
		for( x=0;x<swap.length();x++ ){

			if(swap.charAt(x) == 'A' || swap.charAt(x) == 'a'){
				temp=l;
				l=c;
				c=temp;
				}else if(swap.charAt(x) == 'B' || swap.charAt(x) == 'b'){
					temp=c;
					c=r;
					r=temp;
				}else{
					temp=l;
					l=r;
					r=temp;
				}
		}
			if(l == 1) System.out.println("Coin is in Left glass");
				else if(c == 1) System.out.println("Coin is in Center glass");
				else System.out.println("Coin is in Right glass");
	}

}
