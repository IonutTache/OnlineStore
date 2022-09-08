package main.repository.entity;


import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "factura")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Factura {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "local_date_time")
    private LocalDateTime localDateTime;

    @Column(name = "pret_factura")
    private Double pretFactura;

    @OneToOne
    private Cumparator cumparator;

    @OneToOne
    private Vanzator vanzator;

    @OneToMany
    private List<Produs> produs;




//    @Column(name = "vanzator_id")
//    private String vanzatorId;
//
//    @Column(name = "cumparator_id")
//    private String cumparatorId;
//
//    @Column(name = "produs_id")
//    private String produsId;







}
