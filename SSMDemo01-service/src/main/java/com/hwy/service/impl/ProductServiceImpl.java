/**
 * Copyright (C), 2019
 * FileName: ProductServiceImpl
 * Author:   huangwenyuan
 * Date:     2019/1/11 15:29
 * Description:
 */

package com.hwy.service.impl;

import com.hwy.mapper.ProductMapper;
import com.hwy.pojo.Product;
import com.hwy.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 功能描述:
 *
 * @author huangwenyuan
 * @create 2019/1/11
 * @since 1.0.0
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;

    /***
     * 分页查询产品信息
     * @param map
     * @return
     */
    @Override
    public List<Product> pageQueryData(Map<String, Object> map) {
        return productMapper.pageQueryData(map);
    }

    /***
     * 查询出产品的总条数
     * @param map
     * @return
     */
    @Override
    public int pageQueryCount(Map<String, Object> map) {
        return productMapper.pageQueryCount(map);
    }

    /***
     * 根据id删除产品
     * @param id
     */
    @Override
    public void deleteProductById(int id) {
        productMapper.deleteProductById(id);
    }

    /***
     * 批量删除产品
     * @param map
     */
    @Override
    public void deleteProducts(Map<String, Object> map) {
        productMapper.deleteProducts(map);
    }

    /**
     * 新增产品
     *
     * @param product
     */
    @Override
    public void insertProduct(Product product) {
        productMapper.insertProduct(product);
    }

    /***
     * 修改产品信息
     * @param product
     */
    @Override
    public void updateProduct(Product product) {
        productMapper.updateProduct(product);
    }

    /***
     * 根据id查询产品信息
     * @param id
     * @return
     */
    @Override
    public Product queryById(int id) {
        return productMapper.queryById(id);
    }
}

    