/**
* Purpose: This program represents the NotificationMedium interface, 
* which defines the contract for any notification delivery channel.
* AI Disclaimer: I used AI to verify the code and create test cases for the main method.
* @author Mike Pietrafitta
* @version 1.0 06/06/2026
*/
public interface NotificationMedium {

    /**
     * Delivers a notification to the user using this medium.
     *
     * @param message the text to deliver
     */
    void send(String message);
}
