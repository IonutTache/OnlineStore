package main.repository.entity;


import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "factura")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Invoice {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "local_date_time")
    private LocalDateTime localDateTime;

    @Column(name = "invoice_amount")
    private Double invoiceAmount;

    @OneToOne
    private Buyer buyer;

    @OneToOne
    private Seller seller;

    @OneToMany
    @Builder.Default
    private  final List<Product> product = new ArrayList<>();




//    @Column(name = "vanzator_id")
//    private String vanzatorId;
//
//    @Column(name = "cumparator_id")
//    private String cumparatorId;
//
//    @Column(name = "produs_id")
//    private String produsId;







}
