import java.io.IOException;

public class KbIn {
    public static void main(String[] args) throws IOException{
            char ch;
            System.out.println("Press a key followed by ENTER:" +
                    " ");
            ch = (char) System.in.read();
            System.out.println("Your key id: " + ch);


    }
}
