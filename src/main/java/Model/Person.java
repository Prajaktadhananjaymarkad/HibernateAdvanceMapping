package Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private  int personId;

    @Column(name = "person_name")
    private String personName;

    @Column(name = "person_address")
    private  String personAddress;

    @Column(name = "person_age")
    private int personAge;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE,CascadeType.REFRESH,CascadeType.DETACH})
    //@OneToOne(cascade = CascadeType.ALL) to do all operation.it is used only with one to one mapping
   // @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "passport_ref")
    private Passport passportRef;

}
