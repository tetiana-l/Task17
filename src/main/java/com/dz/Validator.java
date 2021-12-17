package com.dz;

public class Validator {
        public void checkIfSalaryPositiveNumber(double salary) throws TooSmallSalaryException {

            if (salary < 0) {
                throw new TooSmallSalaryException("Incorrect salary ", salary);
            }
        }

        public void checkIfNameIsInCorrectFormat(String partOfName) throws ImpossibleNameException {
            if (partOfName == null) {
                throw new ImpossibleNameException("Name or surname is null", partOfName);
            }
            if (!partOfName.matches("[a-zA-Z]+")) {
                throw new ImpossibleNameException("Incorrect partOfName or surname", partOfName);
            }
        }
    }
