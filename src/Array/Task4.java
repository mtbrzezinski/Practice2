package Array;

public class Task4 {
    public static void main(String[] args) {
        String date = "3.19.2025";

        String[] data = date.split("\\.");


        if(data[0].equals("3") || data[0].equals("03") && data[1].equals("14")){;
            System.out.println("It is correct day");


        }else{
                System.out.println("Data is not matching");
            }
        }
    }
