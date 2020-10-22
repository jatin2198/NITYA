import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Comparator;

public class ReadFiles  {

	public static void main(String[] args) throws IOException {
	
		File filesPath=new File("F://ReadMe");
		

		File filelist[]=filesPath.listFiles();

	Arrays.sort(filelist, new Comparator<File>() {

		@Override
		public int compare(File arg0, File arg1) {
			File file1=(File) arg0;
			File file2=(File) arg1;
			long l1 = 0,l2 = 0;
			try {
				l1=getCreationdate(file1);
				 l2=getCreationdate(file2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			  return Long.valueOf(l1).compareTo(l2);
		}} );
		for(File file : filelist) {
						
			long m = getCreationdate(file);
	          Instant instant = Instant.ofEpochMilli(m);
	          LocalDateTime date = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
	          System.out.println(date+" - "+file.getName());
		}
	}

	
	
	public static long getCreationdate(File file) throws IOException {
		
		
			BasicFileAttributes attr = Files.readAttributes(file.toPath(),
			        BasicFileAttributes.class);
			
			return attr.creationTime().toInstant().toEpochMilli();
			
	
		
		
		
	}

}
