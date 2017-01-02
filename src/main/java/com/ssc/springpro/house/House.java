package com.ssc.springpro.house;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class House {
	
	public void saveToFile(HouseInfRepository repository,String fileName) throws IOException{
		File file = new File(fileName);
		if(!file.exists())
			file.createNewFile();
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
		
		for(HouseInf inf:repository.findAll()){
			bWriter.write(inf.toString());
			bWriter.newLine();
		}
		bWriter.flush();
		
		bWriter.close();
	}
}
