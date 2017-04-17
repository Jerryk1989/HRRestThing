package services;

import com.astontech.hr.Application;
import com.astontech.hr.services.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
/**
 * Created by Jerry.Kelsay on 3/15/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
@WebAppConfiguration
public class TestServiceTest {

    @Autowired
    private TestService testService;

    @Test
    public void testServiceFirstNameZipCodeCount() {
        List<com.astontech.hr.domain.Test> testList = new ArrayList<>();

        testList.add(new com.astontech.hr.domain.Test("Bob", "Longnecker", "100th Ave n", 55011, 763413289));
        testList.add(new com.astontech.hr.domain.Test("Joe", "Dirt", "101st Ave n", 87654, 612777333));
        testList.add(new com.astontech.hr.domain.Test("Jaime", "Kirkendall", "102nd Ave n", 55011, 999777666));
        testList.add(new com.astontech.hr.domain.Test("Amy", "Smith", 55011, 333999444));
        testList.add(new com.astontech.hr.domain.Test("Max", "Mighty", "104th Ave n", 54321, 111888333));
        testList.add(new com.astontech.hr.domain.Test("Patrick", "Evan", 55011, 222888444));
        testList.add(new com.astontech.hr.domain.Test("Evan", "kimglner", 46573, 777555444));
        testList.add(new com.astontech.hr.domain.Test("Matt", "guy", 34567, 222000555));

        testService.saveTestList(testList);

        long countByAddressZipCode = testService.countByfirstNameOrZipCode("Evan", 55011);

        assertEquals(5, countByAddressZipCode);

    }
}
