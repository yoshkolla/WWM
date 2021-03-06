package pojos;
// Generated Jun 7, 2020 5:09:46 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer userId;
     private String name;
     private String username;
     private String password;
     private String addedDate;
     private String addedTime;
     private Integer status;
     private Set items = new HashSet(0);
     private Set saveWadis = new HashSet(0);
     private Set workerCommissionPays = new HashSet(0);
     private Set wadiItemses = new HashSet(0);
     private Set workerses = new HashSet(0);
     private Set wadis = new HashSet(0);

    public User() {
    }

    public User(String name, String username, String password, String addedDate, String addedTime, Integer status, Set items, Set saveWadis, Set workerCommissionPays, Set wadiItemses, Set workerses, Set wadis) {
       this.name = name;
       this.username = username;
       this.password = password;
       this.addedDate = addedDate;
       this.addedTime = addedTime;
       this.status = status;
       this.items = items;
       this.saveWadis = saveWadis;
       this.workerCommissionPays = workerCommissionPays;
       this.wadiItemses = wadiItemses;
       this.workerses = workerses;
       this.wadis = wadis;
    }
   
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
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
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Set getItems() {
        return this.items;
    }
    
    public void setItems(Set items) {
        this.items = items;
    }
    public Set getSaveWadis() {
        return this.saveWadis;
    }
    
    public void setSaveWadis(Set saveWadis) {
        this.saveWadis = saveWadis;
    }
    public Set getWorkerCommissionPays() {
        return this.workerCommissionPays;
    }
    
    public void setWorkerCommissionPays(Set workerCommissionPays) {
        this.workerCommissionPays = workerCommissionPays;
    }
    public Set getWadiItemses() {
        return this.wadiItemses;
    }
    
    public void setWadiItemses(Set wadiItemses) {
        this.wadiItemses = wadiItemses;
    }
    public Set getWorkerses() {
        return this.workerses;
    }
    
    public void setWorkerses(Set workerses) {
        this.workerses = workerses;
    }
    public Set getWadis() {
        return this.wadis;
    }
    
    public void setWadis(Set wadis) {
        this.wadis = wadis;
    }




}


