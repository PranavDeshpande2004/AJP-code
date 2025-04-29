package RMI_pack;
import java.rmi.*;
import java.util.*;

public class Client {
	public static void main(String args[]) throws Exception {
		PrintI obj=(PrintI)Naming.lookup("rmi://localhost:5000/check");
		
		Scanner sc=new Scanner (System.in);
		System.out.println("put the string=");
		String strs=sc.nextLine();
		
		boolean ans=obj.check(strs);
		
		if(ans) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
		
		
		
		
		
	}

}
