package pojos;
// Generated Jun 3, 2020 2:21:40 PM by Hibernate Tools 4.3.1



/**
 * SaveWadiItems generated by hbm2java
 */
public class SaveWadiItems  implements java.io.Serializable {


     private Integer saveWadiItemsId;
     private Item item;
     private SaveWadi saveWadi;
     private Integer qty;
     private Double commissionPerItem;
     private Double totalCommission;
     private Integer rate;
     private Integer status;

    public SaveWadiItems() {
    }

	
    public SaveWadiItems(Item item, SaveWadi saveWadi) {
        this.item = item;
        this.saveWadi = saveWadi;
    }
    public SaveWadiItems(Item item, SaveWadi saveWadi, Integer qty, Double commissionPerItem, Double totalCommission, Integer rate, Integer status) {
       this.item = item;
       this.saveWadi = saveWadi;
       this.qty = qty;
       this.commissionPerItem = commissionPerItem;
       this.totalCommission = totalCommission;
       this.rate = rate;
       this.status = status;
    }
   
    public Integer getSaveWadiItemsId() {
        return this.saveWadiItemsId;
    }
    
    public void setSaveWadiItemsId(Integer saveWadiItemsId) {
        this.saveWadiItemsId = saveWadiItemsId;
    }
    public Item getItem() {
        return this.item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    public SaveWadi getSaveWadi() {
        return this.saveWadi;
    }
    
    public void setSaveWadi(SaveWadi saveWadi) {
        this.saveWadi = saveWadi;
    }
    public Integer getQty() {
        return this.qty;
    }
    
    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public Double getCommissionPerItem() {
        return this.commissionPerItem;
    }
    
    public void setCommissionPerItem(Double commissionPerItem) {
        this.commissionPerItem = commissionPerItem;
    }
    public Double getTotalCommission() {
        return this.totalCommission;
    }
    
    public void setTotalCommission(Double totalCommission) {
        this.totalCommission = totalCommission;
    }
    public Integer getRate() {
        return this.rate;
    }
    
    public void setRate(Integer rate) {
        this.rate = rate;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }




}


