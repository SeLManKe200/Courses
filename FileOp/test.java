 package FileOp;
import java.io.*;
 
public class test {
    public static void main(String[] args) throws IOException {
        File file = new File("kod.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        String val = "Merhabalar";
        FileWriter fWriter = new FileWriter(file,false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write(val);
        bWriter.write("\nJAVA");
        bWriter.close();

        FileReader fileReader = new FileReader(file);
        String line;
        BufferedReader bReader = new BufferedReader(fileReader);
        while((line=bReader.readLine())!= null){
            System.out.println(line);
        }
        bReader.close();


    }
    
}
