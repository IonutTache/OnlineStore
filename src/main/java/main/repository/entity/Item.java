package main.repository.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "item")
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank
    @Column(name = "name")
    private String name;

    @Min(10) //hiberante vliddeaza aceasta valoare inaite de a face queriul in baza de date
    @Column(name = "age")
    private Integer age;
}

//tabel - vanzare- foreigh catre vanzator , produs, cumparator. informatie a//foreign key in produs catrte vanzator
