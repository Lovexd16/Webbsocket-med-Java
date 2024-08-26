package com.websockets.websockets;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class StompController {

    @MessageMapping("/hello")
    @SendTo("/topic/greeting")
    public Hello hello(HelloMessage message) {
        System.out.println("/Hello");
        return new Hello("Hello: " + message.getName() + "!");
    }

}
