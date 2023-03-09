import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Executoradetestes {
	public static void main(String[] args) {
		Result resultado = JUnitCore.runClasses(JunitTestSuite.class);
		for (Failure failure : resultado.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(resultado.wasSuccessful());
	}
}