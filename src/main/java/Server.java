import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        String[] msgs = {"Hello", "Goodbye","a", "d", "end"};
        String[] messages = {"Hello, pretty girl", "Whats your name?", "Nice to meet you, %s", "Are you married? Write 'yes' or 'no'"};
        String[] script1 = {"OOPS, I`m late", "Well, anyway, I`m glad to see you", "bye"};
        String[] script2 = {"Brilliant, let`s have a date", "Where and when?", "OK, hope to meet you soon, bye"};
    try(ServerSocket serverSocket = new ServerSocket(8089);
    Socket clientSocket = serverSocket.accept();
    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))){
        System.out.println("New connection accepted");
        for(String msg : msgs){
            out.println(msg);
            in.readLine();
        }
//        out.println("If you want to break, write 'bye'");
//        while(true){
//        out.println(Acquaintance.dialog(in.readLine()));
//        }
//        for(int i = 0; i < messages.length; i++){
//            out.println(messages[i]);
//            String answer = in.readLine();
//            if(answer.equals("bye")){
//                out.println("bye");
//                break;
//            }else
//            if(i == 1){
//                out.println(String.format(messages[2], answer));
//                in.readLine();
//                i = 2;
//            }
//            if (answer.equals("yes")){
//                for (int j = 0; j <= script1.length; j++) {
//                    out.println(script1[j]);
//                    String answer1 = in.readLine();
//                    if(answer1.equals("bye") || answer1.equals("goodbye")){
//                        break;
//                    };
//                }
//            }
//            if (answer.equals("no")){
//                for (int j = 0; j <= script2.length; j++) {
//                    out.println(script2[j]);
//                    String answer2 = in.readLine();
//                    if(answer2.equals("bye") || answer2.equals("goodbye")){
//                        break;
//                    };
//                }
//            }
//        }
    }
    catch (IOException e){
        e.getMessage();
    }
    }
}
