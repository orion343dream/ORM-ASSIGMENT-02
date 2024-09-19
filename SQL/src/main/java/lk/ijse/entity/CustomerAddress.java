package lk.ijse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerAddress {
    private int customer_id;
    private String name;
    private int address_id;
    private int no;
    private String street;
    private String city;
}
