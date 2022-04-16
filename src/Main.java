import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final String PATH = "D://Alexey/JavaCore/Games";
    private static final StringBuilder SB = new StringBuilder();

    public static void main(String[] args) {
        List<String> dirPath = Arrays.asList(PATH + "/src", PATH + "/res", PATH + "/savegames", PATH + "/temp",
                PATH + "/src/main", PATH + "/src/test",
                PATH + "/res/drawables", PATH + "/res/vectors", PATH + "/res/icons");
        List<String> filePath = Arrays.asList(PATH + "/src/main/Main.java",
                PATH + "/src/main/Utils.java");

        for (String dir : dirPath) {
            File dirs = new File(dir);
            writeToTheSB(dirs, dirs.mkdir());
        }

        for (String file : filePath) {
            File files = new File(file);
            try {
                writeToTheSB(files, files.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        writeToTheFile(new File(PATH + "/temp/temp.txt"));
    }

    private static void writeToTheSB(File file, boolean result) {
        SB.append(file.isDirectory() ? "Каталог " : "Файл ")
                .append(file.getName())
                .append(result ? " создан" : " не создан")
                .append(!result && file.exists() ? ", потому что уже существует!" : "")
                .append(!result && !file.exists() ? ", потому что не верно указан путь!" : "")
                .append("\n");
    }

    private static void writeToTheFile(File file) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(SB.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
