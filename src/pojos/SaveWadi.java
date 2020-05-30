package pojos;
// Generated May 31, 2020 12:13:55 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * SaveWadi generated by hbm2java
 */
public class SaveWadi  implements java.io.Serializable {


     private Integer saveWadiId;
     private User user;
     private String savedDate;
     private String savedTime;
     private Integer status;
     private Set saveWadiItemses = new HashSet(0);
     private Set saveWadiWorkers = new HashSet(0);

    public SaveWadi() {
    }

	
    public SaveWadi(User user) {
        this.user = user;
    }
    public SaveWadi(User user, String savedDate, String savedTime, Integer status, Set saveWadiItemses, Set saveWadiWorkers) {
       this.user = user;
       this.savedDate = savedDate;
       this.savedTime = savedTime;
       this.status = status;
       this.saveWadiItemses = saveWadiItemses;
       this.saveWadiWorkers = saveWadiWorkers;
    }
   
    public Integer getSaveWadiId() {
        return this.saveWadiId;
    }
    
    public void setSaveWadiId(Integer saveWadiId) {
        this.saveWadiId = saveWadiId;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getSavedDate() {
        return this.savedDate;
    }
    
    public void setSavedDate(String savedDate) {
        this.savedDate = savedDate;
    }
    public String getSavedTime() {
        return this.savedTime;
    }
    
    public void setSavedTime(String savedTime) {
        this.savedTime = savedTime;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Set getSaveWadiItemses() {
        return this.saveWadiItemses;
    }
    
    public void setSaveWadiItemses(Set saveWadiItemses) {
        this.saveWadiItemses = saveWadiItemses;
    }
    public Set getSaveWadiWorkers() {
        return this.saveWadiWorkers;
    }
    
    public void setSaveWadiWorkers(Set saveWadiWorkers) {
        this.saveWadiWorkers = saveWadiWorkers;
    }




}


