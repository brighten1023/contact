package com.emc.jpacontact.controller;


import com.emc.jpacontact.bean.ContactPerson;
import com.emc.jpacontact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    private ContactService cService;

    @PostMapping("/person/add")
    public ContactPerson save(@RequestBody ContactPerson person){
        return cService.save(person);
    }

    @PutMapping("/person/update")
    public ContactPerson update(@RequestBody ContactPerson person){
        return cService.update(person);
    }

    @DeleteMapping("/person/delete")
    public void delete(@RequestBody long id){
        cService.delete(id);
    }

    @GetMapping("/person/findall")
    public List<ContactPerson> findAll(){
        return cService.findAll();
    }

    @GetMapping("/person/findByNameLike")
    public List<ContactPerson> findByNameLike(@RequestBody String name){
        return cService.findByNameLike(name);
    }
}
