package com.theironyard.services;

import com.theironyard.entities.User;
import com.theironyard.entities.Work;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dan on 7/19/16.
 */
public interface WorkRepository extends CrudRepository<Work, Integer>
{
    public Iterable<Work> findByUser(User user);
}
