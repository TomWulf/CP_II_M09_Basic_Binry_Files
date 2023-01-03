import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteBinaryFile
{


        public static void main (String [] args)
        {
            File workingDirectory = new File(System.getProperty("user.dir"));
            Path outFile = Paths.get(workingDirectory.getPath() + "\\src\\data.bin");

            String name = "Tom Wulf";
            long idNum = 123456789;
            double mpg = 38.5;

            try
            {
                FileOutputStream outStream = new FileOutputStream(outFile.toFile());
                DataOutputStream output = new DataOutputStream(outStream);

                output.writeUTF(name);
                output.writeLong(idNum);
                output.writeDouble(mpg);
                outStream.close();
                System.out.println("Wrote file to disk.");
            }
            catch (IOException e)
            {
                System.out.println (e.getMessage());
                e.printStackTrace();
                System.exit(0);
            }

        }
    }

