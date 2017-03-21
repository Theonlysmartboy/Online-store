/*
 * This application is property of Otema and is licenced under otema ©2017
 * No part of it whatsoever shall be shared or used unless under written permission by Otema
 * A breech of this may lead to prosecution.
 */
package com.otema.onlinestore.domain.repository;

import com.otema.onlinestore.domain.Product;
import java.util.List;

/**
 *
 * @author Maseno
 */
public interface ProductRepository {

    /**
     *
     * @return
     */
    List <Product> getAllProducts();
    
}
