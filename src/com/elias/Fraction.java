package com.elias;

/**
 * Fraction class
 * date: 06/12/2024
 * @author Elias Khatoun
 */

public class Fraction {

    /**
     * Instance variables
     */
    private int numerator, denominator;


    /**
     * Default constructor
     */
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }


    /**
     * Overloaded constructor (Takes both numerator and denominator)
     * @param numerator Numerator value of the fraction
     * @param denominator Denominator value of the fraction
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    /**
     * Overloaded constructor (Takes only numerator)
     * @param numerator Numerator value of the fraction
     */
    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }


    /**
     * toString method to represent the fraction as a string
     * @return String representation of the fraction
     */
    public String toString() {
        if (denominator == 1) {
            return numerator+"";
        }
        return numerator + " / " + denominator;
    }


    /**
     * Main Method
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Creating an object of the Fraction class
        Fraction fraction = new Fraction();
        System.out.println("Fraction with no inputsL: " + fraction.toString());

        // Creating an object of the Fraction class with numerator and denominator inputted
        Fraction fraction2 = new Fraction(5, 2);
        System.out.println("Fraction with numerator and denominator: " + fraction2.toString());

        // Creating an object of the Fraction class with only numerator inputted
        Fraction fraction3 = new Fraction(5);
        System.out.println("Fraction with only numerator: " + fraction3.toString());

    }
}
