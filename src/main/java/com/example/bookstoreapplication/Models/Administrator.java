package com.example.bookstoreapplication.Models;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.InputMismatchException;

public class Administrator extends Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 12345678;
    private int salary;
    public Administrator(){
        super();
    }
    public Administrator(String name, String surname, Date date) {
        super(name, surname, date, role.ADMINISTRATOR);
    }

    public Administrator(String name, String surname, Date date, String phoneNumber, String email) {
        super(name, surname, date, role.ADMINISTRATOR);
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
    }




    //getters
    @Override
    public String getPassword() {
        return super.password;
    }
    @Override
    public String getUserName() {
        return super.userName;
    }

    @Override
    public String getEmail() {
        return super.email;
    }
    @Override
    public String getPhoneNumber() {
        return super.phoneNumber;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public String getSurname() {
        return super.surname;
    }

    @Override
    public Date getBirthDate() {
        return super.birthDate;
    }

    @Override
    public int getAccessLevel() {
        return super.accessLevel;
    }

    //setters
    @Override
    public void setEmail(String email) throws InputMismatchException {
        try {                            //if the number entered matches the albanian number tamplate
            if (email.matches("\\w*@\\w*.com"))
                super.email = email;
            else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException ex) {
            System.out.print("Invalid Email Address");
        }
    }

    @Override
    public void setPhoneNumber(String number) throws InputMismatchException {
        try {                            //if the number entered matches the albanian number tamplate
            if (number.matches("\\+355\\s6[7-9]\\s\\d{2}\\s\\d{2}\\s\\d{3}"))
                super.phoneNumber = number;
            else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException ex) {
            System.out.print("Invalid Phone Number");
        }
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public void setSurname(String surname) {
        super.surname = surname;
    }

    @Override
    public void setBirthDate(Date birthDate) {
        super.birthDate = birthDate;
    }

    @Override
    public void setUserName(String userName) {
        super.userName = userName;
    }

    @Override
    public void setPassword(String password) {
        super.password = password;
    }
}

