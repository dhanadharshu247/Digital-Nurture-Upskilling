import java.net.*;
import java.io.*;

public class ServerChat {
    public static void main(String[] args)
            throws Exception {

        ServerSocket server =
            new ServerSocket(5000);

        Socket socket = server.accept();

        BufferedReader br =
            new BufferedReader(
                new InputStreamReader(
                    socket.getInputStream()));

        PrintWriter pw =
            new PrintWriter(
                socket.getOutputStream(),true);

        System.out.println(br.readLine());

        pw.println("Hello Client");

        socket.close();
        server.close();
    }
}
