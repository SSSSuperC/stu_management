package com.test.entity;

public class Operators
{
    private String AID;
    private String Admin_name;
    private int Admin_privilege;

    public Operators() {
    }

    public Operators(String AID, String admin_name, int admin_privilege) {
        this.AID = AID;
        Admin_name = admin_name;
        Admin_privilege = admin_privilege;
    }

    public String getAID() {
        return AID;
    }

    public void setAID(String AID) {
        this.AID = AID;
    }

    public String getAdmin_name() {
        return Admin_name;
    }

    public void setAdmin_name(String admin_name) {
        Admin_name = admin_name;
    }

    public int getAdmin_privilege() {
        return Admin_privilege;
    }

    public void setAdmin_privilege(int admin_privilege) {
        Admin_privilege = admin_privilege;
    }

    @Override
    public String toString() {
        return "Operators{" +
                "AID='" + AID + '\'' +
                ", Admin_name='" + Admin_name + '\'' +
                ", Admin_privilege=" + Admin_privilege +
                '}';
    }
}
