import java.util.Arrays;
import java.util.List;

public class Main {

    private static final String PATH = "D://Alexey/JavaCore/Games";
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        List<String> dirPath = Arrays.asList(PATH + "/src", PATH + "/res", PATH + "/savegames", PATH + "/temp",
                PATH + "/src/main", PATH + "/src/test",
                PATH + "/res/drawables", PATH + "/res/vectors", PATH + "/res/icons");
        List<String> filePath = Arrays.asList(PATH + "/src/main/Main.java",
                PATH + "/src/main/Utils.java");
    }
}
