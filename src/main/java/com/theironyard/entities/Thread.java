package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by jeffryporter on 7/19/16.
 */
@Entity
@Table(name = "threads")
public class Thread
{
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private User interestedUser;

    @ManyToOne
    private Item item;

    public Thread()
    {
    }

    public Thread(User interestedUser, Item item)
    {
        this.interestedUser = interestedUser;
        this.item = item;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public User getSender()
    {
        return interestedUser;
    }

    public void setSender(User sender)
    {
        this.interestedUser = sender;
    }

    public Item getItem()
    {
        return item;
    }

    public void setItem(Item item)
    {
        this.item = item;
    }
}
