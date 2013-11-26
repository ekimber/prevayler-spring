package org.edkimber.prevayler.spring.domain;

import java.util.Date;
import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;

/**
 * @author Ed Kimber
 */
public class MessageStore {
    private long nextId_ = 0;
    private Map<Long, Message> messages_;

    public MessageStore() {
        messages_ = newHashMap();
    }

    public Message save(String text, Date timestamp) {
        Message message = new Message(nextId_, text, timestamp);
        messages_.put(nextId_++, message);
        return message;
    }

    public Message get(long id) {
        return messages_.get(id);
    }
}
