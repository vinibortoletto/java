package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
  private static final String filePath = "/home/vini/Code/trybe/study/java/java-study/app/src/file/new-file.txt";

  public void close(FileWriter fileWriter, BufferedWriter bufferedWriter) {
    try {
      fileWriter.close();
      bufferedWriter.close();
    } catch(Exception error) {
      error.printStackTrace();
    }
  }

  public void create() {
    File file = new File(filePath);
    FileWriter fileWriter = null;
    BufferedWriter bufferedWriter = null;

    try {
      fileWriter = new FileWriter(file);
      bufferedWriter = new BufferedWriter(fileWriter);
      bufferedWriter.write("New file created.");
      bufferedWriter.flush();
    } catch (IOException error) {
      error.printStackTrace();
    } finally {
      this.close(fileWriter, bufferedWriter);
    }
  }

}
