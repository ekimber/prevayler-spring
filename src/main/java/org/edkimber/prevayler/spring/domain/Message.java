package org.edkimber.prevayler.spring.domain;

import java.util.Date;

/**
 * @author Ed Kimber
 */
public class Message {
    private final long id_;
    private final String message_;
    private final Date timestamp_;

    public Message(long id, String message, Date timestamp) {
        id_ = id;
        message_ = message;
        timestamp_ = timestamp;
    }

    public long getId() {
        return id_;
    }

    public String getMessage() {
        return message_;
    }

    public Date getTimestamp() {
        return timestamp_;
    }
}
