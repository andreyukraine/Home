package test_project.test;

import test_project.model.MyDate;

import java.awt.*;

/**
 * Created by IT on 04.05.2016.
 */
public class Student extends Container {

    public int birthYear;
    public int birthMouth;
    public int birthDay;
    public int taskCount;
    public double paidMponey;
    private String name;
    private String phone = "none";
    private String email;
    private MyDate myDate = new MyDate();

    public String convertStudents() {

        String value = String.format("name %s, phone %s, city %s, street %s, payMoney %f ", name, phone, myDate.getCity(), myDate.getStreet(), paidMponey);
        return value;
    }


    public void init(String name, String phone, String city, String street, int paidMponey) {
        this.name = name;
        this.phone = phone;
        myDate.setCity(city);
        if (street == null) {
            street = "non";
        }
        myDate.setStreet(street);

        this.paidMponey = paidMponey;
    }
}
