import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Terminal {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("$ ");
            String command = null;
            try {
                command = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (command.equals("exit")) {
                break;
            }

            try {
                Process process = Runtime.getRuntime().exec(command);
                BufferedReader processReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

                String line;
                while ((line = processReader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}