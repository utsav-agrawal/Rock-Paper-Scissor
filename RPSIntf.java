public interface RPSIntf extends java.rmi.Remote{
    public int register(char handPlayed) throws java.rmi.RemoteException;
    public boolean handPlayed()throws java.rmi.RemoteException;
    public String getResult(int id)throws java.rmi.RemoteException;
}
