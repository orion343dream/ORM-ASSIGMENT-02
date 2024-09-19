package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Query<Object[]> findAll = session.createNamedQuery("findAll");
        List<Object[]> customers = findAll.getResultList();
        for (Object[] customer : customers) {
            System.out.println(customer[0] + " " + customer[1]);
        }

        transaction.commit();
        session.close();
    }
}