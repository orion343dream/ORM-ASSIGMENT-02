package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.CustomerAddress;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Join {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery<Object[]> query = session.createNativeQuery("select Customer.customer_id,name,address_id,no,street,city from Customer join Address on Customer.customer_id = Address.customer_id");
        List<Object[]> resultList = query.getResultList();
        for (Object[] res : resultList) {
            CustomerAddress customerAddress = new CustomerAddress((Integer) res[0], (String) res[1], (Integer) res[2], (Integer) res[3], (String) res[4], (String) res[5]);
            System.out.println(customerAddress);
        }

        transaction.commit();
        session.close();
    }
}
