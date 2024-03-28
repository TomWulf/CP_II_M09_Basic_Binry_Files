import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Tom Wulf Tom.Wulf@uc.edu
 */
public class ReadBinaryFile
{

        public static void main (String [] args)
        {

            File workingDirectory = new File(System.getProperty("user.dir"));
            Path inFile = Paths.get(workingDirectory.getPath() + "\\src\\data.bin");

            String name;
            long idNum;
            double mpg;

            try
            {
                FileInputStream inStream = new FileInputStream(inFile.toFile());
                DataInputStream input = new DataInputStream(inStream);

                    name = input.readUTF();
                    idNum = input.readLong();
                    mpg = input.readDouble();

                    inStream.close();

                    System.out.println (name + "  " + idNum + "  " + mpg);
            }
            catch (IOException e)
            {
                System.out.println (e.getMessage());
                e.printStackTrace();
                System.exit(0);
            }


        }

}
