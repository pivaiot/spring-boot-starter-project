package com.pivaiot.example.jpa.service.impl.entity;

import com.pivaiot.common.db.jpa.AutoIncrementIdEntity;
import com.pivaiot.example.jpa.service.data.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "greeting")
@Data
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends AutoIncrementIdEntity<User> {

    @Column
    private String says;

}
