import java.io.File;

public class FileRecursive {
    public static void find(String path, String filename) {
        File folder = new File(path);

        if (!folder.isDirectory()) {//leaf
            return;
        }

        File[] listOfFiles = folder.listFiles();
        if (listOfFiles == null) {
            return;
        }

        for (File f : listOfFiles) {
            if (f.isFile()) {
                if (f.getName().equals(filename)) {//target
                    System.out.println("Found: " + f.getAbsolutePath());
                }
            }
            else if (f.isDirectory()) {//one more folder
                find(f.getAbsolutePath(), filename);
            }
        }
    }
}

