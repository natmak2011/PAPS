package com.paps.paps;

import com.paps.paps.utils.ValidatePassport;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.util.Strings.concat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest

public class PassportNumberCheckTest {

    @Test
    void shouldReturnTheFirstTwoCharactersOfThePassport() {

        String passportNumber = "EP0000001";

        int passportLength = passportNumber.length();
        String firsttwoCharacters = concat(passportNumber.charAt(0), passportNumber.charAt(1));

        String first2CharOfPassport = ValidatePassport.checkPassport(passportNumber);

        //assertEquals(9, passportLength);
        assertEquals("EP", firsttwoCharacters);


    }

    @Test
    void shouldReturnIfPassportNumberIsNull() {

        String passportNumber = null;

        assertNull(passportNumber);

    }

    @Test
    void shouldReturnPassportNumberLengthNine() {

        String passportNumber = "EP0000001";

        int passportLength = passportNumber.length();

        String first2CharOfPassport = ValidatePassport.checkPassport(passportNumber);

        assertEquals(9, passportLength);

    }

    @Test
    void shouldReturnNumbersAfterTheFirstTwoCharacters() {

        String passportNumber = "EP0000001";
        //String [] numbers = new String [];


        int passportLength = passportNumber.length();
        int count = 0;

        //String s = passportNumber.substring(2, passportLength - 1);

        //assertEquals(9, passportLength);


        for (int i = 2; i < passportNumber.length(); i++) {


               // if ((isNumeric(Integer.parseInt(String.valueOf(passportNumber.charAt(i)))))) {
            //if (!isLetter(passportNumber.charAt(i))) {

            if (passportNumber.charAt(i) >= '0' && passportNumber.charAt(i) <= '9'){

                    count++;


                }

                //assertEquals(2, count);




        }

        assertEquals(7, count);
    }
}






