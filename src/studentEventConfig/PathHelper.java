package studentEventConfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/************************************************************************************/
public class PathHelper {
	public static FileInputStream fis = null;      // fis = file input stream
    public static File f = new File(".");
    public static String path=(f.getAbsolutePath().substring(0,f.getAbsolutePath().length()-1))+"src\\";
    
/***********************************************************************************/    
	static {
		
	    f = new File(".");
	    System.out.println("______________________________________________________");
	    System.out.println("------------------Project Path is here----------------\n");
		String path1=path+"db.properties";
		System.out.println(path);
	    try {
			fis = new FileInputStream(path1);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
/************************************************************************************/
}
