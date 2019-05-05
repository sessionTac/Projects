package cn.ssdp.ssdp_user.service;

import cn.ssdp.ssdp_core.common.CommonResultInfo;
import cn.ssdp.ssdp_user.entity.MUserInfoEntity;

public interface UserInfoService {
	
	CommonResultInfo<MUserInfoEntity> getUserInfoList(MUserInfoEntity muserInfoEntity,int pageNumber,int pageSize);
	
	CommonResultInfo<MUserInfoEntity> getUserInfo(String userId);

	CommonResultInfo<?> addUserInfo(MUserInfoEntity mUserInfoEntity);
	
	CommonResultInfo<?> updateUserInfo(MUserInfoEntity mUserInfoEntity);
	
	CommonResultInfo<?> deleteUserInfo(MUserInfoEntity mUserInfoEntity);

}
