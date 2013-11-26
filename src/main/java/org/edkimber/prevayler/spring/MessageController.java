package org.edkimber.prevayler.spring;

import org.edkimber.prevayler.spring.domain.Message;
import org.edkimber.prevayler.spring.transactions.CreateMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ed Kimber
 */
@RestController
public class MessageController {

    private final PrevaylerService prevaylerService_;

    @Autowired
    public MessageController(PrevaylerService prevayler) {
        prevaylerService_ = prevayler;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Message postMessage(@RequestBody String message) throws Exception {
        return prevaylerService_.getPrevayler().execute(new CreateMessage(message));
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Message getMessage(@PathVariable long id) {
        return prevaylerService_.getMessageStore().get(id);
    }
}
