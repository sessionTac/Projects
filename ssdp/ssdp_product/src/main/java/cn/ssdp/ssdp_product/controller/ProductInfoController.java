package cn.ssdp.ssdp_product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.ssdp.ssdp_product.service.ProductInfoService;

/**
 * 
 * @author 
 *
 */
@RestController
public class ProductInfoController {

	@Autowired
	private ProductInfoService productInfoService;
	
	@GetMapping("/list")
	public Object getProductInfoList() {
		return productInfoService.getProductInfos();
	}

}
