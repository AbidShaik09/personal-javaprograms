import java.io.FileInputStream;
import java.io.IOException;
import java.util.Optional;

class FileReader{
    public static void main(String ... args) throws IOException {
        FileInputStream fis=null;
        try{
            
            fis = new FileInputStream("sample.txt");
            byte[] data = new byte[fis.available()];
            fis.read(data);
            System.out.println(new String(data));
        }
        catch(Exception e){

        }
        finally{
            Optional<FileInputStream> of = Optional.ofNullable(fis);
            if(of.isPresent())
            fis.close();
        }

    }
}