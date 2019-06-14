package com.company.ascae.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|consumer")
@Table(name = "ASCAE_METER")
@Entity(name = "ascae$Meter")
public class Meter extends StandardEntity {
    private static final long serialVersionUID = -3414176980495938409L;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONSUMER_ID")
    protected Consumer consumer;

    @NotNull
    @Column(name = "SERIAL_NO", nullable = false, length = 50)
    protected String serialNO;

    @Column(name = "CURRENT_INDICATORS")
    protected Integer current_indicators;

    @Column(name = "IS_USED")
    protected Boolean is_used;

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setSerialNO(String serialNO) {
        this.serialNO = serialNO;
    }

    public String getSerialNO() {
        return serialNO;
    }

    public void setCurrent_indicators(Integer current_indicators) {
        this.current_indicators = current_indicators;
    }

    public Integer getCurrent_indicators() {
        return current_indicators;
    }

    public void setIs_used(Boolean is_used) {
        this.is_used = is_used;
    }

    public Boolean getIs_used() {
        return is_used;
    }


}