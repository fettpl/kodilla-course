package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {
    @Id
    @GeneratedValue
    private int id;
    private String number;
    @OneToMany(
            mappedBy = "invoice",
            cascade = CascadeType.ALL
    )
    private List<Item> items;

    public Invoice() {

    }
}
