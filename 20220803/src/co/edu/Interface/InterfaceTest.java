package co.edu.Interface;

public class InterfaceTest implements InterfaceSample{

	@Override
	public void test() {
		double a = InterfaceSample.PI;
	}

	@Override
	public int service() {
		return 0;
	}

}
