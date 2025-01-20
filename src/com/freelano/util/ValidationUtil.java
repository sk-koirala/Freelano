/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.freelano.util;

/**
 *
 * @author Suyash Koirala
 */
import java.util.regex.Pattern;

public class ValidationUtil {

    // Regular expression patterns
    private static final Pattern FREELANCER_ID_PATTERN = Pattern.compile("^\\d{7}$"); // 7 digits
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$", Pattern.CASE_INSENSITIVE); // Alphabets and spaces
    private static final Pattern EXPERTISE_PATTERN = Pattern.compile("^[a-zA-Z]+(\\s[a-zA-Z]+)*$", Pattern.CASE_INSENSITIVE); // Alphabets with optional spaces
    private static final Pattern PROJECT_PATTERN = Pattern.compile("^[\\w\\s.,\\-_]+$", Pattern.CASE_INSENSITIVE); // Alphanumeric, punctuation
    private static final Pattern ADDRESS_PATTERN = Pattern.compile("^[\\w\\s.,#\\-\\/]+$", Pattern.CASE_INSENSITIVE); // Alphanumeric, punctuation, special characters

    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the freelancer ID is exactly 7 digits.
     *
     * @param freelancerId the freelancer ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidFreelancerId(int freelancerId) {
        String idStr = String.valueOf(freelancerId);
        return FREELANCER_ID_PATTERN.matcher(idStr).matches();
    }

    /**
     * Validates if the name contains only alphabets and spaces.
     *
     * @param name the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }

    /**
     * Validates if the expertise contains only alphabets and optional spaces.
     *
     * @param expertise the expertise to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidExpertise(String expertise) {
        return !isNullOrEmpty(expertise) && EXPERTISE_PATTERN.matcher(expertise).matches();
    }

    /**
     * Validates if the age is between 18 and 70 (inclusive).
     *
     * @param age the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAge(short age) {
        return age >= 18 && age <= 70;
    }

    /**
     * Validates if the project name is not empty and contains valid characters.
     *
     * @param project the project name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidProject(String project) {
        return !isNullOrEmpty(project) && PROJECT_PATTERN.matcher(project).matches();
    }

    /**
     * Validates if the address is not empty and contains valid characters.
     *
     * @param address the address to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAddress(String address) {
        return !isNullOrEmpty(address) && ADDRESS_PATTERN.matcher(address).matches();
    }

    /**
     * Validates all fields together and returns the validation result.
     *
     * @param freelancerId Freelancer ID
     * @param name         Full Name
     * @param expertise    Expertise
     * @param age          Age
     * @param project      Project
     * @param address      Address
     * @return true if all fields are valid, otherwise false
     */
    public static boolean validateAllFields(int freelancerId, String name, String expertise, short age, String project, String address) {
        return isValidFreelancerId(freelancerId) &&
               isValidName(name) &&
               isValidExpertise(expertise) &&
               isValidAge(age) &&
               isValidProject(project) &&
               isValidAddress(address);
    }
}


