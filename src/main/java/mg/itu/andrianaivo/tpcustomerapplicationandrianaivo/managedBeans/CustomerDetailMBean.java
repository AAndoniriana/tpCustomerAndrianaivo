/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.andrianaivo.tpcustomerapplicationandrianaivo.managedBeans;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import mg.itu.andrianaivo.tpcustomerapplicationandrianaivo.session.CustomerManager;
import mg.itu.andrianaivo.tpcustomerapplicationandrianaivo.entities.Customer;

/**
 *
 * @author JAVA
 */
@Named(value = "customerDetailMBean")
@ViewScoped
public class CustomerDetailMBean implements Serializable {
    
    private int idCustomer;
    private Customer customer;
    
    @EJB
    private CustomerManager customerManager;

    /**
     * Creates a new instance of CustomerDetail
     */
    public CustomerDetailMBean() {
    }
    
    public Customer getDetail() {
        return customer;
    }
    
    public void loadCustomer() {
        customer = customerManager.getCustomer(idCustomer);
    }
    
    public String update() {
        customer = customerManager.update(customer);
        return "CustomerList";
    }
    
    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }
    
    public int getIdCustomer() {
        return idCustomer;
    }
    
}
