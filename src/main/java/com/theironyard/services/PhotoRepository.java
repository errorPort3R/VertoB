package com.theironyard.services;

import com.theironyard.entities.Item;
import com.theironyard.entities.Photo;
import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jeffryporter on 7/19/16.
 */
public interface PhotoRepository extends CrudRepository<Photo, Integer>
{
    public Iterable<Photo> findByItem(Item item);
    public Iterable<Photo> findByUser(User user);
}
