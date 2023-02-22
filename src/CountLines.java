import java.io.*;
public class CountLines {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: CountLines <input file>");
            System.exit(1);
        }
        BufferedReader input = null;
        String line;
        int countLines = 0;
        try {
            input = new BufferedReader(new FileReader(args[0]));
            while ((line = input.readLine()) != null) {
                countLines++;
            }
            System.out.println("The file has " + countLines + " lines.");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("Error reading file");
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
