package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingsController {

    @MessageMapping("/hello")
    @SendTo("/topic/greeting")
    public Greeting greeting(Message message) throws Exception {
        System.out.println("Receiving message: " + message.getName());
        Thread.sleep(1000);
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()));
    }
}
