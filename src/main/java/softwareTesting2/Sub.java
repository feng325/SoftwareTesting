package softwareTesting2;

public class Sub {
	public double[][] sub(double[][] class_average, double[] grade_average) {
		double[][] sub_average = new double[7][9];
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 9; j++) {
				sub_average[i][j] = class_average[i][j]-grade_average[j];
			}
		}
		return sub_average;
	}
}
