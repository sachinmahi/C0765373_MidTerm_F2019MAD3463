package com.lambton;

public class LambtonStringTools {
    public static void main(String[] args) {

    }

    public String reverse(String string) {
        StringBuilder rev = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            rev.append(string.charAt(i));
        }
        return rev.toString();
    }

    public int binaryToDecimal(String binary) {
        int decimal = 0;
        int binaryMultiplier = 1;
        for (char r : reverse(binary).toCharArray()) {
            if (r == '1') {
                decimal += binaryMultiplier;
            } else if (r == '0') {
            } else {
                return -1;
            }
            binaryMultiplier *= 2;
        }
        return decimal;
    }

    public String initials(String fullName) {
        fullName = fullName.toUpperCase();
        String names[] = fullName.split(" ");
        if (names.length == 2) {
            return null;
        } else {
            String initials = " ";
            for (int i = 0; i < names.length - 1; i++) {
                initials += names[i].toUpperCase().charAt(0) + ". ";
            }
            initials += titleCase(names[names.length - 1]);
            return initials;
        }
    }

    private String titleCase(String name) {
        name = name.toLowerCase();
        String titleCaseName = "";
        titleCaseName += Character.toString(name.charAt(0)).toUpperCase();
        titleCaseName += name.substring(1);
        return titleCaseName;
    }
}