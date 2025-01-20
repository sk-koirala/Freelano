/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.freelano.controller.algorithms;

import java.util.List;
import com.freelano.model.FreelanceModel;

/**
 * Binary Search Algorithm for searching a freelancer by full name.
 * 
 * @author Suyash Koirala
 */
public class BinarySearch {

    /**
     * Searches for a FreelanceModel object by full name using binary search.
     * 
     * @param searchValue   the full name to search for
     * @param freelancerList the sorted list of FreelanceModel objects
     * @param left          the left index of the search range
     * @param right         the right index of the search range
     * @return the FreelanceModel object if found, otherwise null
     */
    public FreelanceModel searchByFullName(String searchValue, List<FreelanceModel> freelancerList, int left, int right) {
        // Handle null or empty input
        if (freelancerList == null || freelancerList.isEmpty() || searchValue == null) {
            return null;
        }

        // Base Case: If the range is invalid
        if (right < left) {
            return null;
        }

        // Calculate the middle index (avoiding overflow)
        int mid = left + (right - left) / 2;

        // Get the full name of the freelancer at mid
        String midFullName = freelancerList.get(mid).getName();

        // Compare the search value with the mid value (case-insensitive)
        int comparisonResult = searchValue.compareToIgnoreCase(midFullName);

        if (comparisonResult == 0) {
            // Found the freelancer
            return freelancerList.get(mid);
        } else if (comparisonResult < 0) {
            // Search in the left half
            return searchByFullName(searchValue, freelancerList, left, mid - 1);
        } else {
            // Search in the right half
            return searchByFullName(searchValue, freelancerList, mid + 1, right);
        }
    }
}


