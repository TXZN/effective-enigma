package org.enigma.ibatis.factory;

/**
 * 验证码创建通用接口
 *
 * @author admin 梁铭华
 * @version 0.2
 */
public interface SecurityCodeFactory {

    /**
     * 验证码创建通用接口
     *
     * @return 验证码
     */
    String createSecurityCode();

}
