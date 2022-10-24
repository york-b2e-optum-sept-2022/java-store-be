package net.yorksolutions.storebackend;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table()
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;

    @JsonProperty
    @Column()
    String productName;
    @JsonProperty
    String displayName;
    @JsonProperty
    Float price;
}
