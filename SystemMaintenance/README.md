# Guidance on commands used:

## To compile:
> javac *.java

## To run in CLI:
> java AlertSystem.java

## Output:
```
=== Notification System Test ===

-- Using EmailService --
[EMAIL] Your account password was changed.
[EMAIL] Monthly invoice #1042 is ready.

-- Swapping to SMSService --
[SMS]   Login attempt from new device detected.
[SMS]   Your order has shipped! Tracking: ZX9-00421.

-- Swapping to WhatsAppService --
[WhatsApp] Sending message: Your verification code is 482-991.
[WhatsApp] Sending message: Flash sale ends in 1 hour - 30% off sitewide.

======= Session Log (6 message(s)) =======
   1. [EmailService] Your account password was changed.
   2. [EmailService] Monthly invoice #1042 is ready.
   3. [SMSService] Login attempt from new device detected.
   4. [SMSService] Your order has shipped! Tracking: ZX9-00421.
   5. [WhatsAppService] Your verification code is 482-991.
   6. [WhatsAppService] Flash sale ends in 1 hour - 30% off sitewide.
=======================================
```

## To generate the javadocs:
> javadoc -d docs *.java

## AI Disclaimer:
```
I used AI to generate the WhatsAppService class and a test case for the main method.

Query: I have an existing Java notification system with the following interface: public interface NotificationMedium { void send(String message); } I also have an AlertSystem container that calls medium.send(message) and logs results in an ArrayList<String>. Do not modify AlertSystem or NotificationMedium. Generate a new class called WhatsAppService that implements NotificationMedium. The send method must print: [WhatsApp] Sending message: <message text>.

Verification: The model had knowledge of the previous week's project, so verifying it matched the existing interface signature couldn't have been easier.  In addition, it generated the test case without me needing to prompt it.
```
## AI Output:
```
public class WhatsAppService implements NotificationMedium {
    @Override
    public void send(String message) {
        System.out.println("[WhatsApp] Sending message:" + message);
    }
}

System.out.println("\n-- Swapping to WhatsAppService --");
alertSystem.setMedium(new WhatsAppService());

alertSystem.notifyUser("Your verification code is 482-991.");
alertSystem.notifyUser("Flash sale ends in 1 hour - 30% off sitewide.");
```
