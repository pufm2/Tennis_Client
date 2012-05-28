import infrastructure.TennisServiceRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class Main {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TennisServiceRemote remote = (TennisServiceRemote) context.lookup("TennisService/remote");
		System.out.println(remote.play(9));
		//System.out.println(remote.getTournament(785));
	}

}