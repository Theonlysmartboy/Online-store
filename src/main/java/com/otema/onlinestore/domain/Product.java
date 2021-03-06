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
    
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Product other = (Product) obj;
    if (getProductId() == null) {
      if (  other.getProductId() != null)
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
        + ((getProductId() == null) ? 0 : getProductId().hashCode());
    return result;
  }
  @Override
  public String toString() {
    return "Product [productId=" + getProductId() + ", name=" + getName() + "]";
  }

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the unitPrice
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the unitsInStock
     */
    public long getUnitsInStock() {
        return unitsInStock;
    }

    /**
     * @param unitsInStock the unitsInStock to set
     */
    public void setUnitsInStock(long unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    /**
     * @return the unitsInOrder
     */
    public long getUnitsInOrder() {
        return unitsInOrder;
    }

    /**
     * @param unitsInOrder the unitsInOrder to set
     */
    public void setUnitsInOrder(long unitsInOrder) {
        this.unitsInOrder = unitsInOrder;
    }

    /**
     * @return the discontinued
     */
    public boolean isDiscontinued() {
        return discontinued;
    }

    /**
     * @param discontinued the discontinued to set
     */
    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    /**
     * @return the condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * @param condition the condition to set
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }
}