package com.theironyard.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by jeffryporter on 7/19/16.
 */
@Entity
@Table(name = "messages")
public class Message
{
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String body;

    @Column(nullable = false)
    private LocalDateTime time;

    @ManyToOne
    private Thread thread;

    @ManyToOne
    private User user;

    public Message()
    {
    }

    public Message(String body, LocalDateTime time, Thread thread, User user)
    {
        this.body = body;
        this.time = time;
        this.thread = thread;
        this.user = user;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getBody()
    {
        return body;
    }

    public void setBody(String body)
    {
        this.body = body;
    }

    public LocalDateTime getTime()
    {
        return time;
    }

    public void setTime(LocalDateTime time)
    {
        this.time = time;
    }

    public Thread getThread()
    {
        return thread;
    }

    public void setThread(Thread thread)
    {
        this.thread = thread;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}
