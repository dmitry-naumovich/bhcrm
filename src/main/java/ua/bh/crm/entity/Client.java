package ua.bh.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "client")
@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String surname;
    private String email;
    private String igLink;
    private String vkLink;
    private String phone;

}
