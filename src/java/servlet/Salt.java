package servlet;

import java.security.SecureRandom;

public class Salt {
    public byte[] getSalt(){
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[10];
        random.nextBytes(bytes);
        return bytes;
    }
}
