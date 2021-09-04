package serverwofacade;
class ServerOnline {
    public void ServerOnlineFunc() {
        ScheduleServer online = new ScheduleServer();
	    online.startBooting();
	    online.readSystemConfigFile();
	    online.init();
	    online.initializeContext();
	    online.initializeListeners();
	    online.createSystemObjects();
	    System.out.println("Start working......");
    }
}
