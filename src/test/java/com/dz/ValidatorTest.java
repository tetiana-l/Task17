package com.dz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {


    @Test
    public void shouldNotThrowExceptionIfSalaryPositive() {
        Main.createEmployee("Anna", "Foe", 45550);
        Assertions.assertFalse(Main.exeStatus);
    }

    @Test
    public void shouldTrowExceptionIfSalaryNegative() {
        Main.createEmployee("Anna", "Foe", -45550);
        Assertions.assertTrue(Main.exeStatus);
    }

    @Test
    public void shouldNotTrowExIfNameEnglish() {
        Main.createEmployee("Anna", "Foe", 45550);
        Assertions.assertFalse(Main.exeStatus);
    }

    @Test
    public void shouldTrowExIfNameNotEnglish() {
        Main.createEmployee("Anna", "Вир", 45550);
        Assertions.assertTrue(Main.exeStatus);
    }

    @Test
    public void shouldTrowExIfNameEmptyString() {
        Main.createEmployee("Anna", "", 45550);
        Assertions.assertTrue(Main.exeStatus);

    }

    @Test
    public void shouldTrowExIfNameNull() {
        Main.createEmployee(null, null, 4550);
        Assertions.assertTrue(Main.exeStatus);
    }
}
