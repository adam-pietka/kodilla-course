package com.kodilla.hibernate.invoice;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public class Product {

    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

//    @NotNull
    @Column(name = "PROD_NAME")
    public String getName() {
        return name;
    }

    /*@ManyToOne
    @JoinColumn(name = "ITEM_ID")*/

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItem() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItem(List<Item> items) {
        this.items = items;
    }
}
/*
* W utworzonym pakiecie stwórz klasę reprezentującą pozycję asortymentu sklepu o nazwie Product
* (powinna zawierać pola: int id, String name),
* a następnie zrób z niej encję i dopisz kontroler repozytorium
*  (w podpakiecie dao)
* */
