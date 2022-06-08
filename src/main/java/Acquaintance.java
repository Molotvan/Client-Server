public class Acquaintance {
//    String in;
//    String out;
    static String[] messages = {"Hello, pretty girl", "Whats your name?", "Nice to meet you, %s", "Are you married?"};
    static String[] script1 = {"OOPS, I`m late", "Well, anyway, I`m glad to see you", "Bye"};
    static String[] script2 = {"Brilliant, let`s have a date", "Where and when?", "OK, hope to meet you soon, bye"};
    public static String dialog(String in){
        String out = "";
        for(int i = 0; i < messages.length; i++){
            out = messages[i];
            if(in.equals("bye")){
                out = "bye";
                break;
            }else
            if(i == 1){
                out = (String.format(messages[2], in));

                i = 2;
            }
            if (in.equals("yes")){
                for (int j = 0; j <= script1.length; j++) {
                    out = script1[j];
                    if(in.equals("bye") || in.equals("goodbye")){
                        break;
                    };
                }
            }
            if (in.equals("no")){
                for (int j = 0; j <= script2.length; j++) {
                    out = script2[j];

                    if(in.equals("bye") || in.equals("goodbye")){
                        break;
                    };
                }
            }
        }
        return out;

    }
}
