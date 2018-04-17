
import java.rmi.RemoteException;
import java.util.Arrays;

public class RPSImpl extends java.rmi.server.UnicastRemoteObject implements RPSIntf{
    static char playerHand[] = new char[2];
    static int win;
    static boolean seenResult[] = new boolean[2];
    public RPSImpl() throws RemoteException {        
        super();      
        playerHand[0] = 0;
        playerHand[1] = 0;
    }
    
    public int register(char handPlayed) throws RemoteException {
        int id=0;
        if(playerHand[0]==0) {playerHand[0]=handPlayed;id=0;}
        else {playerHand[1]=handPlayed;id=1;}
        if (playerHand[0]!=0 && playerHand[1]!=0)   play();
        return id;
    }
    
    public void play() throws RemoteException {
        win=calculate();
        String result=" Match "+ (win==0?("Won by Player "+0):(win==1?("Won by Player "+1):" tied"));
        System.out.println(result);
    }
    
    public boolean handPlayed(){
         return (playerHand[0]!=0 && playerHand[1]!=0);
    }

    private static void clear(){
        playerHand[0] = 0;
        playerHand[1] = 0;
        seenResult[0] = false;
        seenResult[1] = false;
    }
    
    public String getResult(int id){
       seenResult[id] = true;
       if(seenResult[0]&&seenResult[1]) clear();
       System.out.println(Arrays.toString(seenResult));
       if(win<0) return "Match Tied";
       if(id==win) return "You won";
       return "You Lose";
    }
    
    public static int calculate() {
        if(playerHand[0] == 'r'){
            if (playerHand[1] == 'p') return 1;
            if (playerHand[1] == 's') return 0;
            else return -1;
        }
        if(playerHand[0] == 'p'){
            if (playerHand[1] == 's') return 1;
            if (playerHand[1] == 'r') return 0;
            else return -1;
        }
        if(playerHand[0] == 's'){
            if (playerHand[1] == 'r') return 1;
            if (playerHand[1] == 'p') return 0;
            else return -1;
        }
        return -2;
    }
}
