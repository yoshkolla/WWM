package pojos;
// Generated May 31, 2020 12:13:55 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Workers generated by hbm2java
 */
public class Workers  implements java.io.Serializable {


     private Integer workersId;
     private User user;
     private String name;
     private String addedDate;
     private String addedTime;
     private Double paybleAmount;
     private Integer type;
     private Integer status;
     private Set saveWadiWorkers = new HashSet(0);
     private Set wadiUsers = new HashSet(0);

    public Workers() {
    }

	
    public Workers(User user) {
        this.user = user;
    }
    public Workers(User user, String name, String addedDate, String addedTime, Double paybleAmount, Integer type, Integer status, Set saveWadiWorkers, Set wadiUsers) {
       this.user = user;
       this.name = name;
       this.addedDate = addedDate;
       this.addedTime = addedTime;
       this.paybleAmount = paybleAmount;
       this.type = type;
       this.status = status;
       this.saveWadiWorkers = saveWadiWorkers;
       this.wadiUsers = wadiUsers;
    }
   
    public Integer getWorkersId() {
        return this.workersId;
    }
    
    public void setWorkersId(Integer workersId) {
        this.workersId = workersId;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddedDate() {
        return this.addedDate;
    }
    
    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }
    public String getAddedTime() {
        return this.addedTime;
    }
    
    public void setAddedTime(String addedTime) {
        this.addedTime = addedTime;
    }
    public Double getPaybleAmount() {
        return this.paybleAmount;
    }
    
    public void setPaybleAmount(Double paybleAmount) {
        this.paybleAmount = paybleAmount;
    }
    public Integer getType() {
        return this.type;
    }
    
    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Set getSaveWadiWorkers() {
        return this.saveWadiWorkers;
    }
    
    public void setSaveWadiWorkers(Set saveWadiWorkers) {
        this.saveWadiWorkers = saveWadiWorkers;
    }
    public Set getWadiUsers() {
        return this.wadiUsers;
    }
    
    public void setWadiUsers(Set wadiUsers) {
        this.wadiUsers = wadiUsers;
    }




}


