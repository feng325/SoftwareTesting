package softwareTesting2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] subject = { "����", "��ѧ", "Ӣ��", "����", "��ʷ", "����", "����", "����", "��ѧ" }; // ��Ŀ���
		Student[] student = new Student[332];
		ReadCsv readCsv = new ReadCsv();
		double[][] score = readCsv.readCsv(student);
		int i, j;
		
		double[] grade_average = new double[9];
		Average average = new Average();
		grade_average = average.gradeAverage(score);
		System.out.println("�꼶ƽ���֣�");
		for (i = 0; i < 9; i++) {
			System.out.println(subject[i] + "��" + String.format("%.2f", grade_average[i]) + " ");
		}

		// �༶ƽ����
		double[][] class_average = new double[7][9];
		class_average = average.classAverage(student, score);
		System.out.println();
		System.out.println("�༶ƽ���֣�");
		System.out.print("        ");
		for (i = 0; i < 9; i++)
			System.out.print("   " + subject[i] + "   ");
		System.out.println();
		String[] cla = {"һ��","����","����","�İ�","���","����","�߰�"};
		for (i = 0; i < 7; i++) {
			System.out.print(cla[i]+"��");
			for (j = 0; j < 9; j++)
				System.out.print(String.format("%.2f", class_average[i][j]) + " ");
			System.out.println();
		}
		
		//���༶����Ŀƽ�������꼶ƽ���ֵıȽ�
//		Sub sub = new Sub();
		double[][] sub_average = new double[7][9];
		sub_average = average.sub(class_average, grade_average);
		System.out.println();
		System.out.println("�༶ƽ�������꼶ƽ���ֵıȽϣ�");
		System.out.print("        ");
		for (i = 0; i < 9; i++)
			System.out.print("   " + subject[i] + "   ");
		System.out.println();
		for (i = 0; i < 7; i++) {
			System.out.print(cla[i]+"��");
			for (j = 0; j < 9; j++) {
				if(sub_average[i][j] > 0)
					System.out.print(String.format("+%.2f", sub_average[i][j]) + " ");
				else if(sub_average[i][j] < 0)
					System.out.print(String.format("%.2f", sub_average[i][j]) + " ");
			}
			System.out.println();
		}
	}

}
