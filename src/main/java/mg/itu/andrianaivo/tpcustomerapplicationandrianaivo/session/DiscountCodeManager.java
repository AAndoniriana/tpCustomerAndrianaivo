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
import mg.itu.andrianaivo.tpcustomerapplicationandrianaivo.entities.DiscountCode;

/**
 *
 * @author JAVA
 */
@Stateless
public class DiscountCodeManager {
    
    @PersistenceContext
    private EntityManager em;

    public List<DiscountCode> getAllDiscountCode() {
        Query query = em.createNamedQuery("DiscountCode.findAll");
        return query.getResultList();
    }
    
    public DiscountCode findById(String discountCode) {
        return em.find(DiscountCode.class, discountCode);
    }
    
    public void persist(DiscountCode discountCode) {
        em.persist(discountCode);
    }
    
}
