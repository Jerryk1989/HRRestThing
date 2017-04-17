package com.astontech.hr.domain;

import javax.persistence.*;

/**
 * Created by Jerry.Kelsay on 3/14/2017.
 */
@Entity
public class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ElementId")
    private Integer id;

    @Version
    private Integer Version;

    private String elementName;

    public Element() {}

    public Element(String elementName) {
        this.setElementName(elementName);
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

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }
}