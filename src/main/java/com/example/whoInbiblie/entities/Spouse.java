package com.example.whoInbiblie.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "conjuge")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Spouse {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "conjugeUm")
    private Name spouseOne;
    @Column(name = "conjugeDois")
    private Name spouseTwo;
}
