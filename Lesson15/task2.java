package Files;
 
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
 
 
public class task2 {
    private static BufferedReader br = null;
    private static String SourceText = null;
    private static String str = null;
    private static String Delimiters = ".!?...";
    private static StringTokenizer st = null;
    private static ArrayList<String> text = new ArrayList(10);
    private static ArrayList<String> centence = new ArrayList(15);
 
    public static void main(String[] args) {
        
        try{ File file =new File("D:\\text1.txt");
        FileInputStream is = new FileInputStream(file);
            BufferedReader d = new BufferedReader(new InputStreamReader(is));
                SourceText =d.readLine();
        } catch (IOException e)
       {
            
        }
   
                st = new StringTokenizer(SourceText, Delimiters);
       
        while (st.hasMoreTokens()){
            str = st.nextToken();
            text.add(str);
        }
        
        for (String s : text){
            System.out.println("Было в файле: "+s);
            System.out.print('\n');
        }
        
        try{
            
                        File file =new File("D:\\text.txt");
                        
        FileInputStream is = new FileInputStream(file);
        BufferedReader d = new BufferedReader(new InputStreamReader(is));
        
                    SourceText = d.readLine();
            replaceWords();
        } catch (IOException e){
           
       }
 
    }
 
    private static void replaceWords(){
        for (String s : text){
                        st = new StringTokenizer(s, " ,:;");
                        while (st.hasMoreTokens()){
                str = st.nextToken();
                centence.add(str);
            }
                        String temp = centence.get(0);
            int LastElementIndex = centence.size() - 1;
            String lastWord = centence.get(LastElementIndex);
            centence.set(0, lastWord);
            centence.set(LastElementIndex, temp);
            System.out.print("Стало: ");
                       for (String i : centence){
                             
                System.out.print(i.concat(" "));
            }
            System.out.print('\n');
        }
    }
}
