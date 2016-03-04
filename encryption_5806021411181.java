import java.util.Scanner;

public class encryption_5806021411181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a,b;
		char c;
		int i=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Text : ");
		a = scan.nextLine();
		b = a.toUpperCase();
		
		for(i=b.length()-1; i>=0; i--){
			c = b.charAt(i);
			if(c == 'R'){
				c = 'E';
			}else if(c == 'W'){
				c = 'R';
			}else if(c == 'E'){
				c = 'W';
			}
			
			System.out.println(c);
		}
		
	}

}
