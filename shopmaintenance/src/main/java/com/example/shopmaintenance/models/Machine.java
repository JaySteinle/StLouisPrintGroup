package com.example.shopmaintenance.models;

import javax.persistence.Entity;


@Entity
public class Machine extends AbstractEntity{

    private String machineName;


    public Machine() {
    }

    public Machine(String machineName) {
        this.machineName = machineName;
    }


    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }
}