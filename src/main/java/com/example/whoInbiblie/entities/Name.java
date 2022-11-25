package com.example.whoInbiblie.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "nome")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Name {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;
}
