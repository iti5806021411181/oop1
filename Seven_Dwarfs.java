import java.util.Scanner;
public class Seven_Dwarfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Dwarfs1, Dwarfs2, Dwarfs3, Dwarfs4, Dwarfs5, Dwarfs6, Dwarfs7, Dwarfs8, Dwarfs9, result;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Dwarfs 1 : ");
		Dwarfs1 = scan.nextInt();
		System.out.print("Enter Dwarfs 2 : ");
		Dwarfs2 = scan.nextInt();
		System.out.print("Enter Dwarfs 3 : ");
		Dwarfs3 = scan.nextInt();
		System.out.print("Enter Dwarfs 4 : ");
		Dwarfs4 = scan.nextInt();
		System.out.print("Enter Dwarfs 5 : ");
		Dwarfs5 = scan.nextInt();
		System.out.print("Enter Dwarfs 6 : ");
		Dwarfs6 = scan.nextInt();
		System.out.print("Enter Dwarfs 7 : ");
		Dwarfs7 = scan.nextInt();
		System.out.print("Enter Dwarfs 8 : ");
		Dwarfs8 = scan.nextInt();
		System.out.print("Enter Dwarfs 9 : ");
		Dwarfs9 = scan.nextInt();
		result = Dwarfs1 + Dwarfs2 + Dwarfs3 + Dwarfs4 + Dwarfs5 + Dwarfs6 + Dwarfs7 + Dwarfs8 + Dwarfs9;
		
		if(result - ( Dwarfs9 + Dwarfs8 ) == 100 ){
		System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs5+"\n"+Dwarfs6+"\n"+Dwarfs7 );
		}else if( result - ( Dwarfs9 + Dwarfs7 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs5+"\n"+Dwarfs6+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs9 + Dwarfs6 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs5+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs9 + Dwarfs5 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs9 + Dwarfs4 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs9 + Dwarfs3 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs9 + Dwarfs2 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs9 + Dwarfs1 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs8 + Dwarfs7 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs8 + Dwarfs6 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs8 + Dwarfs5 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs8 + Dwarfs4 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs8 + Dwarfs3 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs8 + Dwarfs2 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs8 + Dwarfs1 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs7 + Dwarfs6 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs7 + Dwarfs5 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs7 + Dwarfs4 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs7 + Dwarfs3 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs7 + Dwarfs2 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs7 + Dwarfs1 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs6 + Dwarfs5 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs6 + Dwarfs4 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs6 + Dwarfs3 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs6 + Dwarfs2 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs6 + Dwarfs1 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs5 + Dwarfs4 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs5 + Dwarfs3 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs5 + Dwarfs2 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs5 + Dwarfs1 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs4 + Dwarfs3 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs4 + Dwarfs2 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs4 + Dwarfs1 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs3 + Dwarfs2 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs3 + Dwarfs1 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else if( result - ( Dwarfs2 + Dwarfs1 ) == 100 ){
			System.out.println( Dwarfs1+"\n"+Dwarfs2+"\n"+Dwarfs3+"\n"+Dwarfs4+"\n"+Dwarfs6+"\n"+Dwarfs7+"\n"+Dwarfs8 );
		}else{
			System.out.println("Error");
		}
	}
}
