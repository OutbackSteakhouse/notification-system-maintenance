import java.util.ArrayList;

/**
* Purpose: This program represents the AlertSystem class, 
* which manages notification dispatching in a smart home system.
* AI Disclaimer: I used AI to verify the code and create test cases for the main method.
* @author Mike Pietrafitta
* @version 1.0 06/06/2026
*/
public class AlertSystem {

    /**
     * The currently active delivery channel.
     * Replaced at runtime via setMedium(NotificationMedium).
     */
    private NotificationMedium medium;

    /**
     * Log of every message during this session.
     * Entries include the medium label so the log is self-describing.
     */
    private final ArrayList<String> messageLog;

    /**
     * Constructs an AlertSystem with an initial delivery medium.
     *
     * @param initialMedium the first NotificationMedium to use
     * @throws IllegalArgumentException if initialMedium is null
     */
    public AlertSystem(NotificationMedium initialMedium) {
        if (initialMedium == null) {
            throw new IllegalArgumentException("initialMedium must not be null.");
        }
        this.medium     = initialMedium;
        this.messageLog = new ArrayList<>();
    }

    /**
     * Replaces the active delivery channel with medium.
     *
     * @param medium the new NoticiationMedium to use
     * @throws IllegalArgumentException if medium is null
     */
    public void setMedium(NotificationMedium medium) {
        if (medium == null) {
            throw new IllegalArgumentException("medium must not be null.");
        }
        this.medium = medium;
    }

    /**
     * Dispatches a message through the currently active medium and
     * appends a timestamped entry to the session log.
     *
     * @param message the notification text to send
     * @throws IllegalArgumentException if message is null or blank
     */
    public void notifyUser(String message) {
        if (message == null || message.trim().isEmpty()) {
            throw new IllegalArgumentException("message must not be null or blank.");
        }
        medium.send(message);
        String logEntry = "[" + medium.getClass().getSimpleName() + "] " + message;
        messageLog.add(logEntry);
    }

    /**
     * Returns a copy of the session log so callers cannot mutate
     * the internal list.
     *
     * @return a new ArrayList containing every log entry recorded during this session, in chronological order
     */
    public ArrayList<String> getLog() {
        return new ArrayList<>(messageLog);
    }

    /**
     * Prints every log entry to standard output, preceded by a header line.
     */
    public void printLog() {
        System.out.println("\n======= Session Log (" + messageLog.size() + " message(s)) =======");
        for (int i = 0; i < messageLog.size(); i++) {
            System.out.printf("  %2d. %s%n", i + 1, messageLog.get(i));
        }
        System.out.println("=======================================");
    }

    /**
     * Demonstrates the notification system from the command line.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        System.out.println("=== Notification System Test ===\n");
        AlertSystem alertSystem = new AlertSystem(new EmailService());

        System.out.println("-- Using EmailService --");
        alertSystem.notifyUser("Your account password was changed.");
        alertSystem.notifyUser("Monthly invoice #1042 is ready.");

        System.out.println("\n-- Swapping to SMSService --");
        alertSystem.setMedium(new SMSService());

        alertSystem.notifyUser("Login attempt from new device detected.");
        alertSystem.notifyUser("Your order has shipped! Tracking: ZX9-00421.");
        alertSystem.printLog();
    }
}