package cn.ssdp.ssdp_user.service.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.ssdp.ssdp_core.common.CommonResultInfo;
import cn.ssdp.ssdp_core.common.ConstantMessageInfo;
import cn.ssdp.ssdp_user.dao.MUserInfoEntityMapper;
import cn.ssdp.ssdp_user.entity.MUserInfoEntity;
import cn.ssdp.ssdp_user.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private MUserInfoEntityMapper muserInfoEntityMapper;
	
	
	@SuppressWarnings("finally")
	@Override
	public CommonResultInfo<MUserInfoEntity> getUserInfoList(MUserInfoEntity muserInfoEntity, int pageNumber,
			int pageSize) {
		CommonResultInfo<MUserInfoEntity> result = new CommonResultInfo<MUserInfoEntity>();
		try {
			PageHelper.startPage(pageNumber, pageSize);
			PageInfo<MUserInfoEntity> pageInfo = new PageInfo<>(muserInfoEntityMapper.selectUserInfoList(muserInfoEntity));
			result.setCode(Response.Status.OK.getStatusCode());
			result.setResultInfo(pageInfo);
		}
		catch(Exception e) {
			result.setCode(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
			result.setMessage(ConstantMessageInfo.SERVICE_ERROR);
			result.setException(e.getMessage().toString());
		}
		finally {
			return result;
		}
	}
	
	@SuppressWarnings("finally")
	@Override
	public CommonResultInfo<MUserInfoEntity> getUserInfo(String userId){
		CommonResultInfo<MUserInfoEntity> result = new CommonResultInfo<MUserInfoEntity>();
		try {
			MUserInfoEntity userInfo = muserInfoEntityMapper.selectByPrimaryKey(userId);
			result.setCode(Response.Status.OK.getStatusCode());
			result.setResult(userInfo);
		}
		catch(Exception e) {
			result.setCode(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
			result.setMessage(ConstantMessageInfo.SERVICE_ERROR);
			result.setException(e.getMessage().toString());
		}
		finally {
			return result;
		}
	}

	@Override
	public CommonResultInfo<?> addUserInfo(MUserInfoEntity mUserInfoEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommonResultInfo<?> updateUserInfo(MUserInfoEntity mUserInfoEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommonResultInfo<?> deleteUserInfo(MUserInfoEntity mUserInfoEntity) {
		// TODO Auto-generated method stub
		return null;
	}

}
