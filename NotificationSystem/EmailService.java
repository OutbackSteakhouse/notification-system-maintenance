/**
* Purpose: This program represents the EmailService class, 
* which implements the NotificationMedium interface for sending e-mail notifications.
* AI Disclaimer: I used AI to verify the code and create test cases for the main method.
* @author Mike Pietrafitta
* @version 1.0 06/06/2026
*/
public class EmailService implements NotificationMedium {

    /**
     * Simulates sending a message as an e-mail notification.
     *
     * @param message the body text to deliver
     */
    @Override
    public void send(String message) {
        System.out.println("[EMAIL] " + message);
    }
}
