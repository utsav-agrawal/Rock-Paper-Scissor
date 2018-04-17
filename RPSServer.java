import java.rmi.Naming;
public class RPSServer {
    RPSIntf rps;
    public RPSServer(){
        try{
            rps=new RPSImpl();
            Naming.rebind("rmi://localhost:1099//RPSGame",rps);
        }
        catch(Exception e){}
    }
    public static void main(String[] args) {
        new RPSServer();
    }
}
