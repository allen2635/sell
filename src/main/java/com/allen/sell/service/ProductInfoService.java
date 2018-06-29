package com.allen.sell.service;

import com.allen.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductInfoService {

    ProductInfo findOne(Integer id);

    Page<ProductInfo> findPageAll(Pageable pageable);

    List<ProductInfo> findUpAll();

    ProductInfo save(ProductInfo productInfo);
}
