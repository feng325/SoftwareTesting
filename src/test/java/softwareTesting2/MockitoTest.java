package softwareTesting2;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import org.mockito.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

//@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

	@Mock
	private Average mockAverage;

	@InjectMocks
	private Average average = new Average();

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test01() {
		
//		Student[] student = new Student[10];
		double[] grade = new double[9];

		double[][] score = { { 50, 60, 70, 80, 90, 50, 60, 70, 80 }, { 50, 60, 70, 80, 90, 50, 60, 70, 80 },
				{ 50, 60, 70, 80, 90, 50, 60, 70, 80 }, { 50, 60, 70, 80, 90, 50, 60, 70, 80 },
				{ 50, 60, 70, 80, 90, 50, 60, 70, 80 }, { 50, 60, 70, 80, 90, 50, 60, 70, 80 },
				{ 50, 60, 70, 80, 90, 50, 60, 70, 80 }, { 50, 60, 70, 80, 90, 50, 60, 70, 80 },
				{ 50, 60, 70, 80, 90, 50, 60, 70, 80 }, { 50, 60, 70, 80, 90, 50, 60, 70, 80 } };
		double[] grade_average = { 50, 60, 70, 80, 90, 50, 60, 70, 80 };
		
//		Average mock = mock(Average.class);
		when(mockAverage.gradeAverage(score)).thenReturn(grade_average);
// 		for(int i=0;i<9;i++) {
// 			mock
// 		}
//		double[][] class_average = 
//		double[][] grade_average = 
//		when(mockAverage.sub(class_average, grade_average)).thenReturn("fdas");
//		String methodA = mockAverage.sub(class_average, grade_average)();
//		System.out.println(methodA);
	}

}
