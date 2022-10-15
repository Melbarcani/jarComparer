package com.example.demo3.infrastructure;

import javax.persistence.*;

@Entity
public class JarLinkEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column
    private String jarLink1;

    @Column
    private String jarLink2;
}
