import java.io.Console;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientOperation {

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
        String address = "//localhost/MyServer";
        if (args.length == 1) address = args[0];
        RMIInterface lookup = (RMIInterface) Naming.lookup(address);
        System.out.println("Got server handle " + lookup);

        Console console = System.console();
        if (console == null) {
            System.err.println("No console available");
            return;
        }

        String line = System.console().readLine("What is your name?");
        String response = lookup.helloTo(line);
        System.out.println(response);
    }
}
