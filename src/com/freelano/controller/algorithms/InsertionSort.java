/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.freelano.controller.algorithms;

/**
 *
 * @author Suyash Koirala
 */
import java.util.ArrayList;
import java.util.List;
import com.freelano.model.FreelanceModel;

/**
 * Insertion Sort Implementation for Sorting FreelanceModel by Expertise
 * 
 * @author Suyash Koirala
 */
public class InsertionSort {

    public List<FreelanceModel> sortByExpertise(List<FreelanceModel> unsortedData, boolean isDesc) {
        List<FreelanceModel> dataToSort = new ArrayList<>(unsortedData); // Copy input data

        for (int i = 1; i < dataToSort.size(); i++) {
            FreelanceModel currentFreelancer = dataToSort.get(i);
            int j = i - 1;

            // Compare expertise strings (case-insensitive)
            while (j >= 0 && (isDesc
                    ? currentFreelancer.getExpertise().compareToIgnoreCase(dataToSort.get(j).getExpertise()) > 0
                    : currentFreelancer.getExpertise().compareToIgnoreCase(dataToSort.get(j).getExpertise()) < 0)) {
                dataToSort.set(j + 1, dataToSort.get(j));
                j--;
            }

            // Place the current element at its correct position
            dataToSort.set(j + 1, currentFreelancer);
        }

        return dataToSort;
    }
}
