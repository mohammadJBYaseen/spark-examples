import org.junit.Test;
import org.sparkexample.WordCountTask;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class WordCountTaskTest {
  @Test
  public void test() throws URISyntaxException {
    String inputFile = getClass().getResource("loremipsum.txt").toURI().toString();
    try {
      new WordCountTask().run(inputFile,getClass().getResource(".").toURI().toString());
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
