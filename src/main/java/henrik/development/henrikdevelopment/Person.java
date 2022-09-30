package henrik.development.henrikdevelopment;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Persons")

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Column(name="FirstName")
    private String FirstName;
    @Column(name="LastName")
    private String LastName;
    @Id
    //@GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="Ssn")
    private int Ssn;
    @Column(name="Age")
    private int Age;

}
