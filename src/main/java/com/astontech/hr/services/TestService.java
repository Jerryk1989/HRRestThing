package com.astontech.hr.services;

import com.astontech.hr.domain.Test;

import java.util.List;

/**
 * Created by Jerry.Kelsay on 3/15/2017.
 */
public interface TestService {

    Iterable<Test> listAllTests();

    Test getTestById(Integer id);

    Test saveTest(Test test);

    Iterable<Test> saveTestList(List<Test> testList);

    void deleteTest(Integer id);

    //custom methods

    com.astontech.hr.domain.Test findByZipCode(Integer zipCode);

    List<Test> findAllByZipCode(Integer zipCode);

    com.astontech.hr.domain.Test findByFirstName(String firstName);

    long countByZipCode(Integer ZipCode);

    long countByfirstNameOrZipCode(String firstName, Integer zipCode);
}
