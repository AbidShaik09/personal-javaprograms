import java.io.File;
import java.io.FileOutputStream;

public class FileWriter {
    
    public static FileOutputStream fos ;
    public static void main (String[] args){
        File f = new File("sample.txt");
        if(f.exists()){

        }
        else{
            try{
                
            fos = new FileOutputStream(f, true);
            fos.write("This was written By AI".getBytes());
            
            }
            catch (Exception e){

            }finally{
                try{
                    
                fos.close();
                }
                catch(Exception e){

                }
            }
        }
    }
}
