package ua.bh.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "item")
@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue
    private Long id;
}
