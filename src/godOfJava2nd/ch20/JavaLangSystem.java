package godOfJava2nd.ch20;

public class JavaLangSystem {
	public static void main(String[] args) {
		JavaLangSystem sample = new JavaLangSystem();
		sample.systemPropertiesCheck();
	}
	public void systemPropertiesCheck() {
		System.out.println("java.version="+System.getProperty("java.version"));
		System.out.println("JAVA_HOME="+System.getenv("JAVA_HOME"));
	}
}
