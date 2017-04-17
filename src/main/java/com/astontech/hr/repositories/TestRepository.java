package com.astontech.hr.repositories;

import com.astontech.hr.domain.Test;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Jerry.Kelsay on 3/14/2017.
 */
public interface TestRepository extends CrudRepository<Test, Integer> {

    com.astontech.hr.domain.Test findByZipCode(Integer zipCode);

    List<Test> findAllByZipCode(Integer zipCode);

    com.astontech.hr.domain.Test findByFirstName(String firstName);

    long countByZipCode(Integer ZipCode);

    long countByfirstNameOrZipCode(String firstName, Integer zipCode);
}
