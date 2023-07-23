import java.io.*;
public class BufferedReader {
    public static void main(String args[]) throws Exception
    {
        String name;
        InputStreamReader I=new InputStreamReader(System.in);
        BufferedReader B=new BufferedReader();
        name=B.readLine();
        System.out.println(name);
    }
}