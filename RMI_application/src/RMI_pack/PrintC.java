package RMI_pack;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class PrintC extends UnicastRemoteObject implements PrintI {
	public PrintC() throws RemoteException {
		super();
	}
	
	public boolean check(String str) {

		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
			
		}
		if(str.equals(rev)) {
			return true;
		}
		return false;
	}

}
