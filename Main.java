package com.company;

public class Main {

    public static void main(String[] args) {
	   Wine wine = new Wine("Vino1 ","57555555",100,0.7);
       Chocolate chocolate = new Chocolate("Cokolada1 ","547885555",100,125.5);

        System.out.println(wine);
        System.out.println(chocolate);

        System.out.println(chocolate.calculatePriceWithTax());
        System.out.println(wine.calculatePriceWithTax());
