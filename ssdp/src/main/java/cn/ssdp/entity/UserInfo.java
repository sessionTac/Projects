package cn.ssdp.entity;

import lombok.Data;

@Data
public class UserInfo {
    private String id;

    private String userName;

    private String passWord;

    private String userRealName;

    private String email;

    private String phone;

    private String address;

    private Integer delFlg;

}