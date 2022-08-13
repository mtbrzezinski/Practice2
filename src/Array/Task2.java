package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] ids = {22,33,44,55,1,6,8,100,300,55};
        for (int k = 0; k<ids.length-1; k++ ){
            if(ids[k]<30){
                System.out.println(ids[k]);

                Object[] item = {"Text", 22, 33, '7', true, false, ids};
                System.out.println(Arrays.toString(item));
                System.out.println(Arrays.deepToString(item));
               // System.out.println("===================");
               // for (int i = 0; i < item.length ;  i++){
                  //  for (int l = 0 ; l< ids.length ; l++){
                      //  System.out.println(ids[l]);

                 //   }break;
                //}
            }
        }
    }
}
