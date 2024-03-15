import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket client=new DatagramSocket();
        InetAddress ipAddress=InetAddress.getLocalHost();
        String str="Amayuru";
        byte[] buf=str.getBytes();

        DatagramPacket pac=new DatagramPacket(buf, buf.length,ipAddress,4222);
        client.send(pac);
        client.close();

    }
}
