package Lambda;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by SiyuanZeng's on 6/19/2016.
 */
public class PrintItself {

    public static void main(String[] args) throws IOException {
        String workingDir = System.getProperty("user.dir");
        System.out.println(workingDir);
        Path workingDirPath = FileSystems.getDefault().getPath(workingDir);

        String classFileName = PrintItself.class.getName().replace('.', '/') +
                ".java";

        System.out.println(classFileName);

        int maxDepth = 4;// Depth of directory!!!!!

        Files.find(workingDirPath, maxDepth, (filename, attributes)-> filename.endsWith(classFileName))
        .forEach(
                path -> {
                    try {
                        Files.lines(path).forEach(System.out::println);
                    } catch (Exception e) {
                    }
                }
        );
    }

}
