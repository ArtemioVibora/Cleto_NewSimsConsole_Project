import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {

    public static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    public static BufferedReader reader = new BufferedReader(inputStreamReader);

    public void run()
    {
        boolean flagRun = true;
        int input = 0;

        while(flagRun)
        {
            try
            {
                input = Integer.parseInt(reader.readLine());

            }
            catch (IOException ioe)
            {

            }
        }
    }
}
