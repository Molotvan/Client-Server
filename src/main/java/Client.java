import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String host = "netology.homework";
        int port = 8089;
        Scanner scanner = new Scanner(System.in);
        try(Socket clientSocket = new Socket(host, port);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))){
            String question = "";
            System.out.println(in.readLine());
            while(!(question.contains("bye"))){
                question = in.readLine();
                System.out.println(question);
                out.println(scanner.nextLine());
            }
        }catch (IOException e){
            e.getMessage();
        }
    }
}
