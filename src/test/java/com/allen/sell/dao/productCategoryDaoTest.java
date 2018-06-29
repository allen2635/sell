package com.allen.sell.dao;

import com.allen.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class productCategoryDaoTest {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findOneTest() {

        ProductCategory productCategory = productCategoryDao.findById(1).get();
        System.out.print(productCategory.toString());
    }

    @Test
    public void saveTest() {

        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女神最爱");
        productCategory.setCategoryType(3);
        productCategoryDao.save(productCategory);
    }

    @Test
    public void findByTypeTest() {

        List<Integer> list = Arrays.asList(2, 3);
        List<ProductCategory> result = productCategoryDao.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }
}