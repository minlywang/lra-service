package org.learn.lra.orderservice.model;

import lombok.NoArgsConstructor;
import org.learn.lra.coreapi.ProductInfo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "OrderEntity")
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotNull
    private String productId;

    @NotNull
    private String productComment;

    @NotNull
    private int productPrice;


    public Order(ProductInfo productInfo) {
        this.productId = productInfo.getProductId();
        this.productComment = productInfo.getComment();
        this.productPrice = productInfo.getPrice();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductComment() {
        return productComment;
    }

    public void setProductComment(String productComment) {
        this.productComment = productComment;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return String.format("Order[id: %s, product: %s]", id, productId);
    }
}
