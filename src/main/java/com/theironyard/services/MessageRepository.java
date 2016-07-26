package com.theironyard.services;

import com.theironyard.entities.Message;
import com.theironyard.entities.User;
import com.theironyard.entities.Thread;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dan on 7/19/16.
 */
public interface MessageRepository extends CrudRepository<Message, Integer>{
    public Iterable<Message> findByThread(Thread thread);
    public Iterable <Message> findByUser(User user);
}
