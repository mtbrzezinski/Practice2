package Array;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] zipCodes = {23, 45, 12, 55, 100, 690, 888, 33, 55};
        int biggest = zipCodes[0];
        for(int i = 0 ; i < zipCodes.length; i++){
            if(biggest < zipCodes[i]){
                biggest = zipCodes[i];
            }
        }
        System.out.println(biggest);
    }
}
