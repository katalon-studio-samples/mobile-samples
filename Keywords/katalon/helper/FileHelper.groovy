package katalon.helper

public class FileHelper {
	static String getFileExtension(String filename){
		if(filename.lastIndexOf('.') > 0){
			return filename.substring(filename.lastIndexOf('.') + 1)
		}
		return ""
	}
}
