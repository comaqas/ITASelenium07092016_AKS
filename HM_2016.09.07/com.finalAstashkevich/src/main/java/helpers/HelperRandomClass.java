package helpers;

import org.apache.commons.lang3.RandomStringUtils;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Random;

/**
 * Created by Christina on 04.09.2016.
 * Class stores methods to generate random data
 */

public class HelperRandomClass {
    public static String getRandomString(){
        //return UUID.randomUUID().toString().replaceAll("-", "").substring(15);
        String result = RandomStringUtils.randomAlphabetic(14);
        return result;
    }

    public static String getRandomEmail(){
        return getRandomString()+"@gmail.com";
    }

    public static String getPassword(){
        return "P"+getRandomString();
    }

    public static String getAddress(){
        return getRandomString()+"7";
    }

    public static String getFirstName(){
        return getRandomString().substring(5);
    }

    public static String getLastName(){
        return getRandomString().substring(7);
    }

    public static String getRandFebDay() {
        int minDay = 1;
        int maxDay = 28;
        int randomValue = minDay + (int)(Math.random() * ((maxDay - minDay) + 1));
        String randomDay = String.valueOf(randomValue);
        return randomDay;
    }

    public static String getRandMonth() {

        ArrayList<String> month = new ArrayList<String>();

        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");

        String aMonth = month.get(0);
        Random rand = new Random();

        String ranMonth = month.get(rand.nextInt(month.size()));

        return ranMonth;
    }

//    public void getRandMonth(String month) {
//        Random random = new Random();
//        // Массив из месяцев
//        String months[] = {"January","February","March","April","May","June","July",
//                "August","September","October","November","December"};
//        String pos = random.nextInt(month.size());
//    }


    }

