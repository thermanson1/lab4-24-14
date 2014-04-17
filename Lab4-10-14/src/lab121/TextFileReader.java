

package lab121;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Teraesa
 */
public class TextFileReader implements FileReaderStrategy {
    @Override
    public List<String> readAll(String path) throws FileNotFoundException, IOException {
        List<String> lines = new ArrayList<String>();
        File file = new File(path);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        try {
        

        String line = reader.readLine();
        while (line != null) {
            lines.add(line);
            line = reader.readLine();
        }
        } catch(IOException ioe){
            throw ioe;
        }finally {
           reader.close();
        }

        return lines;
    }
    
    private Reader FileReader(){
        throw new UnsupportedOperationException("Not supported");
    }
    private Reader FileReader(File file){
        throw new UnsupportedOperationException("Not supported");
    }
    
    
}
