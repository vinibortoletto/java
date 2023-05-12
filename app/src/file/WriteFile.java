package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
  private static final String filePath = "/home/vini/Code/trybe/study/java/java-study/app/src/file/text.txt";

  private void closeFile(FileWriter fileWriter, BufferedWriter bufferedWriter) {
    try {
      fileWriter.close();
      bufferedWriter.close();
    }catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void writeFile() {
    File file = new File(filePath);
    FileWriter fileWriter = null;
    BufferedWriter bufferedWriter = null;

    try {
      fileWriter = new FileWriter(file);

      // Buffer will store text content in memory
      bufferedWriter = new BufferedWriter(fileWriter);

      // Writes content to buffer
      bufferedWriter.write("Another text line add.");

      // Finally, write content to actual file
      bufferedWriter.flush();
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      this.closeFile(fileWriter, bufferedWriter);
    }
  }
}
