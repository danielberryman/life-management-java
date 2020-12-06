package com.lifemanagement.dev.tab;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.lifemanagement.dev.section.Section;

@Entity
public class Tab {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String title;
    private Boolean active;

    @ManyToOne
    @JoinColumn(name="section_id")
    private Section section;

    public Tab() {
    }

    public Tab(Integer id, String title, Boolean active) {
        this.id = id;
        this.title = title;
        this.active = active;
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

    public Boolean isActive() {
        return this.active;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Tab id(Integer id) {
        this.id = id;
        return this;
    }

    public Tab title(String title) {
        this.title = title;
        return this;
    }

    public Tab active(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", active='" + isActive() + "'" +
            "}";
    }

}