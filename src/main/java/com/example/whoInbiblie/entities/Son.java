package com.example.whoInbiblie.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "filho")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Son {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "mae")
    Long id_mother;
    @Column(name = "pai")
    Long id_father;
}
