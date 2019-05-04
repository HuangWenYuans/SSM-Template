/**
 * Copyright (C), 2019
 * FileName: Product
 * Author:   huangwenyuan
 * Date:     2019/1/11 15:24
 * Description:
 */

package com.hwy.pojo;

import java.math.BigDecimal;

/**
 * 功能描述: 
 * @author huangwenyuan
 * @create 2019/1/11
 * @since 1.0.0
 */
public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private String introduction;
    private int stock;

    public Product() {
    }

    public Product(int id, String name, BigDecimal price, String introduction, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.introduction = introduction;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", introduction='" + introduction + '\'' +
                ", stock=" + stock +
                '}';
    }
}

    