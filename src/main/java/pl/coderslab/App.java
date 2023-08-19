package pl.coderslab;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;

public class App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//        helloWorld.printMessage();
//        helloWorld.getMessage();

//        EmailService emailService = (EmailService) context.getBean("emailService");
//        emailService.send();

        MessageSender messageSender = (MessageSender) context.getBean("messageSender");
        messageSender.sendMessage();
        messageSender.sendMessageFromProperty();








        context.close();

    }
}
