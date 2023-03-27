package com.paps.paps;

import com.paps.paps.utils.AgeCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AgeCalculatorTest {

    @Test
    void shouldReturnDateDifferenceBetweenDateOfBirthAndCurrentDate(){


        LocalDate dateOfBirth = LocalDate.of(2000, 1, 1);
        LocalDate currentDate = LocalDate.of(2023, 3, 25);

        //AgeCalculator ageCalculator = new AgeCalculator();
        Integer ageDifference = AgeCalculator.calculateDifference(dateOfBirth, currentDate);

        assertEquals(23, ageDifference);

    }

    @Test
    void shouldReturnIfDateOfBirthIsNull(){

        //assertTrue (0 > 6);
        LocalDate dateOfBirth = null;
        LocalDate currentDate = LocalDate.of(2023, 3, 25);

        //AgeCalculator ageCalculator = new AgeCalculator();
        Integer ageDifference = AgeCalculator.calculateDifference(dateOfBirth, currentDate);

        assertNull(ageDifference);

    }

    @Test
    void shouldReturnIfCurrentDateIsNull(){

        //assertTrue (0 > 6);
        LocalDate dateOfBirth = LocalDate.of(2000, 1, 1);
        LocalDate currentDate = null;
        //AgeCalculator ageCalculator = new AgeCalculator();
        Integer ageDifference = AgeCalculator.calculateDifference(dateOfBirth, currentDate);

        assertNull(ageDifference);

    }


}
