package ua.bh.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "order")
@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Order {

//    private Client client;
    @Id
    @GeneratedValue
    private Long id;
}
