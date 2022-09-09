package com.project.seckill.utils.encrypt;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 加密工具
 * @author D&M
 */
public class MD5Util {

    private static final String SALT = "1q2w3e4r";

    public static String encrypt(String str){
        return DigestUtils.md5Hex(str);
    }

    /**
     * 第一次加密
     * @param pass 用户密码
     * @return MD5(pass+固定salt)
     */
    private static String passToPass(String pass){
        StringBuilder builder = new StringBuilder();
        pass = builder.append(SALT.charAt(2)).append(SALT.charAt(4))
                .append(pass)
                .append(SALT.charAt(3)).append(SALT.charAt(7)).toString();
        return encrypt(pass);
    }

    /**
     * 第二次加密
     * @param pass 已经加密过的密码
     * @param salt 随机盐
     * @return 存入数据库的密码
     */
    private static String passToPass(String pass,String salt){
        StringBuilder builder = new StringBuilder();
        pass = builder.append(salt.charAt(0)).append(salt.charAt(6))
                .append(pass)
                .append(salt.charAt(1)).append(salt.charAt(5)).toString();
        return encrypt(pass);
    }

    /**
     * 密码加密
     * @param pass 用户密码
     * @param salt 随机盐
     * @return 存入数据库的密码
     */
    public static String passToDBPass(String pass,String salt){
        return passToPass(passToPass(pass),salt);
    }

}
