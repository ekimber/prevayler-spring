package org.edkimber.prevayler.spring;

import org.edkimber.prevayler.spring.domain.MessageStore;
import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Ed Kimber
 */
@Component
public class PrevaylerService {
    private Prevayler<MessageStore> prevayler_;
    private MessageStore messageStore_;

    public PrevaylerService() throws Exception {
        messageStore_ = new MessageStore();
        prevayler_ = PrevaylerFactory.createPrevayler(messageStore_);
    }

    public Prevayler<MessageStore> getPrevayler() {
        return prevayler_;
    }

    public MessageStore getMessageStore() {
        return messageStore_;
    }
}
