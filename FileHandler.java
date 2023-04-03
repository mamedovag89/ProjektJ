import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileHandler implements Serializable {
    public void writeFile(String fileName, String fileType , FamilyTree list) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(
            new FileOutputStream(fileName + "." + fileType));
        out.writeObject(list);
        out.close();
    }

    public FamilyTree readFile(String fileName, String fileType ) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream (
            new FileInputStream(fileName + "." + fileType));
             FamilyTree myTree = (FamilyTree) inputStream.readObject();
             inputStream.close();
             return myTree;
                
            }
        
}
