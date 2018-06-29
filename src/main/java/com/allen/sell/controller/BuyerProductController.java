package com.allen.sell.controller;

import com.allen.sell.dataobject.ProductCategory;
import com.allen.sell.service.impl.ProductCategoryServiceImpl;
import com.allen.sell.service.impl.ProductInfoServiceImpl;
import com.allen.sell.vo.ProductCategoryVo;
import com.allen.sell.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoServiceImpl productInfoService;

    @Autowired
    private ProductCategoryServiceImpl categoryService;

    @GetMapping("/list")
    public ResultVo list() {

        ResultVo resultVo = new ResultVo();
        resultVo.setCode(200);
        resultVo.setMsg("成功");

        for (ProductCategory category : categoryService.findAll()) {

            ProductCategoryVo productCategoryVo = new ProductCategoryVo();
        }
        return null;
    }
}
