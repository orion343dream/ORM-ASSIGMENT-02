package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    @Id
    private int customer_id;
    private String name;
    @OneToMany(mappedBy = "customer")
    private List<Address> addresses;

    public Customer(int customer_id, String name) {
        this.customer_id = customer_id;
        this.name = name;
    }
}
