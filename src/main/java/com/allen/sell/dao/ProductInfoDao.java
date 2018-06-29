package com.allen.sell.dao;

import com.allen.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoDao extends JpaRepository<ProductInfo, Integer> {

    List<ProductInfo> findByProductStatus(Integer code);
}
