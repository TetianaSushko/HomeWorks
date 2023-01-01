package FileAndConverter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface FileService {
    List<File> getFilesPath(Path path);
    void saveToFile(File file, boolean append, String data) throws IOException;
    String readFromFile(File path);
    boolean isFileFormat(File file, String ext);

    String getFileName(File file);

    Path getDirPath(String[] arguments);

    void saveConvertedFile(File file, File newFile, long timePeriod, long startSize, long fileSize, Path path) throws IOException;
}
