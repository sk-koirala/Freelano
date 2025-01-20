/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.freelano.controller.algorithms;

/**
 *
 * 
 */
import java.util.ArrayList;
import java.util.List;
import com.freelano.model.FreelanceModel;

/**
 * Selection Sort Implementation for Sorting FreelanceModel by Freelance ID
 * 
 * @author Suyash Koirala
 */
public class SelectionSort {

    public List<FreelanceModel> sortByFreelanceID(List<FreelanceModel> unsortedData, boolean isDesc) {
        List<FreelanceModel> dataToSort = new ArrayList<>(unsortedData); // Copy input data

        for (int i = 0; i < dataToSort.size() - 1; i++) {
            int minIndex = i;

            // Find the smallest or largest element in the remaining list
            for (int j = i + 1; j < dataToSort.size(); j++) {
                if (isDesc) {
                    // Descending order
                    if (dataToSort.get(j).getFreelanceID() > dataToSort.get(minIndex).getFreelanceID()) {
                        minIndex = j;
                    }
                } else {
                    // Ascending order
                    if (dataToSort.get(j).getFreelanceID() < dataToSort.get(minIndex).getFreelanceID()) {
                        minIndex = j;
                    }
                }
            }

            // Swap the found element with the current element
            FreelanceModel temp = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, temp);
        }

        return dataToSort;
    }
}
