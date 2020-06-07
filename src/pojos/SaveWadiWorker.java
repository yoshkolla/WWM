package pojos;
// Generated Jun 7, 2020 12:03:44 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * SaveWadiWorker generated by hbm2java
 */
public class SaveWadiWorker  implements java.io.Serializable {


     private Integer saveWadiWorkerId;
     private SaveWadi saveWadi;
     private Workers workers;
     private Double commission;
     private Integer status;
     private Set saveWadiPayments = new HashSet(0);

    public SaveWadiWorker() {
    }

	
    public SaveWadiWorker(SaveWadi saveWadi, Workers workers) {
        this.saveWadi = saveWadi;
        this.workers = workers;
    }
    public SaveWadiWorker(SaveWadi saveWadi, Workers workers, Double commission, Integer status, Set saveWadiPayments) {
       this.saveWadi = saveWadi;
       this.workers = workers;
       this.commission = commission;
       this.status = status;
       this.saveWadiPayments = saveWadiPayments;
    }
   
    public Integer getSaveWadiWorkerId() {
        return this.saveWadiWorkerId;
    }
    
    public void setSaveWadiWorkerId(Integer saveWadiWorkerId) {
        this.saveWadiWorkerId = saveWadiWorkerId;
    }
    public SaveWadi getSaveWadi() {
        return this.saveWadi;
    }
    
    public void setSaveWadi(SaveWadi saveWadi) {
        this.saveWadi = saveWadi;
    }
    public Workers getWorkers() {
        return this.workers;
    }
    
    public void setWorkers(Workers workers) {
        this.workers = workers;
    }
    public Double getCommission() {
        return this.commission;
    }
    
    public void setCommission(Double commission) {
        this.commission = commission;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Set getSaveWadiPayments() {
        return this.saveWadiPayments;
    }
    
    public void setSaveWadiPayments(Set saveWadiPayments) {
        this.saveWadiPayments = saveWadiPayments;
    }




}


