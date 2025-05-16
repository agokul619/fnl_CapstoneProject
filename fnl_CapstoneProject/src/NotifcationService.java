public class NotifcationService {

    public NotifcationService() {

    }

    public void sendNotification(BasicNotification notification) {
        System.out.println("NOTIFICATION: " + notification.getMessage());

    }

}