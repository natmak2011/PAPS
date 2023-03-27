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


}
