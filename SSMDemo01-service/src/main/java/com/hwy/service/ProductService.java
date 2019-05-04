package com.hwy.service;

import com.hwy.pojo.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    /***
     * 分页查询产品信息
     * @param map
     * @return
     */
    List<Product> pageQueryData(Map<String, Object> map);

    /***
     * 查询出产品的总条数
     * @param map
     * @return
     */
    int pageQueryCount(Map<String, Object> map);

    /***
     * 根据id删除产品
     * @param id
     */
    void deleteProductById(int id);

    /***
     * 批量删除产品
     * @param map
     */
    void deleteProducts(Map<String, Object> map);

    /**
     * 新增产品
     *
     * @param product
     */
    void insertProduct(Product product);

    /***
     * 修改产品信息
     * @param product
     */
    void updateProduct(Product product);

    /***
     * 根据id查询产品信息
     * @param id
     * @return
     */
    Product queryById(int id);
}
