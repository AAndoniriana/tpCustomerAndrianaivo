/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package mg.itu.andrianaivo.tpcustomerapplicationandrianaivo.session;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import mg.itu.andrianaivo.tpcustomerapplicationandrianaivo.entities.Customer;

/**
 *
 * @author JAVA
 */
@Stateless
public class CustomerManager {

    @PersistenceContext(unitName = "customerPU")
    private EntityManager em;
    
    public Customer getCustomer(int idCustomer) {
        return em.find(Customer.class, idCustomer);
    }

    public List<Customer> getAllCustomer() {
        Query query = em.createNamedQuery("Customer.findAll");
        return query.getResultList();
    }
    
    public Customer update(Customer customer) {
        return em.merge(customer);
    }

    public void persist(Customer customer) {
        em.persist(customer);
    }
    
}
