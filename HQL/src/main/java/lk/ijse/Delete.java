package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

public class Delete {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery<Customer> query = session.createNativeQuery("delete from Customer where customer_id = ?1", Customer.class);
        query.setParameter(1, 1);
        query.executeUpdate();

        transaction.commit();
        session.close();
    }
}
