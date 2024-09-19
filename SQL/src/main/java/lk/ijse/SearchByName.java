package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class SearchByName {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery<Customer> query = session.createNativeQuery("select * from Customer where name = ?1", Customer.class);
        query.setParameter(1, "Harsha");
        List<Customer> customers = query.getResultList();
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        transaction.commit();
        session.close();
    }
}
