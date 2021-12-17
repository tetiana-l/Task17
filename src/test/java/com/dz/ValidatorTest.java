package com.dz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {


    @Test
    public void shouldNotThrowExceptionIfSalaryPositive() {
        Assertions.assertDoesNotThrow(() -> Main.createEmployee("Anna", "Foe", 45550));
    }

    @Test
    public void shouldTrowExceptionIfSalaryNegative() {
        Assertions.assertThrows(TooSmallSalaryException.class, () -> Main.createEmployee("Anna", "Foe", -45550));
    }

    @Test
    public void shouldNotTrowExIfNameEnglish() {
        Assertions.assertDoesNotThrow(() -> Main.createEmployee("Anna", "Foe", 45550));
    }

    @Test
    public void shouldTrowExIfNameNotEnglish() {
        Assertions.assertThrows(ImpossibleNameException.class, () -> Main.createEmployee("Anna", "Вир", 45550));
    }

    @Test
    public void shouldTrowExIfNameEmptyString() {
        Assertions.assertThrows(ImpossibleNameException.class, () -> Main.createEmployee("Anna", "", 45550));

    }

    @Test
    public void shouldTrowExIfNameNull() {
        Assertions.assertThrows(ImpossibleNameException.class, () -> Main.createEmployee(null, null, 45550));
    }
}
