package com.lifemanagement.dev.section;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.lifemanagement.dev.tab.Tab;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String title;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "section", orphanRemoval = true)
    private List<Tab> tabs;
    

    public Section() {
    }

    public Section(Integer id, String title, List<Tab> tabs) {
        this.id = id;
        this.title = title;
        this.tabs = tabs;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Tab> getTabs() {
        return this.tabs;
    }

    public void setTabs(List<Tab> tabs) {
        this.tabs = tabs;
    }

    public Section id(Integer id) {
        this.id = id;
        return this;
    }

    public Section title(String title) {
        this.title = title;
        return this;
    }

    public Section tabs(List<Tab> tabs) {
        this.tabs = tabs;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", tabs='" + getTabs() + "'" +
            "}";
    }

}