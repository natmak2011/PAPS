package com.paps.paps.utils;


import org.apache.logging.log4j.util.Strings;

public class ValidatePassport {


    public static String checkPassport(String passportNumber) {


        return Strings.concat(String.valueOf(passportNumber.charAt(0)), String.valueOf(passportNumber.charAt(1)));


    }

    public static Integer  checkNullandLength(String passportNumber) {

        Integer result= 10000;
        if (passportNumber.isBlank()) {
            result = null;
        } else  {

            result = passportNumber.length();

        }
        return result;

    }


    public static boolean checkDigits(String passportNumber) {

        //String passportNumber = "EP0000001";

        int passportLength = passportNumber.length();
        int count = 0;


        for (int i = 2; i < passportNumber.length(); i++) {


            if (passportNumber.charAt(i) >= '0' && passportNumber.charAt(i) <= '9'){

                count++;

            }


        }

       return (7 == count);
    }
}



