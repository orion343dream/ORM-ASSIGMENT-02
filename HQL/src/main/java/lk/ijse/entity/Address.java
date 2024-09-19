package lk.ijse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    @Id
    private int address_id;
    private int no;
    private String street;
    private String city;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id",foreignKey = @ForeignKey(name = "FK_ADDRESS_CUSTOMER"))
    private Customer customer;
}
