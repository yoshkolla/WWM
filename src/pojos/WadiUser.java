package pojos;
// Generated Jun 7, 2020 12:03:44 PM by Hibernate Tools 4.3.1



/**
 * WadiUser generated by hbm2java
 */
public class WadiUser  implements java.io.Serializable {


     private Integer wadiUserId;
     private Wadi wadi;
     private Workers workers;
     private Integer status;

    public WadiUser() {
    }

	
    public WadiUser(Wadi wadi, Workers workers) {
        this.wadi = wadi;
        this.workers = workers;
    }
    public WadiUser(Wadi wadi, Workers workers, Integer status) {
       this.wadi = wadi;
       this.workers = workers;
       this.status = status;
    }
   
    public Integer getWadiUserId() {
        return this.wadiUserId;
    }
    
    public void setWadiUserId(Integer wadiUserId) {
        this.wadiUserId = wadiUserId;
    }
    public Wadi getWadi() {
        return this.wadi;
    }
    
    public void setWadi(Wadi wadi) {
        this.wadi = wadi;
    }
    public Workers getWorkers() {
        return this.workers;
    }
    
    public void setWorkers(Workers workers) {
        this.workers = workers;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }




}


