import java.net.*;
import java.io.*;

public class ClientChat {
    public static void main(String[] args)
            throws Exception {

        Socket socket =
            new Socket("localhost",5000);

        PrintWriter pw =
            new PrintWriter(
                socket.getOutputStream(),true);

        BufferedReader br =
            new BufferedReader(
                new InputStreamReader(
                    socket.getInputStream()));

        pw.println("Hello Server");

        System.out.println(br.readLine());

        socket.close();
    }
}
