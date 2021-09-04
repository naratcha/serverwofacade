package serverwofacade;
public class Facade {
    private static Facade MyFacadeObj = null;
    private Facade() {}
    public static Facade getObj() {
        if (MyFacadeObj == null) { 
            MyFacadeObj = new Facade();
        } 
        return MyFacadeObj;
    }
    public void ServerOnline() {
        ServerOnline online = new ServerOnline();
        online.ServerOnlineFunc();
    }

    public void ServerOffline() {
        ServerOffline offline = new ServerOffline();
        offline.ServerOfflineFunc();
    }
}
