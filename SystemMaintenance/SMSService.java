/**
* Purpose: This program represents the SMSService class, 
* which implements the NotificationMedium interface for sending SMS notifications.
* AI Disclaimer: I used AI to verify the code and create test cases for the main method.
* @author Mike Pietrafitta
* @version 1.0 06/06/2026
*/
public class SMSService implements NotificationMedium {

    /**
     * Simulates sending a message as an SMS notification.
     *
     * @param message the body text to deliver
     */
    @Override
    public void send(String message) {
        System.out.println("[SMS]   " + message);
    }
}
