import GUI.Frame;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\Data\\text.txt");
        ArrayList<String> list = ReadFile.readFile(file);
        Frame frame = new Frame();
        frame.frame();
    }
}
