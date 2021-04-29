package com.emc.jpacontact.dao;

import com.emc.jpacontact.bean.ContactPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<ContactPerson,Long> {
    //@Query(value = "SELECT * from contact where `creator` = ?1 and `name` like concat('%',?2,'%')",nativeQuery = true)

    //@Query(value = "SELECT * from contact where `creator` = ?1 and `name` = ?2",nativeQuery = true)
    List<ContactPerson> findByCreatorAndName(String creator,String name);
}
