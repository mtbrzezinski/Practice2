package Set;



import java.util.HashSet;
import java.util.Iterator;

public class Practice1 {
    public static void main(String[] args) {
        HashSet<String> days = new HashSet();
        days.add("Monday");
       days.add("Tuesday");
        days.add("Wednesday");
       days.add("Thursday");
        days.add("Friday");
        System.out.println(days);


        for(String day: days){
            System.out.println(day);

        }
        //days.add(null);
        System.out.println(days);
        days.add("Monday");
        System.out.println(days);
       // days.add(null);
        System.out.println(days);
        days.add("MONDAY");
        System.out.println(days);



        System.out.println(days.size());
       // Iterator iterator = days.iterator();

     //  while (iterator.hasNext()){
         //  System.out.println(iterator.next());
           // if(iterator.next().equals("Tuesday")){
                //interator.remove();
           // }
         // System.out.println(days);

    //   }
         Boolean b1 = days.contains("Sunday");
        boolean b2 = days.isEmpty();
        days.remove("Monday");
        System.out.println(days);
        days.remove(4);
        System.out.println(days);
        Object s = days.clone();
        System.out.println(s);
        System.out.println(days);
      days.removeIf(x-> x.equalsIgnoreCase("Monday"));
     System.out.println(days);



        days.clear();
        System.out.println(b1);
        System.out.println(b1);
        System.out.println(days);
        System.out.println(days.isEmpty());
    }
}
