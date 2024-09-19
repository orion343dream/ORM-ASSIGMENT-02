package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Address;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Insert {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        int executed = session.createNativeQuery("insert into Customer values (1,'Harsha')", Customer.class).executeUpdate();
        System.out.println(executed);

        int executed1 = session.createNativeQuery("insert into Address values (1,'Horana',40,'sth lane',1)", Address.class).executeUpdate();
        System.out.println(executed1);

        transaction.commit();
        session.close();
    }
}