package com.company.ascae.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|address")
@Table(name = "ASCAE_CONSUMER")
@Entity(name = "ascae$Consumer")
public class Consumer extends StandardEntity {
    private static final long serialVersionUID = 4434971276176435609L;

    @NotNull
    @Column(name = "ADDRESS", nullable = false, length = 150)
    protected String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }


}