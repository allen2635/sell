package com.allen.sell.service.impl;

import com.allen.sell.dataobject.ProductInfo;
import com.allen.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl productInfoServiceImpl;

    @Test
    public void findOne() throws Exception {
    }

    @Test
    public void findPageAll() throws Exception {
    }

    @Test
    public void findUpAll() throws Exception {

        List<ProductInfo> result = productInfoServiceImpl.findUpAll();
        Assert.assertNotEquals(0, result.size());
    }

    @Test
    public void save() throws Exception {

        ProductInfo productInfo = new ProductInfo();
        productInfo.setCategoryType(2);
        productInfo.setProductDescription("好好吃");
        productInfo.setProductIcon("http://xxx.jpg");
        productInfo.setProductId(234);
        productInfo.setProductName("蛋炒饭");
        productInfo.setProductPrice(new BigDecimal(19));
        productInfo.setProductStatus(ProductStatusEnum.UP.getCode());
        productInfo.setProductStock(100);

        ProductInfo result = productInfoServiceImpl.save(productInfo);
        Assert.assertNotNull(result);

    }

}