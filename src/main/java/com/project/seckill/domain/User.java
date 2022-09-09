package com.project.seckill.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author D&M
 */
@Getter
@Setter
@TableName("seckill_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 手机号码
     */
    private Long userName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 密码(MD5(MD5(明文pass+固定salt)+ 随机salt))
     */
    private String userPass;

    /**
     * 头像
     */
    private String head;

    /**
     * 盐
     */
    private String salt;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 最后登录时间
     */
    private Date lastLoginTime;

    /**
     * 登录次数
     */
    private Integer loginCount;


}
