package com.example.shopmaintenance.models;


import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Job extends AbstractEntity{

    private Date dateScheduled;
    private Date dateCompleted;
    private String description;


//    Inialize id & value fields.
    public Job(Date aDateScheduled, Date aDateCompleted, String aDescription) {
        super();
        this.dateScheduled = aDateScheduled;
        this.dateCompleted = aDateCompleted;
        this.description = aDescription;
    }

    public Job() {
    }

    public Date getDateScheduled() {
        return dateScheduled;
    }

    public void setDateScheduled(Date dateScheduled) {
        this.dateScheduled = dateScheduled;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return description;
    }
}