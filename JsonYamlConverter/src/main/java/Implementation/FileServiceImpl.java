package Implementation;

import FileAndConverter.FileService;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FileServiceImpl implements FileService {

    @Override
    public String getFileName(File file) {
        return file.getName().split("\\.")[0];
    }

    @Override
    public List<File> getFilesPath(Path path) {
        File file = new File(String.valueOf(path));
        List<File> filePath = new ArrayList<>();
        if (file.isDirectory()) {
            filePath = Arrays.asList(Objects.requireNonNull(path.toFile().listFiles()));
        }
        return getValid(filePath, List.of("json","yaml"));
    }

    @Override
    public Path getDirPath(String[] args) {
        Path path;
        if (args.length != 0) {
            path = Paths.get(args[0]);
        } else {
            path = FileSystems.getDefault().getPath("").toAbsolutePath();
        }
        System.out.println(path);
        return path;
    }

    private List<File> getValid(List<File> filesPath, List<String> extensions) {
        List<File> fileValidPath = new ArrayList<>();
        for (File s : filesPath) {
            for (String ext : extensions)
                if (s.getName().toLowerCase().endsWith(ext.toLowerCase())) {
                    fileValidPath.add(s);
                }
        }
        return fileValidPath;
    }

    @Override
    public void saveToFile(File file, boolean append, String data) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
        OutputStream outputStream =
                new FileOutputStream(file, append);
        outputStream.write(data.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public String readFromFile(File path){
        StringBuilder result = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(path);
            int i;
            while((i=fileReader.read())!=-1) {
                result.append(((char) i));
            }
//            System.out.println("");
//            System.out.print(result);
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result.toString();
    }

    public boolean isFileFormat(File file, String ext){
        return file.getName().toLowerCase().endsWith(ext.toLowerCase());
    }
    @Override
    public void saveConvertedFile(File file, File newFile, long timePeriod, long startSize, long fileSize, Path path) throws IOException {
        StringBuilder stringBuilderJson = new StringBuilder();
        stringBuilderJson.append(file.getName())
                .append(" - - > ")
                .append(newFile.getName()).append(", ")
                .append(timePeriod).append(", ")
                .append(startSize).append(", ")
                .append(fileSize).append(";");
        System.out.print(stringBuilderJson);
        saveToFile(new File(path.toString(), "result.log"), true, stringBuilderJson.toString().concat("\n"));
    }
}