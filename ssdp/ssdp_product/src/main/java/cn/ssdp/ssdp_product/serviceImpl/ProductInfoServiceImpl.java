package cn.ssdp.ssdp_product.serviceImpl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;

import cn.ssdp.ssdp_product.dao.ProductInfoEntityMapper;
import cn.ssdp.ssdp_product.service.ProductInfoService;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

	@Autowired
	private ProductInfoEntityMapper productInfoEntityMapper;
	
	@Override
	public Object getProductInfos() {
		PageInfo<HashMap<String, String>> pageInfo = new PageInfo<>(productInfoEntityMapper.getProductInfoList());
		return pageInfo;
	}

}