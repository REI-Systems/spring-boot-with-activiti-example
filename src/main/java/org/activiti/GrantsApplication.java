package org.activiti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GrantsApplication {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String description;

    private String applicationDate;

    public GrantsApplication(){

    }

    public GrantsApplication(String ttile, String description, String applicationDate) {
        this.title = title;
        this.description = description;
        this.applicationDate = applicationDate;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }
}
