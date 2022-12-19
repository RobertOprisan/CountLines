import java.io.*;

class CountLinesMain {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: CountLines <file name>");
            System.exit(1);
        }
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(args[0]));
        } catch (FileNotFoundException ex) {
            System.err.println("File " + args[0] + " not found");
        } finally {
            if (in != null);
            in.close();
        }


    }
}