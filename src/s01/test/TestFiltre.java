package s01.test;

import java.io.File;
import java.io.FilenameFilter;

public class TestFiltre implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		return name.matches("(.+?).(jpg|jpeg|png|gif)$");
	}

}
