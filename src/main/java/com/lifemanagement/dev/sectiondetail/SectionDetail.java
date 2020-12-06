package com.lifemanagement.dev.sectiondetail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SectionDetail {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String title;


    public SectionDetail() {
    }

    public SectionDetail(Integer id, String title) {
        this.id = id;
        this.title = title;
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

    public SectionDetail id(Integer id) {
        this.id = id;
        return this;
    }

    public SectionDetail title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            "}";
    }

}