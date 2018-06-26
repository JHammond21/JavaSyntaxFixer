import java.io.*;
import java.util.ArrayList;
public class ReadFile {
    public static ArrayList<String> readFile(File file) throws IOException {

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assert fileReader != null;
        BufferedReader reader = new BufferedReader(fileReader);

        String line;
        ArrayList<String> list = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            list.add(line);
            System.out.println(line);
        }
        reader.close();
        return list;
    }
    


}
