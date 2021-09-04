package serverwofacade;
class ServerOffline {
    public void ServerOfflineFunc() {
        ScheduleServer offline = new ScheduleServer();
        System.out.println("After work done.........");
	    offline.releaseProcesses();
	    offline.destory();
	    offline.destroySystemObjects();
	    offline.destoryListeners();
	    offline.destoryContext();
	    offline.shutdown();    
    }


}
