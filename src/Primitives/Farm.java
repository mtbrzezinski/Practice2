package Primitives;

public class Farm {

    public static void main(String[] args) {
        /* 1 - calculate number of legs in the farm if:
        there are 23 cows and 13 chickens at this farm
        show total number of legs as final result
         */

        int cows = 23;
        int chicken = 13;

        int cowsLegs = 4;
        int chickenLegs = 2;

        int cowsLegsTotal = cows * cowsLegs;
        int chickenLegsTotal = chicken * chickenLegs;

        int totalLegs = cowsLegsTotal + chickenLegsTotal;

        System.out.println("Total number of the legs in this farm is: " + totalLegs  );


        /* calculate the cost of this animals in this farm if:
        each cow cost 1200$ and each chicken cost 15$
         */

        double cowsCost = 1200;
        double chickenCost = 15.99;

        double cowCostTotal = cowsCost * cows;
        double chickenCostTotal = chickenCost * chicken;

        double totalCost = cowCostTotal + chickenCostTotal;

        System.out.println("Total cost of animals is $: " + totalCost);


    }
}
