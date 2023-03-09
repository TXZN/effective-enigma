
import org.enigma.ibatis.SecurityCodeFactoryImpl;
import org.enigma.ibatis.deploy.SecurityCodeConfig;
import org.enigma.ibatis.deploy.SecurityCodeTypeEnum;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecurityCodeFactoryTest {

    /**
     *
     * 默认创建
     */
    @Test
    public void testDefaultCreateSecurityCode() {
        boolean isSure = false;

        while (!isSure) {

            String securityCode = SecurityCodeFactoryImpl.build().createSecurityCode();

            isSure = checkRead(false, securityCode);
        }

    }


    /**
     * 用户自定义创建
     */
    @Test
    public void testCustomerCreateSecurityCode() {
        boolean isSure = false;

        while (!isSure) {

            SecurityCodeConfig securityCodeConfig = SecurityCodeConfig.build().setCodeType(SecurityCodeTypeEnum.SMALL_LETTER_TYPE).setNumber(4);
            String securityCode = SecurityCodeFactoryImpl.build().setSecurityCodeConfig(securityCodeConfig).createSecurityCode();

            isSure = checkRead(false, securityCode);
        }

    }



    /**
     * 检测读
     *
     * @param isSure isSure
     * @param securityCode securityCode
     * @return boolean
     */
    private boolean checkRead(boolean isSure, String securityCode) {
        System.out.println("=========" + "当前验证码为:" + securityCode + "请输入验证码" + "=========");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = br.readLine();

            if (s.equals(securityCode)) {
                isSure = true;
                System.out.println("====" + "当前输入：" + s + "====");
                System.out.println("====" + "验证通过" + "====");
            } else {
                System.out.println("====" + "验证失败请重试,请从新输入" + "====");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return isSure;
    }
}
