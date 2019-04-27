package godOfJava2nd.ch21;

public class CarWildcardSample {
	public static void main(String[] args) {
		CarWildcardSample sample = new CarWildcardSample();
		sample.callBoundedWildcardMethod();
	}
	public void callBoundedWildcardMethod() {
		WildcardGeneric<Car> wildcard = new WildcardGeneric<>();
		wildcard.setWildcard(new Car("Mustang"));
		boundedWildcardMethod(wildcard);
		
		wildcard.setWildcard(new Bus("Daewoo"));
		boundedWildcardMethod(wildcard);
		
	}
	public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
		Car car = c.getWildcard();
		System.out.println(car);
	}

}
