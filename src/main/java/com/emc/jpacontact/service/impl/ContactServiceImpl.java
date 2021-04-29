package com.emc.jpacontact.service.impl;

import com.emc.jpacontact.bean.ContactPerson;
import com.emc.jpacontact.dao.PersonRepository;
import com.emc.jpacontact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ContactServiceImpl implements ContactService {

    @Autowired
    private PersonRepository pRepository;

    @Override
    public ContactPerson save(ContactPerson student) {
        return pRepository.save(student);
    }

    @Override
    public ContactPerson update(ContactPerson student) {
        return pRepository.save(student);
    }

    @Override
    public void delete(long id) {
        pRepository.deleteById(id);
    }

    @Override
    public List<ContactPerson> findAll(){
        return pRepository.findAll();
    }

    @Override
    public List<ContactPerson> findByNameLike(String name){
        return pRepository.findByNameLike(name);
    }
}
