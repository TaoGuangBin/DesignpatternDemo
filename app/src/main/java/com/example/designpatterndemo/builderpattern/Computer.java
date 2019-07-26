package com.example.designpatterndemo.builderpattern;

public class Computer {
    private String name;
    private String color;
    private float price;
    private String os;

    public static class Builder {
        Computer computer;

        public Builder() {
            computer = new Computer();
        }

        public Builder name(String name) {
            computer.setName(name);
            return this;
        }

        public Builder color(String color) {
            computer.setColor(color);
            return this;
        }

        public Builder os(String os) {
            computer.setOs(os);
            return this;
        }

        public Builder price(float price) {
            computer.setPrice(price);
            return this;
        }

        public Computer build() {
            return computer;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", os='" + os + '\'' +
                '}';
    }
}
