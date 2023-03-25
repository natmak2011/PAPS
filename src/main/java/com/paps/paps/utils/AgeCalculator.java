package com.paps.paps.utils;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {


    public static Integer calculateDifference(LocalDate dateOfBirth, LocalDate currentDate) {
        if (dateOfBirth == null || currentDate == null) {
            return null;
        }

        return  Period.between(dateOfBirth, currentDate).getYears();

    }
}
