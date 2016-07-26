package com.theironyard.services;

import com.theironyard.entities.Item;
import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dan on 7/19/16.
 */
public interface ItemRepository extends CrudRepository<Item, Integer>
{
    public Iterable<Item> findByUser(User user);
    public Iterable<Item> findByServiceTrueOrderByTimeDesc();
    public Iterable<Item> findByServiceFalseOrderByTimeDesc();
    public Iterable<Item> findByUserAndStatus(User user, Item.Status status);
    public Iterable<Item> findByUserAndStatusOrderByTimeDesc(User user, Item.Status status);
}
