package org.enigma.ibatis.deploy;

/**
 * 验证码配置类
 *
 * @version 0.1
 */
public class SecurityCodeConfig {

    /**
     * 初始化默认长度
     */
    private int number = 4;

    /**
     * 验证码类型
     */
    public SecurityCodeTypeEnum codeType = SecurityCodeTypeEnum.MIXTURE_NUMBER_LETTER;

    public int getNumber() {
        return number;
    }

    public SecurityCodeConfig setNumber(int number) {
        this.number = number;
        return this;
    }

    public SecurityCodeTypeEnum getCodeType() {
        return codeType;
    }

    public SecurityCodeConfig setCodeType(SecurityCodeTypeEnum codeType) {
        this.codeType = codeType;
        return this;
    }

    public static SecurityCodeConfig build(){
        return new SecurityCodeConfig();
    }


}
