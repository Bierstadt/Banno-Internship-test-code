import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BanoBootCamp {
// method to find out how many png files, number of "financial institution" appears, and the twitter handle for Bano

    public static String getBanoStats(String input) {

        input = input.toLowerCase();
        String twitterHandle = " ";
        int pngCounter = 0;
        int financialCounter = 0;
        String png = ".png";
        String financial = "financial institution";
        List<String> listOfStrings = new ArrayList<>(Arrays.asList(input.split(" ")));
        // loop to count the number of .png files
        System.out.println(listOfStrings);
        for(String element:listOfStrings) {
            if (element.contains(png)) {
                pngCounter++;
            }
            // to find twitter handle
            if(element.contains("twitter")) {
                twitterHandle = element;
            }
        }
// to find the times financial institution appears
        String temp = input;
        int index = 0;
        while(index >= 0) {

            index = temp.indexOf(financial);
            if(index>=0) {
                financialCounter++;
                temp = temp.substring(index + financial.length());
            }
        }



        return "Number of .png files: " + pngCounter + "\n" + "Number of 'financial institution' phrases: " + financialCounter +
                "\n" + "Twitter handle: " + twitterHandle;
    }
// tester
    public static void main(String[] args) {
        String test = "hello.png myname is lkjdf twitter1343453434 help!.png what? financial institution financial institution sun.png cloud.png "+
                "twitter.com/4434534543543 financial institution five six";
        System.out.println(getBanoStats(test));
}}
