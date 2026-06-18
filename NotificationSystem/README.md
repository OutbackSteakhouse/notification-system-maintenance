# Guidance on commands used:

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

======= Session Log (4 message(s)) =======
   1. [EmailService] Your account password was changed.
   2. [EmailService] Monthly invoice #1042 is ready.
   3. [SMSService] Login attempt from new device detected.
   4. [SMSService] Your order has shipped! Tracking: ZX9-00421.
=======================================
```

## To generate the javadocs:
> javadoc -d docs *.java

## AI Disclaimer:
```
I used AI to verify the code and create test cases for the main method.

Query: Given the provided context, please generate an example e-mail notification and an example SMS notification.
```
## AI Output:
```
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
```
