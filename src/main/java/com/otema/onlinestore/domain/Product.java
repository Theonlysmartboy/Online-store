/*
 * This application is property of Otema and is licenced under otema ©2017
 * No part of it whatsoever shall be shared or used unless under written permission by Otema
 * A breech of this may lead to prosecution.
 */
package com.otema.onlinestore.domain;

import java.math.BigDecimal;

/**
 *
 * @author Otema
 */
public class Product {
  private String productId;
  private String name;
  private BigDecimal unitPrice;
  private String description;
  private String manufacturer;
  private String category;
  private long unitsInStock;
  private long unitsInOrder;
  private boolean discontinued;
private String condition;
  public Product() {
    super();
}
  public Product(String productId, String name, BigDecimal unitPrice) {
    this.productId = productId;
    this.name = name;
    this.unitPrice = unitPrice;
  }
  // add setters and getters for all the fields here
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Product other = (Product) obj;
    if (productId == null) {
      if (other.productId != null)
        return false;
    } else if (!productId.equals(other.productId))
      return false;
    return true;
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result
        + ((productId == null) ? 0 : productId.hashCode());
    return result;
  }
  @Override
  public String toString() {
    return "Product [productId=" + productId + ", name=" + name + "]";
  }
}