import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {

    public static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    public static BufferedReader reader = new BufferedReader(inputStreamReader);

    public static Display display = new Display();

    public void run()
    {
        boolean flagRun = true;
        int input = 0;

        while(flagRun)
        {
            try
            {
                display.MenuOptions();
                input = Integer.parseInt(reader.readLine());

                switch(input)
                {
                    case 1:
                        System.out.println("Character has been created");
                        Thread.sleep(750);
                        break;
                    case 9:
                        flagRun = false;
                        break;
                }

            }
            catch (IOException ioe)
            {

            }
            catch (InterruptedException ie)
            {

            }
        }
    }
}
