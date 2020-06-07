/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctrl;

/**
 *
 * @author Mayura Lakshan
 */
public class itemBean {
    double qty;
    double price;
    double Totalprice;
    int itemId;

    public itemBean(double qty, double price, double Totalprice, int itemId) {
        this.qty = qty;
        this.price = price;
        this.Totalprice = Totalprice;
        this.itemId = itemId;
    }

    public itemBean() {
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalprice() {
        return Totalprice;
    }

    public void setTotalprice(double Totalprice) {
        this.Totalprice = Totalprice;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    
    
}
