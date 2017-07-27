package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by chenBing on 2017/7/24.
 */
@Component
public class MessagePrinter {
    @Autowired
    private MessageService messageService;


    public void printMessage() {
        System.out.println(this.messageService.getMessage());
    }
}
