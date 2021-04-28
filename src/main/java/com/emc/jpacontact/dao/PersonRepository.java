package com.emc.jpacontact.dao;

import com.emc.jpacontact.bean.ContactPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<ContactPerson,Long>, JpaSpecificationExecutor {

    List<ContactPerson> findByNameLike(String name);

}
