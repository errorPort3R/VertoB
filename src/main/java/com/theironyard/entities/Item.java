package com.theironyard.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by jeffryporter on 7/19/16.
 */
@Entity
@Table(name = "items")
public class Item
{
    public enum Status
    {
        PENDING,
        ACTIVE,
        INACTIVE,
        ARCHIVE,
        DELETE
    }

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String acceptableExchange;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @Column(nullable = false)
    private LocalDateTime time;

    @Column(nullable = false)
    private boolean service;

    @ManyToOne
    private User user;

    public Item()
    {
    }

    public Item(String title, String location, String description, String acceptableExchange, Status status, LocalDateTime time, boolean service, User user)
    {
        this.title = title;
        this.location = location;
        this.description = description;
        this.acceptableExchange = acceptableExchange;
        this.status = status;
        this.time = time;
        this.service = service;
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

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getAcceptableExchange()
    {
        return acceptableExchange;
    }

    public void setAcceptableExchange(String acceptableExchange)
    {
        this.acceptableExchange = acceptableExchange;
    }

    public Status getStatus()
    {
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public LocalDateTime getTime()
    {
        return time;
    }

    public void setTime(LocalDateTime time)
    {
        this.time = time;
    }

    public boolean isService()
    {
        return service;
    }

    public void setService(boolean service)
    {
        this.service = service;
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
