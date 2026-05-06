package com.pluralsight;

public class NameFormatter {
    private String prefix;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

    private NameFormatter(){}

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        String fullName;
        if (prefix.isBlank() && suffix.isBlank() && middleName.isBlank()){
            fullName = firstName + " " + lastName;
        } else if (middleName.isBlank() && prefix.isBlank()) {
            fullName = firstName + " " + lastName + " " + suffix;
        } else if(suffix.isBlank() && prefix.isBlank()) {
            fullName = firstName + " " + middleName + " " + lastName;
        } else {
            fullName = prefix + " " + firstName + " " + middleName + " " + lastName + ", " + suffix;
        }
        return fullName;
    }

    public static String format(String fullName){

    }
}

