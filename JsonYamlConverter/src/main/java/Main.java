import FileAndConverter.ConverterService;
import FileAndConverter.FileService;
import Implementation.FileServiceImpl;
import Implementation.JsonConverterServiceImpl;
import Implementation.YamlConverterServiceImpl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    private final static String JSON = "json";
    private final static String YAML = "yaml";

    public static void main(String[] args) throws IOException {

        FileService fService = new FileServiceImpl();
        Path path = fService.getDirPath(args);

        List<File> filesList = fService.getFilesPath(path);
        System.out.println(filesList);
        ConverterService json = new JsonConverterServiceImpl();
        ConverterService yaml = new YamlConverterServiceImpl();

        File theDir = new File(path.toString(), "/converted");
        if (!theDir.exists())
            theDir.mkdirs();


            for (File file : filesList) {
                if (fService.isFileFormat(file, ".yaml")) {
                    String resultFromYalmToJson = yaml.convert(fService.readFromFile(file));
                    File newFile = new File(theDir, fService.getFileName(file) + ".json");
                    fService.saveToFile(newFile, false, resultFromYalmToJson);

                    long yamlStartTime = System.nanoTime();
                    long yamlStartSize = Files.size(file.toPath());
                    long jsonFileSize = Files.size(newFile.toPath());
                    long timePeriod = System.nanoTime() - yamlStartTime;

                    fService.saveConvertedFile(file, newFile, timePeriod, yamlStartSize,jsonFileSize, path);

                } else if (fService.isFileFormat(file, ".json")) {
                    String resultFromJsonToYaml = json.convert(fService.readFromFile(file));
                    File newFile = new File(theDir, fService.getFileName(file) + ".yaml");
                    fService.saveToFile(newFile , false, resultFromJsonToYaml);

                    long jsonStartTime = System.nanoTime();
                    long jsonStartSize = Files.size(file.toPath());
                    long yamlFileSize = Files.size(newFile.toPath());
                    long timePeriod = System.nanoTime() - jsonStartTime;

                    fService.saveConvertedFile(file, newFile, timePeriod, jsonStartSize, yamlFileSize, path);
                }
            }
        }
    }
