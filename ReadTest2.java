package parameterization;

import java.io.FileInputStream;
import com.vel.test.Configurations;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTest2 {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(Configurations.excelsheetpath);
		Sheet sh= WorkbookFactory.create(file).getSheet("sheet1");
		int len=sh.getRow(0).getLastCellNum();
		for(int i=0; i<=len-1; i++) {
			String test=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(test);
		}
	}

}
