package ua.azbest;

import org.junit.Assert;

public class Main {

    public static void main(String[] args) {
        System.out.println("Your name and surname to console");
        System.out.println("Just kidding");
        System.out.println("Yuri");

        Assert.fail("\nApplication crushed. But still calm, that's planed operation");
    }

}