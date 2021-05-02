package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public final class Item {

    private int id;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Product product;

    public Item() {
    }

    public Item(BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ITEM_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() { return price; }

    @NotNull
    @Column(name = "QUANTITY")
    public int getQuantity() { return quantity; }

    @NotNull
    @Column(name = "VALUE")
    public BigDecimal getValue() { return value; }

    /*@OneToMany(
                    targetEntity = Product.class,
                    mappedBy = "PRODUCT_ID",
                    cascade = CascadeType.ALL,
                    fetch = FetchType.LAZY
            )*/
    @ManyToOne
    @JoinColumn(name = "ID_FK", referencedColumnName = "ID")
    public Product getProduct() { return product; }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
