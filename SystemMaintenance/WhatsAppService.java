/**
* Purpose: This program represents the WhatsAppService class, 
* which implements the NotificationMedium interface for sending WhatsApp notifications.
* AI Disclaimer: I used AI to generate the WhatsAppService class and a test case for the main method.
* @author Mike Pietrafitta
* @version 1.0 06/12/2026
*/
public class WhatsAppService implements NotificationMedium {

    /**
     * Simulates sending a message as a WhatsApp notification.
     *
     * @param message the body text to deliver
     */
    @Override
    public void send(String message) {
        System.out.println("[WhatsApp] Sending message: " + message);
    }
}