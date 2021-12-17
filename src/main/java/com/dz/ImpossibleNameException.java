package com.dz;

public class ImpossibleNameException extends Exception {

    private final String partOfName;

    public ImpossibleNameException(String errorMessage, String name) {
        super(errorMessage);
        this.partOfName = name;
    }

    public String getPartOfName() {
        return partOfName;
    }
}
