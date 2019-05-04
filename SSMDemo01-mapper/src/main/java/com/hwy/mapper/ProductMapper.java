package com.hwy.mapper;

import com.hwy.pojo.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface ProductMapper {

    /***
     * 分页查询产品信息
     * @param map
     * @return
     */
    List<Product> pageQueryData(Map<String, Object> map);

    /***
     * 查询出产品数据的总条数
     * @param map
     * @return
     */
    int pageQueryCount(Map<String, Object> map);


    /***
     * 根据id删除产品信息
     * @param id
     */
    @Delete("delete from t_product where id = #{id}")
    void deleteProductById(int id);

    /***
     *批量删除产品
     * @param map
     */
    void deleteProducts(Map<String, Object> map);

    /***
     * 新增产品
     * @param product
     */
    void insertProduct(Product product);

    /***
     * 修改产品信息
     * @param product
     */
    void updateProduct(Product product);

    /***
     *根据id查询产品信息
     * @param id
     * @return
     */
    @Select("select * from t_product where id=#{id}")
    Product queryById(int id);
}
