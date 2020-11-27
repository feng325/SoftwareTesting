package softwareTesting2;

import junit.framework.TestCase;

public class AverageTest extends TestCase {

	private Average average = new Average();
	private Student[] student = new Student[10];
	double[] grade = new double[9];

	private double[][] score = { { 50, 60, 70, 80, 90, 50, 60, 70, 80 }, { 50, 60, 70, 80, 90, 50, 60, 70, 80 },
			{ 50, 60, 70, 80, 90, 50, 60, 70, 80 }, { 50, 60, 70, 80, 90, 50, 60, 70, 80 },
			{ 50, 60, 70, 80, 90, 50, 60, 70, 80 }, { 50, 60, 70, 80, 90, 50, 60, 70, 80 },
			{ 50, 60, 70, 80, 90, 50, 60, 70, 80 }, { 50, 60, 70, 80, 90, 50, 60, 70, 80 },
			{ 50, 60, 70, 80, 90, 50, 60, 70, 80 }, { 50, 60, 70, 80, 90, 50, 60, 70, 80 } };

	protected void setUp() throws Exception {

		// Create student
		for (int i = 0; i < 10; i++) {
			student[i] = new Student();
		}

		student[0].setCla("һ��");
		student[1].setCla("����");
		student[2].setCla("�߰�");
		student[3].setCla("���");
		student[4].setCla("����");
		student[5].setCla("һ��");
		student[6].setCla("һ��");
		student[7].setCla("�İ�");
		student[8].setCla("����");
		student[9].setCla("���");

	}

	public void testGradeAverage() {
		assertEquals(50.0, average.gradeAverage(score)[0]);
		assertEquals(60.0, average.gradeAverage(score)[1]);
		assertEquals(70.0, average.gradeAverage(score)[2]);
		assertEquals(80.0, average.gradeAverage(score)[3]);
	}

	public void testClassAverage() {
		assertEquals(50.0, average.classAverage(student, score)[0][0]);
		assertEquals(60.0, average.classAverage(student, score)[1][1]);
		assertEquals(70.0, average.classAverage(student, score)[2][2]);
		assertEquals(80.0, average.classAverage(student, score)[3][3]);
	}

	public void testSub() {
		double[][] class_average = new double[7][9];
		class_average = average.classAverage(student, score);
//		double[] grade_average = { 48, 61, 73, 78, 70, 60, 59, 71, 80 };
		double[] grade_average = new double[9];
		grade_average = average.gradeAverage(score);
		assertEquals(0.0, average.sub(class_average, grade_average)[0][0]);
		assertEquals(0.0, average.sub(class_average, grade_average)[0][1]);
		assertEquals(0.0, average.sub(class_average, grade_average)[3][5]);
	}

}
