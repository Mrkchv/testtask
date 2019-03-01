package servlet;

import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

public class HashPass {
    public String getHash(String inputString) throws Exception{
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(inputString.getBytes());
        byte[] digestedByte = messageDigest.digest();
        return DatatypeConverter.printHexBinary(digestedByte).toLowerCase();
    }
    
    public String getHash(byte[] inputBytes) throws Exception{
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(inputBytes);
        byte[] digestedByte = messageDigest.digest();
        return DatatypeConverter.printHexBinary(digestedByte).toLowerCase();
    }
}
