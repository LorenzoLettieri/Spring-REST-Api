package com.lolloletti.simplerestapi.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;


@Entity
@Table(name="members")
@Getter @Setter @NoArgsConstructor @ToString
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String surname;
    private String email;
    private Date created_at;
    private Date updated_at;

    public Member(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }


}
