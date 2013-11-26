package org.edkimber.prevayler.spring.transactions;

import org.edkimber.prevayler.spring.domain.Message;
import org.edkimber.prevayler.spring.domain.MessageStore;
import org.prevayler.TransactionWithQuery;

import java.util.Date;

/**
 * @author Ed Kimber
 */
public class CreateMessage implements TransactionWithQuery<MessageStore, Message> {
    private String message_;

    public CreateMessage(String message) {
        message_ = message;
    }

    @Override
    public Message executeAndQuery(MessageStore messageStore, Date executionTime) throws Exception {
        return messageStore.save(message_, executionTime);
    }
}
