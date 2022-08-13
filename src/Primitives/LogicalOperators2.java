package Primitives;

public class LogicalOperators2 {
    public static void main(String[] args) {
        /* you want to buy a new laptop is cost $1200
        you can pay is as cash or credit card
        if you have enough cash or enough available credit limit in cc
        you can take the laptop home
         */

        int laptopCost = 1200;
        int cash = 1300;
        int cc = 1450;

        boolean buy = cash > laptopCost || cc > laptopCost;
        System.out.println(buy);

        int cash1 = 1000;
        int cc2 = 4500;

        boolean buy1 = cash1 > laptopCost || cc2 > laptopCost;
        System.out.println(buy1);

        int cash2 = 1000;
        int cc3 = 450;

        boolean buy2 = cash2 > laptopCost || cc3 > laptopCost;
        System.out.println(buy2);

        boolean buy3 = (cash2 + cc3) > laptopCost || cash2 > laptopCost || cc3 > laptopCost ;
        System.out.println(buy3);


    }
}
