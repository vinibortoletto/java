package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
  private static final String filePath = "/home/vini/Code/trybe/study/java/java-study/app/src/file/text.txt";

  private void closeFile(FileReader fileReader, BufferedReader bufferedReader) {
    try {
      fileReader.close();
      bufferedReader.close();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
  
  public void readFile() {
    File file = new File(filePath);
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;

    if (file.exists()) {
      try {
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);

        String fileContent = bufferedReader.readLine();

        while(fileContent != null) {
          System.out.println(fileContent);
          fileContent = bufferedReader.readLine();
        }
      } catch(IOException e) {
        e.printStackTrace();
      } finally {
        this.closeFile(fileReader, bufferedReader);
      }
    }
  }

 
}
