package com.emc.jpacontact.service;

import com.emc.jpacontact.bean.ContactPerson;

import java.util.List;

public interface ContactService {

    //Add
    ContactPerson save(ContactPerson person);

    //Update
    ContactPerson update(ContactPerson person);

    //Delete
    void delete(long id);

    //Find all
    List<ContactPerson> findAll();

    //Find by like name
    List<ContactPerson> findByNameLike(String name);
}
