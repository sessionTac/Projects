package cn.ssdp.ssdp_user.dao;

import cn.ssdp.ssdp_user.entity.MUserInfoEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MUserInfoEntityMapper {
    int deleteByPrimaryKey(String userId);

    int insert(MUserInfoEntity record);

    int insertSelective(MUserInfoEntity record);

    MUserInfoEntity selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(MUserInfoEntity record);

    int updateByPrimaryKey(MUserInfoEntity record);
}