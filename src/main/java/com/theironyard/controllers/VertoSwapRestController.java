package com.theironyard.controllers;

import com.theironyard.entities.*;
import com.theironyard.entities.Thread;
import com.theironyard.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jeffryporter on 7/20/16.
 */
@RestController
public class VertoSwapRestController
{

    @Autowired
    UserRepository users;

    @Autowired
    WorkRepository works;

    @Autowired
    ItemRepository items;

    @Autowired
    MessageRepository messages;

    @Autowired
    ThreadRepository threads;

    @Autowired
    PhotoRepository photos;

    //***************************************************************************************
    //
    //               USER Routes
    //
    //***************************************************************************************
    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public Iterable<User> getUsers()
    {
        return users.findAll();
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public void addUser(@RequestBody User user)
    {
        users.save(user);
    }

    @RequestMapping(path = "/user", method = RequestMethod.PUT)
    public void editUser(@RequestBody User user)
    {
        users.save(user);
    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") int id)
    {
        users.delete(id);
    }

    @RequestMapping(path = "/#/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") int id)
    {
        return users.findOne(id);
    }


    //***************************************************************************************
    //
    //        WORK Routes
    //
    //***************************************************************************************
    @RequestMapping(path = "/work", method = RequestMethod.GET)
    public Iterable<Work> getWorks()
    {
        return works.findAll();
    }

    @RequestMapping(path = "/work", method = RequestMethod.POST)
    public void addWork(@RequestBody Work work)
    {
        works.save(work);
    }

    @RequestMapping(path = "/work", method = RequestMethod.PUT)
    public void editWork(@RequestBody Work work)
    {
        works.save(work);
    }

    @RequestMapping(path = "/work/{id}", method = RequestMethod.DELETE)
    public void deleteWork(@PathVariable("id") int id)
    {
        works.delete(id);
    }

    @RequestMapping(path = "/#/work/{id}", method = RequestMethod.GET)
    public Work getWork(@PathVariable("id") int id)
    {
        return works.findOne(id);
    }


    //***************************************************************************************
    //
    //                  ITEM Routes
    //
    //***************************************************************************************
    @RequestMapping(path = "/item", method = RequestMethod.GET)
    public Iterable<Item> getItems()
    {
        return items.findAll();
    }

    @RequestMapping(path = "/item", method = RequestMethod.POST)
    public void addItem(@RequestBody Item item)
    {
        items.save(item);
    }

    @RequestMapping(path = "/item", method = RequestMethod.PUT)
    public void editItem(@RequestBody Item item)
    {
        items.save(item);
    }

    @RequestMapping(path = "/item/{id}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable("id") int id)
    {
        items.delete(id);
    }

    @RequestMapping(path = "/#/item/{id}", method = RequestMethod.GET)
    public Item getItem(@PathVariable("id") int id)
    {
        return items.findOne(id);
    }


    //***************************************************************************************
    //
    //        MESSAGE Routes
    //
    //***************************************************************************************

//    private List<SseEmitter> emitters = new CopyOnWriteArrayList<>();
//
//    @RequestMapping("/messages")
//    public SseEmitter messages()
//    {
//        SseEmitter sseEmitter = new SseEmitter();
//
//        emitters.add(sseEmitter);
//
//        sseEmitter.onCompletion(() -> emitters.remove(sseEmitter));
//        return sseEmitter;
//    }
//    @RequestMapping(value= "/new-message", method = RequestMethod.POST)
//    public void postMessage(String message)
//    {
//        for(SseEmitter emitter : emitters)
//        {
//            try
//            {
//                emitter.send(SseEmitter.event().name("spring").data(message));
//            } catch (IOException e)
//            {
//                e.printStackTrace();
//            }
//        }
//    }

    //***************************************************************************************
    //
    //                  THREAD Routes
    //
    //***************************************************************************************
    @RequestMapping(path = "/thread", method = RequestMethod.GET)
    public Iterable<Thread> getThreads()
    {
        return threads.findAll();
    }

    @RequestMapping(path = "/thread", method = RequestMethod.POST)
    public void addThread(@RequestBody Thread thread)
    {
        threads.save(thread);
    }

    @RequestMapping(path = "/thread", method = RequestMethod.PUT)
    public void editThread(@RequestBody Thread thread)
    {
        threads.save(thread);
    }

    @RequestMapping(path = "/thread/{id}", method = RequestMethod.DELETE)
    public void deleteThread(@PathVariable("id") int id)
    {
        threads.delete(id);
    }

    @RequestMapping(path = "/#/thread/{id}", method = RequestMethod.GET)
    public Thread getThread(@PathVariable("id") int id)
    {
        return threads.findOne(id);
    }


    //***************************************************************************************
    //
    //                  PHOTO Routes
    //
    //***************************************************************************************
    @RequestMapping(path = "/photo", method = RequestMethod.GET)
    public Iterable<Photo> getPhotos()
    {
        return photos.findAll();
    }

    @RequestMapping(path = "/photo", method = RequestMethod.POST)
    public void addThread(@RequestBody Photo photo)
    {
        photos.save(photo);
    }

    @RequestMapping(path = "/photo", method = RequestMethod.PUT)
    public void editThread(@RequestBody Photo photo)
    {
        photos.save(photo);
    }

    @RequestMapping(path = "/photo/{id}", method = RequestMethod.DELETE)
    public void deletePhoto(@PathVariable("id") int id)
    {
        photos.delete(id);
    }

    @RequestMapping(path = "/#/photo/{item_id}", method = RequestMethod.GET)
    public Iterable<Photo> getPhotosbyItem(@PathVariable("item_id") int id)
    {
        Item item = items.findOne(id);
        return photos.findByItem(item);
    }

    @RequestMapping(path = "/#/photo/{id}", method = RequestMethod.GET)
    public Photo getPhoto(@PathVariable("id") int id)
    {
        return photos.findOne(id);
    }



}
