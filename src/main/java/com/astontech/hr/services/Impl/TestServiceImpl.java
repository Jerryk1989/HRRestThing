package com.astontech.hr.services.Impl;

import com.astontech.hr.domain.Test;
import com.astontech.hr.repositories.TestRepository;
import com.astontech.hr.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jerry.Kelsay on 3/15/2017.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public Iterable<Test> listAllTests() {
        return testRepository.findAll();
    }

    @Override
    public Test getTestById(Integer id) {
        return testRepository.findOne(id);
    }

    @Override
    public Test saveTest(Test test) {
        return testRepository.save(test);
    }

    @Override
    public Iterable<Test> saveTestList(List<Test> testList) {
        return testRepository.save(testList);
    }

    @Override
    public void deleteTest(Integer id) {
        testRepository.delete(id);
    }

    @Override
    public Test findByZipCode(Integer zipCode) {
        return testRepository.findByZipCode(zipCode);
    }

    @Override
    public List<Test> findAllByZipCode(Integer zipCode) {
        return testRepository.findAllByZipCode(zipCode);
    }

    @Override
    public Test findByFirstName(String firstName) {
        return testRepository.findByFirstName(firstName);
    }

    @Override
    public long countByZipCode(Integer ZipCode) {
        return testRepository.countByZipCode(ZipCode);
    }

    @Override
    public long countByfirstNameOrZipCode(String firstName, Integer zipCode) {
        return testRepository.countByfirstNameOrZipCode(firstName, zipCode);
    }
}
