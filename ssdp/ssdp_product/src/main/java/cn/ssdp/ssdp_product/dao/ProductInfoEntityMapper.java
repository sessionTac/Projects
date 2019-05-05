package cn.ssdp.ssdp_product.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.ssdp.ssdp_product.entity.ProductInfoEntity;

@Mapper
public interface ProductInfoEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ProductInfoEntity record);

    int insertSelective(ProductInfoEntity record);

    ProductInfoEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ProductInfoEntity record);

    int updateByPrimaryKey(ProductInfoEntity record);
    
    List<HashMap<String, String>> getProductInfoList();
}