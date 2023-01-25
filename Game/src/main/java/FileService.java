
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {
    private String fileName = "ProcessGame.txt";

    public void createFile() {
        File file = new File(fileName);
        try {
            if (file.exists()){
                file.delete();
                file.createNewFile();
            }else {
                file.createNewFile();
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public void writeToFile(String text) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName,true));
            bufferedWriter.write(text + "\n");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
