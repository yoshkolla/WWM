package pojos;
// Generated Jun 2, 2020 11:01:12 PM by Hibernate Tools 4.3.1



/**
 * WadiItems generated by hbm2java
 */
public class WadiItems  implements java.io.Serializable {


     private Integer wadiItemsId;
     private Item item;
     private User user;
     private Integer status;

    public WadiItems() {
    }

	
    public WadiItems(Item item, User user) {
        this.item = item;
        this.user = user;
    }
    public WadiItems(Item item, User user, Integer status) {
       this.item = item;
       this.user = user;
       this.status = status;
    }
   
    public Integer getWadiItemsId() {
        return this.wadiItemsId;
    }
    
    public void setWadiItemsId(Integer wadiItemsId) {
        this.wadiItemsId = wadiItemsId;
    }
    public Item getItem() {
        return this.item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }




}


