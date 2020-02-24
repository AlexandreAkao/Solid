package SRP;

import java.io.PrintStream;
import java.net.URL;

public class HandleFile {
    public void save(Journal journal, String filename) throws Exception {
        try (PrintStream out = new PrintStream(filename))
        {
            out.println(journal.toString());
        }
    }

    public void load(String filename) {}
    public void load(URL url) {}
}
