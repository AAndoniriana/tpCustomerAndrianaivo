/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.andrianaivo.tpcustomerapplicationandrianaivo.managedBeans;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import mg.itu.andrianaivo.tpcustomerapplicationandrianaivo.entities.Customer;
import mg.itu.andrianaivo.tpcustomerapplicationandrianaivo.session.CustomerManager;

/**
 *
 * @author JAVA
 */
@Named(value = "customerMBean")
@ViewScoped
public class CustomerMBean implements Serializable {
    
    private List<Customer> customerList;

    @EJB
    private CustomerManager customerManager;
    
    /**
     * Creates a new instance of CustomerMBean
     */
    public CustomerMBean() {
    }
    
    /**
     * Fonction qui retourne la liste des clients pour affichage dans une DataTable
     * 
     * @return Liste des clients
     */
    public List<Customer> getCustomers() {
        if (customerList == null) {
            customerList = customerManager.getAllCustomer();
        }
        return customerList;
    }
    
}
