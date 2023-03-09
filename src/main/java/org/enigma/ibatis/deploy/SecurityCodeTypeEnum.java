package org.enigma.ibatis.deploy;

/**
 * 用于配置验证码类型
 *
 * @version 0.2
 */
public enum SecurityCodeTypeEnum {

    /**
     * 都是数字
     */
    NUMBER_TYPE("0123456789"),

    /**
     * 大小写字母
     */
    LETTER_TYPE("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"),

    /**
     * 小写字母
     */
    SMALL_LETTER_TYPE("abcdefghijklmnopqrstuvwxyz"),

    /**
     * 大写字母
     */
    CAPITALIZE_LETTER_TYPE("ABCDEFGHIJKLMNOPQRSTUVWXYZ"),

    /**
     * 字母与数字混合
     */
    MIXTURE_NUMBER_LETTER("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789")

    ;

    private final String text;

    SecurityCodeTypeEnum(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
