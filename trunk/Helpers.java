// $Id: Helpers.java 71 2012-01-17 11:13:53Z rutgervanaalst $

import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;

public abstract class Helpers  
{
	public static String[] dirContents(File path)
	{
		String[] files = path.list();
		Arrays.sort(files);
		return files;
	}
	
	public static File[] dirContents(File path, String[] extensions)
	{	
		class ExtOnly implements FilenameFilter
		{
			private String[] exts;
			
			public ExtOnly(String[] exts)
			{
				this.exts = exts;
			}
			
			public boolean accept(File dir, String name)
			{
				for (String s : this.exts)
				{
					if (name.endsWith(s))
						return true;
				}
				return false;
			}
		}
		
		FilenameFilter ff = new ExtOnly(extensions);
 		return path.listFiles(ff);
	}
}
