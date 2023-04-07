package com.simformsolutions.encapsulation;

public class Company {

    private String name;
    private int profit;

    private int noOfEmploy;

    private String companyLevel;

    private boolean isProfitable;

    public int getNoOfEmploy() {

        return noOfEmploy;
    }

    public void setNoOfEmploy(int noOfEmploy) {
        if (noOfEmploy > 0) {
            this.noOfEmploy = noOfEmploy;
            setCompanyLevel();
        }

    }

    public int getProfit() {
        return this.profit;
    }

    public void setProfit(int profit) {
        this.isProfitable = profit > 0;
        this.profit = profit;
    }

    public String getCompanyLevel() {
        return this.companyLevel;
    }


    private void setCompanyLevel() {
        if (noOfEmploy > 0 && noOfEmploy <= 100) {
            this.companyLevel = "Small Size Firm";
        } else if (noOfEmploy > 100 && noOfEmploy <= 200) {
            this.companyLevel = "Mid Size Firm";
        } else if (noOfEmploy > 200 && noOfEmploy <= 600) {
            this.companyLevel = "Large Size Firm";
        } else {
            this.companyLevel = "MNC Company ";
        }
    }

    public boolean isProfitable() {
        return isProfitable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

