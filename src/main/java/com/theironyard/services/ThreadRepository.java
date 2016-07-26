package com.theironyard.services;

import com.theironyard.entities.Item;
import com.theironyard.entities.User;
import com.theironyard.entities.Thread;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dan on 7/19/16.
 */
public interface ThreadRepository extends CrudRepository<Thread, Integer>
{
    public Iterable<Thread> findByInterestedUser(User interestedUser);
    public Iterable<Thread> findByItem(Item item);
    public Thread findByInterestedUserAndItem(User interestedUser, Item item);
}
