package com.zhuangjie.dp._结构型._2_组合模式;

import com.sun.org.apache.xpath.internal.operations.Or;
import javafx.geometry.Orientation;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    public String name;
    public List<Organization> subordinate = new ArrayList<Organization>();

    public Organization() {
    }

    public Organization(String name) {
        this.name = name;
    }

    public void add(Organization o) {
        subordinate.add(o);
    }
    public void remove(Organization o) {
        subordinate.remove(o);
    }
    public List<Organization> getSubordinate() {
        return subordinate;
    }
    public Organization down(String name) {
        for (Organization organization: subordinate) {
            if (organization.name == name) {
                return organization;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "name='" + name + '\'' +
                ", subordinate=" + subordinate +
                '}';
    }
    public void print() {
        System.out.println(subordinate);
    }
}
