package chess;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Login{
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private ObjectInputStream inputStream;
    private ObjectOutputStream outputStream;

    public void start(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started. Waiting for clients...");

            // Chấp nhận kết nối từ máy khách
            clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            // Khởi tạo luồng đầu vào và đầu ra để giao tiếp với máy khách
            inputStream = new ObjectInputStream(clientSocket.getInputStream());
            outputStream = new ObjectOutputStream(clientSocket.getOutputStream());
            Login login = new Login(); // Tạo đối tượng Login
                outputStream.writeObject(login);
                outputStream.flush();
            // Xử lý yêu cầu từ máy khách
            handleClientRequests();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Đóng các kết nối và giải phóng tài nguyên
            try {
                if (outputStream != null)
                    outputStream.close();
                if (inputStream != null)
                    inputStream.close();
                if (clientSocket != null)
                    clientSocket.close();
                if (serverSocket != null)
                    serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void handleClientRequests() throws IOException {
        // Đọc yêu cầu từ máy khách và gửi phản hồi
        try {
            while (true) {
                String clientMessage = (String) inputStream.readObject();
                System.out.println("Received message from client: " + clientMessage);

                // Xử lý yêu cầu từ máy khách
                String response = processClientRequest(clientMessage);

                // Gửi phản hồi cho máy khách
                outputStream.writeObject(response);
                outputStream.flush();
                System.out.println("Sent response to client: " + response);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String processClientRequest(String request) {
        // Xử lý yêu cầu từ máy khách ở đây
        // Trả về phản hồi dựa trên yêu cầu của máy khách
        return "Response to client: " + request;
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start(1232);
    }
}
