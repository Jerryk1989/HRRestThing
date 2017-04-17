package com.astontech.hr.services;

import com.astontech.hr.domain.ElementType;

/**
 * Created by Jerry.Kelsay on 3/15/2017.
 */
public interface ElementTypeService {

    Iterable<ElementType> listAllElementTypes();

    ElementType getElementTypeById(Integer id);

    ElementType saveElementType(ElementType elementType);

    Iterable<ElementType> saveElementTypeList(Iterable<ElementType> elementIterable);

    void deleteElementType(Integer id);
}
