package cn.ssdp.ssdp_user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.ssdp.ssdp_user.entity.MUserInfoEntity;

@Mapper
public interface MUserInfoEntityMapper {
    int deleteByPrimaryKey(String userId);

    int insert(MUserInfoEntity record);

    int insertSelective(MUserInfoEntity record);

    MUserInfoEntity selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(MUserInfoEntity record);

    int updateByPrimaryKey(MUserInfoEntity record);
    
    List<MUserInfoEntity> selectUserInfoList(MUserInfoEntity record);
}