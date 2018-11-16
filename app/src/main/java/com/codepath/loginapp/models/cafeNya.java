package com.codepath.loginapp.models;

public class cafeNya {
    private String DRINKS, DESC;

    //default constructor
    public cafeNya() {
    }

    public cafeNya(String DRINKS, String DESC) {
        this.DRINKS = DRINKS;
        this.DESC = DESC;
    }

    public void setDRINKS(String DRINKS) {
        this.DRINKS = DRINKS;
    }
    public String getDRINKS() {
        return DRINKS;
    }
    public String getDESC() {
        return DESC;
    }

    public void setDESC(String DESC) {
        this.DESC = DESC;
    }
}
