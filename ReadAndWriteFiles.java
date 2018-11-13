package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteFiles {


  public static void main(String args[]) throws IOException {

    File file = new File("test.txt");
    FileWriter fileWriter = new FileWriter(file);
    fileWriter.write("This is new file");
    fileWriter.flush();
    fileWriter.close();

    FileReader fileReader = new FileReader(file);
    BufferedReader br = new BufferedReader(fileReader);
    StringBuffer sb = new StringBuffer();

    String line;
    while((line = br.readLine()) !=null){
      sb.append(line);
      sb.append("\n");
    }
    fileReader.close();

    System.out.println(sb.toString());
  }

}
