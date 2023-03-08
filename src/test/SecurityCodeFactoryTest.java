
import org.enigma.ibatis.SecurityCodeFactory;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecurityCodeFactoryTest {

    @Test
    public void testCreateSecurityCode() {
        boolean isSure = false;

        while (!isSure) {

            String securityCode = SecurityCodeFactory.createSecurityCode();
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
        }

    }
}
