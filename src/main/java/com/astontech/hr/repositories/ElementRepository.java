package com.astontech.hr.repositories;

import com.astontech.hr.domain.Element;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Jerry.Kelsay on 3/14/2017.
 */
public interface ElementRepository extends CrudRepository<Element, Integer> {

    //auto generate the required code from teh structure of the method name
    Element findByElementName(String elementName);

    List<Element> findAllByElementName(String elementName);

    List<Element> findAllByElementNameIgnoreCase(String elementName);
}
