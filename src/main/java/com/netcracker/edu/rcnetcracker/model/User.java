package com.netcracker.edu.rcnetcracker.model;

import com.netcracker.edu.rcnetcracker.db.annotations.Attribute;
import com.netcracker.edu.rcnetcracker.db.annotations.ObjectType;
import com.netcracker.edu.rcnetcracker.db.annotations.ValueType;

import java.util.List;

@ObjectType(id = 10)
public class User extends BaseEntity {

    @Attribute(id = 21, valueType = ValueType.VALUE)
    private String email;

    @Attribute(id = 22, valueType = ValueType.VALUE)
    private String password;

    @Attribute(id = 23, valueType = ValueType.VALUE)
    private String firstName;

    @Attribute(id = 24, valueType = ValueType.VALUE)
    private String lastName;

    @Attribute(id = 25, valueType = ValueType.VALUE)
    private String patronymic;

    @Attribute(id = 26, valueType = ValueType.VALUE)
    private Boolean isActive;

    @Attribute(id = 27, valueType = ValueType.VALUE)
    private Boolean receiveUtilityNotification;

    @Attribute(id = 28, clazz = Role.class)
    private Role role;

    @Attribute(id = 55, valueType = ValueType.VALUE)
    private String activationCode;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getReceiveUtilityNotification() {
        return receiveUtilityNotification;
    }

    public void setReceiveUtilityNotification(Boolean receiveUtilityNotification) {
        this.receiveUtilityNotification = receiveUtilityNotification;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
