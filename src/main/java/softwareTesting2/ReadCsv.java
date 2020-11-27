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
				student[i].setName(record.get("����"));
				student[i].setSex(record.get("�Ա�"));
				student[i].setCla(record.get("�༶"));
//				student[i].setChinese(Integer.parseInt(record.get("����")));
				score[i][0] = Integer.parseInt(record.get("����"));
//				student[i].setMath(Integer.parseInt(record.get("��ѧ")));
				score[i][1] = Integer.parseInt(record.get("��ѧ"));
				score[i][2] = Integer.parseInt(record.get("Ӣ��"));
				score[i][3] = Integer.parseInt(record.get("����"));
				score[i][4] = Integer.parseInt(record.get("��ʷ"));
				score[i][5] = Integer.parseInt(record.get("����"));
				score[i][6] = Integer.parseInt(record.get("����"));
				score[i][7] = Integer.parseInt(record.get("����"));
				score[i][8] = Integer.parseInt(record.get("��ѧ"));
//				score[i] = temp;
//				student[i].setEnglish(Integer.parseInt(record.get("Ӣ��")));
//				student[i].setPhysics(Integer.parseInt(record.get("����")));
//				student[i].setHistory(Integer.parseInt(record.get("��ʷ")));
//				student[i].setGeography(Integer.parseInt(record.get("����")));
//				student[i].setPolitics(Integer.parseInt(record.get("����")));
//				student[i].setBiology(Integer.parseInt(record.get("����")));
//				student[i].setChemistry(Integer.parseInt(record.get("��ѧ")));
				i++;
//				System.out.print(record.get("����") + " ");
//				System.out.print(record.get("�Ա�") + " ");
//				System.out.print(record.get("�༶") + " ");
//				System.out.print(record.get("����") + " ");
//				System.out.print(record.get("��ѧ") + " ");
//				System.out.print(record.get("Ӣ��") + " ");
//				System.out.print(record.get("����") + " ");
//				System.out.print(record.get("��ʷ") + " ");
//				System.out.print(record.get("����") + " ");
//				System.out.print(record.get("����") + " ");
//				System.out.print(record.get("����") + " ");
//				System.out.print(record.get("��ѧ") + " ");
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
