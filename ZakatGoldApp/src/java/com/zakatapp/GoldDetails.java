package com.zakatapp;

public class GoldDetails {
    private double weight;
    private String type;
    private double pricePerGram;

    public GoldDetails(double weight, String type, double pricePerGram) {
        this.weight = weight;
        this.type = type;
        this.pricePerGram = pricePerGram;
    }

    // Accessors (getters)
    public double getWeight() { return weight; }
    public String getType() { return type; }
    public double getPricePerGram() { return pricePerGram; }

    // Mutators (setters)
    public void setWeight(double weight) { this.weight = weight; }
    public void setType(String type) { this.type = type; }
    public void setPricePerGram(double pricePerGram) { this.pricePerGram = pricePerGram; }

    // Printer
    public String toString() {
        return "Weight: " + weight + "g, Type: " + type + ", Price per gram: RM" + pricePerGram;
    }
}
