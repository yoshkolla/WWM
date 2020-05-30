package pojos;
// Generated May 31, 2020 12:13:55 AM by Hibernate Tools 4.3.1



/**
 * WorkerCommissionPay generated by hbm2java
 */
public class WorkerCommissionPay  implements java.io.Serializable {


     private Integer workerCommissionPayId;
     private User user;
     private String payDate;
     private String payTime;
     private Double amount;
     private Integer status;

    public WorkerCommissionPay() {
    }

	
    public WorkerCommissionPay(User user) {
        this.user = user;
    }
    public WorkerCommissionPay(User user, String payDate, String payTime, Double amount, Integer status) {
       this.user = user;
       this.payDate = payDate;
       this.payTime = payTime;
       this.amount = amount;
       this.status = status;
    }
   
    public Integer getWorkerCommissionPayId() {
        return this.workerCommissionPayId;
    }
    
    public void setWorkerCommissionPayId(Integer workerCommissionPayId) {
        this.workerCommissionPayId = workerCommissionPayId;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getPayDate() {
        return this.payDate;
    }
    
    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }
    public String getPayTime() {
        return this.payTime;
    }
    
    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }
    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }




}


