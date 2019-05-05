package cn.ssdp.ssdp_product.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class ProductInfoEntity implements Serializable {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String productno;

    /**
     * 
     */
    private String productname;

    private static final long serialVersionUID = 1L;
}