package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Employer extends AbstractEntity {


    @OneToMany
    @JoinColumn
    private final List<Job> jobs = new ArrayList();


    @NotBlank
    @NotNull(message = "Location is required.")
    private String location;

    public Employer (String location) {
        this.location = location;
    }

    public Employer () {}

    public List<Job> getJobs() {
        return jobs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
