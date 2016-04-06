/**
 * 
 */
package org.varma.application.demo;

import java.util.Date;
import java.util.UUID;

import org.hibernate.Session;
import org.varma.db.utils.HibernateUtil;
import org.varma.entities.Merchant;

/**
 * @author slolakapuri1
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Merchant merchant = new Merchant();
		merchant.setMerchantId(UUID.randomUUID().toString());
		merchant.setAccountNumber(new Long(544773241));
		merchant.setFirstName("Dhoni");
		merchant.setLastName("MS");
		merchant.setOfferId("Offer_04010002");
		merchant.setCreatedDate(new Date());
		
		session.save(merchant);
		session.getTransaction().commit();
		session.close();
	}

}
