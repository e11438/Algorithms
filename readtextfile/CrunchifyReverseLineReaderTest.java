import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
 
/**
 * @author Crunchify.com
 */
 
public class CrunchifyReverseLineReaderTest {
 
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/Weerasooriya/Documents/file1.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		for (int i = 0; i <= 10; i++) {
			// Adding line from 1 to 10
			raf.writeBytes("Adding Line " + i + "\n");
		}
		raf.close();
 
		// Simple way to read file without Reversing
		FileReader logReader = new FileReader("/Users/Weerasooriya/Documents/file1.txt");
        BufferedReader buffer = new BufferedReader(logReader);
        System.out.println("Simple way to read file without Reversing - from 1 to 10");
        for (String line1 = buffer.readLine(); line1 != null; line1 = buffer.readLine()) {
            System.out.println(line1);
        }
 
        // Reading file in reverse order.. Will return line from 10 to 1
		CrunchifyReverseLineReaderCore reader = new CrunchifyReverseLineReaderCore(
				file, "UTF-8");
        String line;
        System.out.print("\nReading file in reverse order - from 10 to 1");
        while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}
}