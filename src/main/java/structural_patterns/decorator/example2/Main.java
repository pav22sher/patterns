package structural_patterns.decorator.example2;

import structural_patterns.decorator.example2.decorator.DefaultNotifier;
import structural_patterns.decorator.example2.decorator.Facebook;
import structural_patterns.decorator.example2.decorator.Notifier;
import structural_patterns.decorator.example2.decorator.SMS;

public class Main {
    public static void main(String[] args) {
        String message = "Hello world!";
        Notifier notifier = new DefaultNotifier();
        notifier.send(message);
        System.out.println("--------------------");
        Notifier facebook = new Facebook(notifier);
        facebook.send(message);
        System.out.println("--------------------");
        Notifier sms = new SMS(notifier);
        sms.send(message);
        System.out.println("--------------------");
        Notifier multi = new Facebook(new SMS(new DefaultNotifier()));
        multi.send(message);
    }
}
