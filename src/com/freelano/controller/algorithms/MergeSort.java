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
 * Merge Sort Implementation for Sorting FreelanceModel by Age
 * 
 * @author Suyash Koirala
 */
public class MergeSort {

    public List<FreelanceModel> sortByAge(List<FreelanceModel> unsortedData, boolean isDesc) {
        // Base condition: if the list has one or zero elements, it's already sorted
        if (unsortedData.size() <= 1) {
            return unsortedData;
        }

        // Split the list into two halves
        int middle = unsortedData.size() / 2;
        List<FreelanceModel> leftList = new ArrayList<>(unsortedData.subList(0, middle));
        List<FreelanceModel> rightList = new ArrayList<>(unsortedData.subList(middle, unsortedData.size()));

        // Recursively sort each half
        leftList = sortByAge(leftList, isDesc);
        rightList = sortByAge(rightList, isDesc);

        // Merge the sorted halves
        return merge(leftList, rightList, isDesc);
    }

    private List<FreelanceModel> merge(List<FreelanceModel> leftList, List<FreelanceModel> rightList, boolean isDesc) {
        List<FreelanceModel> sortedList = new ArrayList<>();
        int leftIndex = 0, rightIndex = 0;

        // Merge two lists while comparing values
        while (leftIndex < leftList.size() && rightIndex < rightList.size()) {
            if (isDesc) {
                // Descending order
                if (leftList.get(leftIndex).getAge() >= rightList.get(rightIndex).getAge()) {
                    sortedList.add(leftList.get(leftIndex));
                    leftIndex++;
                } else {
                    sortedList.add(rightList.get(rightIndex));
                    rightIndex++;
                }
            } else {
                // Ascending order
                if (leftList.get(leftIndex).getAge() <= rightList.get(rightIndex).getAge()) {
                    sortedList.add(leftList.get(leftIndex));
                    leftIndex++;
                } else {
                    sortedList.add(rightList.get(rightIndex));
                    rightIndex++;
                }
            }
        }

        // Add remaining elements from the left list
        while (leftIndex < leftList.size()) {
            sortedList.add(leftList.get(leftIndex));
            leftIndex++;
        }

        // Add remaining elements from the right list
        while (rightIndex < rightList.size()) {
            sortedList.add(rightList.get(rightIndex));
            rightIndex++;
        }

        return sortedList;
    }
}
