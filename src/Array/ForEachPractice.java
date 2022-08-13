package Array;

import java.util.Arrays;
import java.util.Locale;

public class ForEachPractice {
    public static void main(String[] args) {
        String[] color = {"Red", "blue", "black", "white", "Pink", "Violet", "green", "yellow", "BROWN"};
  for( String colo : color ){
      System.out.println(colo);
      System.out.println(colo.toUpperCase());
  }
        System.out.println(Arrays.toString(color));

  double[] payChecks = {250, 350, 450, 567, 99, 10.99};
  double balance = 0;
  for(double pay : payChecks){
      balance += pay;
      System.out.println(balance);}
        System.out.println(balance);


      }

  }

