package softwareTesting2;

import org.apache.commons.math3.stat.descriptive.moment.Mean;

public class Average {
	public double[] gradeAverage(double[][] score) {
		int i, j;
		int len = score.length;
		double[][] score_reverse = new double[9][len];
		for (i = 0; i < 9; i++) {
			for (j = 0; j < len; j++) {
				score_reverse[i][j] = score[j][i];
			}
		}

		Mean grade = new Mean();
		double[] grade_average = new double[9];
		for (i = 0; i < 9; i++) {
			grade_average[i] = grade.evaluate(score_reverse[i]);
		}
		return grade_average;
	}

	public double[][] classAverage(Student[] student, double[][] score) {
		int i1 = 0, i2 = 0, i3 = 0, i4 = 0, i5 = 0, i6 = 0, i7 = 0;
		double[][][] class_score = new double[7][9][50];
		for (int i = 0; i < student.length; i++) {
			if (student[i].getCla().equals("Ò»°à")) {
				for (int j = 0; j < 9; j++)
					class_score[0][j][i1] = score[i][j];
				i1++;
			} else if (student[i].getCla().equals("¶þ°à")) {
				for (int j = 0; j < 9; j++)
					class_score[1][j][i2] = score[i][j];
				i2++;
			} else if (student[i].getCla().equals("Èý°à")) {
				for (int j = 0; j < 9; j++)
					class_score[2][j][i3] = score[i][j];
				i3++;
			} else if (student[i].getCla().equals("ËÄ°à")) {
				for (int j = 0; j < 9; j++)
					class_score[3][j][i4] = score[i][j];
				i4++;
			} else if (student[i].getCla().equals("Îå°à")) {
				for (int j = 0; j < 9; j++)
					class_score[4][j][i5] = score[i][j];
				i5++;
			} else if (student[i].getCla().equals("Áù°à")) {
				for (int j = 0; j < 9; j++)
					class_score[5][j][i6] = score[i][j];
				i6++;
			} else if (student[i].getCla().equals("Æß°à")) {
				for (int j = 0; j < 9; j++)
					class_score[6][j][i7] = score[i][j];
				i7++;
			}
		}

		Mean mean = new Mean();
		double[][] class1 = new double[9][i1];
		double[][] class2 = new double[9][i2];
		double[][] class3 = new double[9][i3];
		double[][] class4 = new double[9][i4];
		double[][] class5 = new double[9][i5];
		double[][] class6 = new double[9][i6];
		double[][] class7 = new double[9][i7];

		for (int i = 0; i < 9; i++)
			for (int j = 0; j < i1; j++)
				class1[i][j] = class_score[0][i][j];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < i2; j++)
				class2[i][j] = class_score[1][i][j];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < i3; j++)
				class3[i][j] = class_score[2][i][j];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < i4; j++)
				class4[i][j] = class_score[3][i][j];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < i5; j++)
				class5[i][j] = class_score[4][i][j];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < i6; j++)
				class6[i][j] = class_score[5][i][j];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < i7; j++)
				class7[i][j] = class_score[6][i][j];
		double[][] class_average = new double[7][9];

		for (int i = 0; i < 9; i++)
			class_average[0][i] = mean.evaluate(class1[i]);
		for (int i = 0; i < 9; i++)
			class_average[1][i] = mean.evaluate(class2[i]);
		for (int i = 0; i < 9; i++)
			class_average[2][i] = mean.evaluate(class3[i]);
		for (int i = 0; i < 9; i++)
			class_average[3][i] = mean.evaluate(class4[i]);
		for (int i = 0; i < 9; i++)
			class_average[4][i] = mean.evaluate(class5[i]);
		for (int i = 0; i < 9; i++)
			class_average[5][i] = mean.evaluate(class6[i]);
		for (int i = 0; i < 9; i++)
			class_average[6][i] = mean.evaluate(class7[i]);

		return class_average;
	}

	public double[][] sub(double[][] class_average, double[] grade_average) {
		double[][] sub_average = new double[7][9];
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 9; j++) {
				sub_average[i][j] = class_average[i][j] - grade_average[j];
			}
		}
		return sub_average;
	}

}
