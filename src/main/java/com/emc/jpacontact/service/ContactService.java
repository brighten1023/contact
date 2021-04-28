package com.emc.jpacontact.service;

import com.emc.jpacontact.bean.ContactPerson;

import java.util.List;

public interface ContactService {

    List<ContactPerson> findByNameLike(String name);
}
