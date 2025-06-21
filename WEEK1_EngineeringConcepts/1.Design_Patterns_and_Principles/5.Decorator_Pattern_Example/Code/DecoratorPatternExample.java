
public class DecoratorPatternExample {
    public static void main(String[] args) {

        Notifier emailOnly = new EmailNotifier();  

        Notifier emailAndSMS = new SMSNotifierDecorator(new EmailNotifier());

        Notifier fullNotification = new SlackNotifierDecorator(
                                        new SMSNotifierDecorator(
                                            new EmailNotifier()));

        System.out.println("\nEmail Only");
        emailOnly.send("Hi!");

        System.out.println("\nEmail + SMS");
        emailAndSMS.send("Hi!");

        System.out.println("\nEmail + SMS + Slack");
        fullNotification.send("Hi!");
    }
}
