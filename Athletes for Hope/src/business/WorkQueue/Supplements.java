/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

/**
 *
 * @author Puranjai
 */
public class Supplements {
     private String supplement;
    private int amount;

    public Supplements(String sup, int qty) {
        this.supplement = sup;
        this.amount = qty;
    }
    
    

    public String getSupplement() {
        return supplement;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
    
    @Override
    public String toString() {
        return this.getSupplement();
    }
    
}
