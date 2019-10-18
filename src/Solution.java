import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите фразу, которую нужно зашифровать");
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String line = reader.readLine();
            System.out.println("Введите ключ для сдвига");
            int key = Integer.parseInt(reader.readLine());
            System.out.print("Шифр: ");
            System.out.println(encode(line, key));
        }
    }
    private static String encode(String line, int key)  {
        if (line == null) {
            return "";
        }
        else {
                StringBuilder stringBuilder = new StringBuilder();
                char[] chars = line.toCharArray();

                for (char c : chars) {
                     stringBuilder.append((char) (((int)c) + key));
                }
                return stringBuilder.toString();
            }
     }
}

