package OOP.Final;

public final class T_Shirt extends Shirt{

    public T_Shirt() {
            super(11.99, "M");
    }
    //public boolean isCotton(){
       // System.out.println("T-Shirt is cotton");
      //  return true;
    //} you cannot override final method from parent in the child
//}
public void discount(double percent) {
    System.out.println("You are getting discount for t-shirt: " + percent);
}
}
