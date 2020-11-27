package softwareTesting2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class ReadCsv {
	public double[][] readCsv(Student[] student) {
		double[][] score = new double[332][9];
		try {
			DataInputStream in = new DataInputStream(new FileInputStream(new File("C:\\Users\\18256\\Desktop\\score1.csv")));
			BufferedReader br= new BufferedReader(new InputStreamReader(in,"utf-8"));
			Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(br);
			int i = 0;
			for (CSVRecord record : records) {
				student[i] = new Student();
				student[i].setName(record.get("姓名"));
				student[i].setSex(record.get("性别"));
				student[i].setCla(record.get("班级"));
//				student[i].setChinese(Integer.parseInt(record.get("语文")));
				score[i][0] = Integer.parseInt(record.get("语文"));
//				student[i].setMath(Integer.parseInt(record.get("数学")));
				score[i][1] = Integer.parseInt(record.get("数学"));
				score[i][2] = Integer.parseInt(record.get("英语"));
				score[i][3] = Integer.parseInt(record.get("物理"));
				score[i][4] = Integer.parseInt(record.get("历史"));
				score[i][5] = Integer.parseInt(record.get("地理"));
				score[i][6] = Integer.parseInt(record.get("政治"));
				score[i][7] = Integer.parseInt(record.get("生物"));
				score[i][8] = Integer.parseInt(record.get("化学"));
//				score[i] = temp;
//				student[i].setEnglish(Integer.parseInt(record.get("英语")));
//				student[i].setPhysics(Integer.parseInt(record.get("物理")));
//				student[i].setHistory(Integer.parseInt(record.get("历史")));
//				student[i].setGeography(Integer.parseInt(record.get("地理")));
//				student[i].setPolitics(Integer.parseInt(record.get("政治")));
//				student[i].setBiology(Integer.parseInt(record.get("生物")));
//				student[i].setChemistry(Integer.parseInt(record.get("化学")));
				i++;
//				System.out.print(record.get("姓名") + " ");
//				System.out.print(record.get("性别") + " ");
//				System.out.print(record.get("班级") + " ");
//				System.out.print(record.get("语文") + " ");
//				System.out.print(record.get("数学") + " ");
//				System.out.print(record.get("英语") + " ");
//				System.out.print(record.get("物理") + " ");
//				System.out.print(record.get("历史") + " ");
//				System.out.print(record.get("地理") + " ");
//				System.out.print(record.get("政治") + " ");
//				System.out.print(record.get("生物") + " ");
//				System.out.print(record.get("化学") + " ");
//				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return score;
	}
}
