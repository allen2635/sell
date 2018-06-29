package com.allen.sell.service.impl;

import com.allen.sell.dao.ProductCategoryDao;
import com.allen.sell.dataobject.ProductCategory;
import com.allen.sell.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Override
    public ProductCategory findOne(Integer id) {
        return productCategoryDao.findById(id).get();
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryDao.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> list) {

        return productCategoryDao.findByCategoryTypeIn(list);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return productCategoryDao.save(productCategory);
    }
}
