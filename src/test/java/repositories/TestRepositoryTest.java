package repositories;

import com.astontech.hr.configuration.RepositoryConfiguration;
import com.astontech.hr.repositories.TestRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jerry.Kelsay on 3/14/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {RepositoryConfiguration.class})
public class TestRepositoryTest {

    @Autowired
    private TestRepository testRepository;

    @Test
    public void getZipCode() {
        com.astontech.hr.domain.Test tester = new com.astontech.hr.domain.Test(55099);

        testRepository.deleteAll();
        testRepository.save(tester);

        com.astontech.hr.domain.Test foundByZipCode = testRepository.findByZipCode(55099);

        assertEquals(tester.getId(), foundByZipCode.getId());

    }

    @Test
    public void findAllByZipCode() {
        List<com.astontech.hr.domain.Test> testList = new ArrayList<>();

        testList.add(new com.astontech.hr.domain.Test("Bob", "Longnecker", "100th Ave n", 55011, 763413289));
        testList.add(new com.astontech.hr.domain.Test("Joe", "Dirt", "101st Ave n", 87654, 612777333));
        testList.add(new com.astontech.hr.domain.Test("Jaime", "Kirkendall", "102nd Ave n", 55011, 999777666));
        testList.add(new com.astontech.hr.domain.Test("Amy", "Smith", "103rd Ave n", 55011, 333999444));
        testList.add(new com.astontech.hr.domain.Test("Max", "Mighty", "104th Ave n", 54321, 111888333));
        testList.add(new com.astontech.hr.domain.Test("Patrick", "Evan", "105th Ave n", 55011, 222888444));
        testList.add(new com.astontech.hr.domain.Test("Evan", "kimglner", 46573, 777555444));
        testList.add(new com.astontech.hr.domain.Test("Matt", "guy", 34567, 222000555));

        testRepository.deleteAll();
        testRepository.save(testList);

        Iterable<com.astontech.hr.domain.Test> foundAllByZipCode = testRepository.findAllByZipCode(55011);

        int count = 0;
        for(com.astontech.hr.domain.Test test: foundAllByZipCode){
            count++;
        }

        assertEquals(4, count);

    }

    @Test
    public void findByFirstName() {
        com.astontech.hr.domain.Test test = new com.astontech.hr.domain.Test("Amy");

        testRepository.deleteAll();
        testRepository.save(test);

        com.astontech.hr.domain.Test foundByFirstName = testRepository.findByFirstName("Amy");

        assertEquals(test.getId(), foundByFirstName.getId());
    }

    @Test
    public void countByZipCode() {
        List<com.astontech.hr.domain.Test> testList = new ArrayList<>();

        testList.add(new com.astontech.hr.domain.Test("Bob", "Longnecker", "100th Ave n", 55011, 763413289));
        testList.add(new com.astontech.hr.domain.Test("Joe", "Dirt", "101st Ave n", 87654, 612777333));
        testList.add(new com.astontech.hr.domain.Test("Jaime", "Kirkendall", "102nd Ave n", 55011, 999777666));
        testList.add(new com.astontech.hr.domain.Test("Amy", "Smith", "103rd Ave n", 55011, 333999444));
        testList.add(new com.astontech.hr.domain.Test("Max", "Mighty", "104th Ave n", 54321, 111888333));
        testList.add(new com.astontech.hr.domain.Test("Patrick", "Evan", "105th Ave n", 55011, 222888444));
        testList.add(new com.astontech.hr.domain.Test("Evan", "kimglner", 46573, 777555444));
        testList.add(new com.astontech.hr.domain.Test("Matt", "guy", 34567, 222000555));

        testRepository.deleteAll();
        testRepository.save(testList);

        long countByZipCode = testRepository.countByZipCode(55011);

        assertEquals(4,countByZipCode);
    }

    @Test
    public void countByFirstNameOrLastName() {
        List<com.astontech.hr.domain.Test> testList = new ArrayList<>();

        testList.add(new com.astontech.hr.domain.Test("Bob", "Longnecker", "100th Ave n", 55011, 763413289));
        testList.add(new com.astontech.hr.domain.Test("Joe", "Dirt", "101st Ave n", 87654, 612777333));
        testList.add(new com.astontech.hr.domain.Test("Jaime", "Kirkendall", "102nd Ave n", 55011, 999777666));
        testList.add(new com.astontech.hr.domain.Test("Amy", "Smith", 55011, 333999444));
        testList.add(new com.astontech.hr.domain.Test("Max", "Mighty", "104th Ave n", 54321, 111888333));
        testList.add(new com.astontech.hr.domain.Test("Patrick", "Evan", 55011, 222888444));
        testList.add(new com.astontech.hr.domain.Test("Evan", "kimglner", 46573, 777555444));
        testList.add(new com.astontech.hr.domain.Test("Matt", "guy", 34567, 222000555));

        testRepository.deleteAll();
        testRepository.save(testList);

        long countByAddressZipCode = testRepository.countByfirstNameOrZipCode("Evan", 55011);

        assertEquals(5, countByAddressZipCode);
    }
}