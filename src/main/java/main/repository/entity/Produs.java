package main.repository.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "produs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Produs {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nume_produs")
    private String numeProdus;

    @Column(name = "pret_produs")
    private Double pretProdus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vanzator_id",nullable = false)
    @NotNull
    private Vanzator vanzator;




}
