package com.astontech.hr.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Jerry.Kelsay on 3/14/2017.
 */
@Entity
public class ElementType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ElementTypeId")
    private Integer id;

    @Version
    private Integer Version;

    private String elementTypeName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Element> elementList;

    public ElementType() {}
    public ElementType(String elementTypeName) {
        this.setElementTypeName(elementTypeName);
    }

    public ElementType(String elementType, List<Element> elementList) {
        this.setElementTypeName(elementTypeName);
        this.setElementList(elementList);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return Version;
    }

    public void setVersion(Integer version) {
        Version = version;
    }

    public String getElementTypeName() {
        return elementTypeName;
    }

    public void setElementTypeName(String elementTypeName) {
        this.elementTypeName = elementTypeName;
    }

    public List<Element> getElementList() {
        return elementList;
    }

    public void setElementList(List<Element> elementList) {
        this.elementList = elementList;
    }
}
