package org.learn.lra.shipmentservice;

import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@ToString
@NoArgsConstructor
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotNull
    private String orderId;

    @NotNull
    private String lraId;

    private int price;

    private boolean comleted;

    public Shipment(String orderId, String lraId, int price) {
        this(orderId, lraId, price, false);
    }

    public Shipment(String orderId, String lraId, int price, boolean comleted) {
        this.orderId = orderId;
        this.lraId = lraId;
        this.price = price;
        this.comleted = comleted;
    }

    public String getId() {
        return id;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getLraId() {
        return lraId;
    }

    public int getPrice() {
        return price;
    }

    public boolean isComleted() {
        return comleted;
    }

    public void setComleted(boolean comleted) {
        this.comleted = comleted;
    }
}
