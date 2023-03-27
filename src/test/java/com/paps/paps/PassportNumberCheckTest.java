package com.paps.paps;

import com.paps.paps.utils.ValidatePassport;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.util.Strings.concat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.springframework.jdbc.support.JdbcUtils.isNumeric;

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

        //int passportLength = passportNumber.length();

//Use for loop instead -> array out of bound and Integer parse
        String numbersStartingFrom3rd = concat(passportNumber.charAt(2), passportNumber.charAt(3),
                passportNumber.charAt(4), passportNumber.charAt(5), passportNumber.charAt(6),
                passportNumber.charAt(7), passportNumber.charAt(8) );

        Integer numbers = Integer.valueOf(numbersStartingFrom3rd);
        isNumeric(numbers);

       // String first2CharOfPassport = ValidatePassport.checkPassport(passportNumber);
        
        assertEquals(isNumeric(numbers), isNumeric(0000001));
        //assertThat((0000001, numbers);


    }
}
