package com.potluck_manager.model;


public class Item {
    private String name;
    private String category;
    private String amount;
    private String claimed_by;
    private int potluck_id;

    public Item(String name, String category, String amount, String claimed_by, int potluck_id) {
        this.name = name;
        this.category = category;
        this.amount = amount;
        this.claimed_by = claimed_by;
        this.potluck_id = potluck_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getClaimed_by() {
        return claimed_by;
    }

    public void setClaimed_by(String claimed_by) {
        this.claimed_by = claimed_by;
    }

    public int getPotluck_id() {
        return potluck_id;
    }

    public void setPotluck_id(int potluck_id) {
        this.potluck_id = potluck_id;
    }
}





