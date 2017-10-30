/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.food;

import java.awt.Component;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author justin
 */
public class FoodList implements Serializable {

    private final ArrayList<Food> theFoodList;
    private Component frame;

    /**
     * The default constructor
     */
    public FoodList() {
        theFoodList = new ArrayList<>();
    }

    /**
     * Add a food to the FoodList
     *
     * @param theFoodToAdd The food to add
     */
    public void addFood(Food theFoodToAdd) {
        theFoodList.add(theFoodToAdd);
        JOptionPane.showMessageDialog(frame,
    "Food Successfully Added!");
    }

    /**
     * Remove a food from the FoodList by index
     *
     * @param index The index of the food to remove.
     */
    public void removeFood(int index) {
        theFoodList.remove(index);
    }

    /**
     * Remove a food from the FoodList by object
     *
     * @param theFoodToRemove The food object to remove.
     */
    public void removeFood(Food theFoodToRemove) {
        theFoodList.remove(theFoodToRemove);
    }

    /**
     * Returns the food at a given index
     * 
     * @param index The index to return
     * @return The food at the given index
     */
    public Food get(int index) {
        return theFoodList.get(index);
    }
}
