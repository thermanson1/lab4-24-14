
package lab121;

import java.io.IOException;
import java.util.Collection;

/**
 *
 * @author Teraesa
 */
public class FileService {
    private TextFileReader reader;
    private ContactConverter converter;
    
    public Collection<Contact> readFile(String path) throws IOException{
        reader = new TextFileReader();
        converter = new ContactConverter();
        
        return converter.convertToCollection(true, reader.readAll(path));
    }
}
