package RMI_pack;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;

public class Server {
	public static void main(String args[]) throws Exception {
		Registry registry=LocateRegistry.createRegistry(5000);
		PrintC obj=new PrintC();
		registry.bind("check", obj);
		System.out.println("server connected");
	
		
	}

}
