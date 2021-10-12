package com.bdvenda.products.relay.domains.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {

    @Id
    private String id;

    private String name;
    private String description;
    private int quantity;
    private String code;
    private String type;
    private boolean status;

    public Product(String id, String name, String description, int quantity, String code, String type, boolean status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.code = code;
        this.type = type;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity='" + quantity + '\'' +
                ", code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", status=" + status +
                '}';
    }
}
