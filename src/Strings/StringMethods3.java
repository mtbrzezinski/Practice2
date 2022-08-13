package Strings;

public class StringMethods3 {
    public static void main(String[] args) {
        String device = "microphone";
        System.out.println(device.equals("microphone"));
        System.out.println(device.equals("MICROPHONE"));
        System.out.println(device.equals("Screen"));
        System.out.println(device.equals(""));


        System.out.println(device.equalsIgnoreCase("microphone"));
        System.out.println(device.equalsIgnoreCase("MICROPHONE"));
        System.out.println(device.equalsIgnoreCase("MiCROphonE"));
        System.out.println(device.equalsIgnoreCase(""));
    }
}
