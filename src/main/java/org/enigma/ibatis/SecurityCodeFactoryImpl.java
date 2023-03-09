package org.enigma.ibatis;

import org.enigma.ibatis.deploy.SecurityCodeConfig;
import org.enigma.ibatis.factory.SecurityCodeFactory;

import java.util.Random;

/**
 * 创建验证码
 *
 * @author admin 梁铭华
 * @version 0.2
 */
public class SecurityCodeFactoryImpl implements SecurityCodeFactory {


    private SecurityCodeConfig securityCodeConfig;


    SecurityCodeFactoryImpl(){
        this.securityCodeConfig = SecurityCodeConfig.build();
    }


    SecurityCodeFactoryImpl(SecurityCodeConfig securityCodeConfig) {
        this.securityCodeConfig = securityCodeConfig;
    }


    /**
     * 构建验证码方法
     * @return SecurityCodeFactory
     */
    public static SecurityCodeFactoryImpl build(){
        return new SecurityCodeFactoryImpl();
    }

    /**
     * 构建验证码方法
     * @return SecurityCodeFactory
     */
    public static SecurityCodeFactoryImpl build(SecurityCodeConfig securityCodeConfig){
        return new SecurityCodeFactoryImpl(securityCodeConfig);
    }


    /**
     * 设置验证码配置
     *
     * @param securityCodeConfig 配置
     * @return SecurityCodeFactory
     */
    public SecurityCodeFactory setSecurityCodeConfig(SecurityCodeConfig securityCodeConfig){
        this.securityCodeConfig = securityCodeConfig;
        return this;
    }


    @Override
    public String createSecurityCode() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < securityCodeConfig.getNumber(); i++) {
            String test = securityCodeConfig.getCodeType().getText();
            int number = random.nextInt(test.length());
            sb.append(test.charAt(number));
        }

        return sb.toString();
    }

}
