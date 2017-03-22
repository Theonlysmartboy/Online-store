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
