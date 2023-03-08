package org.enigma.ibatis;

import org.enigma.ibatis.deploy.SecurityCodeConfig;

import java.util.Random;

public class SecurityCodeFactory {

    private static final String CODE_SRT = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String createSecurityCode() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        SecurityCodeConfig securityCodeConfig = new SecurityCodeConfig();

        for (int i = 0; i < securityCodeConfig.getNumber(); i++) {
            int number = random.nextInt(62);
            sb.append(CODE_SRT.charAt(number));
        }

        return sb.toString();
    }

}
