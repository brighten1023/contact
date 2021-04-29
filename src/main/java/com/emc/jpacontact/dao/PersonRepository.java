package com.emc.jpacontact.dao;

import com.emc.jpacontact.bean.ContactPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<ContactPerson,Long> {
    @Query(value = "SELECT * from contact where `name` like concat('%',?,'%')",nativeQuery = true)
    //@Query(value = "SELECT * from contact where `name`=?1",nativeQuery = true)
    List<ContactPerson> findByNameLike(String name);
}
