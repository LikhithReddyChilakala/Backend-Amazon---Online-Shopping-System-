package com.amazon.design.shipment;

import com.amazon.design.enums.ShipmentStatus;
import java.util.Date;

public class Shipment {
    private String shipmentNumber;
    private Date shipmentDate;
    private Date estimatedArrival;
    private String shipmentMethod;

    public Shipment(String shipmentNumber, String shipmentMethod) {
        this.shipmentNumber = shipmentNumber;
        this.shipmentDate = new Date();
        this.shipmentMethod = shipmentMethod;
    }

    public String getShipmentNumber() { return shipmentNumber; }
    public Date getShipmentDate() { return shipmentDate; }
    public Date getEstimatedArrival() { return estimatedArrival; }
    public String getShipmentMethod() { return shipmentMethod; }

    public void addShipmentLog(Object log) {
        // Logic to add shipment log
    }
}
