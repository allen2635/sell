package com.allen.sell.service.impl;

import com.allen.sell.dao.ProductInfoDao;
import com.allen.sell.dataobject.ProductInfo;
import com.allen.sell.enums.ProductStatusEnum;
import com.allen.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Override
    public ProductInfo findOne(Integer id) {
        return productInfoDao.findById(id).get();
    }

    @Override
    public Page<ProductInfo> findPageAll(Pageable pageable) {
        return productInfoDao.findAll(pageable);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoDao.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productInfoDao.save(productInfo);
    }
}
