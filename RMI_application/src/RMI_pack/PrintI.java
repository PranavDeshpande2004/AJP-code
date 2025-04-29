package RMI_pack;
import java.rmi.*;

public interface PrintI extends Remote {
	public boolean check(String str)throws RemoteException;



}
