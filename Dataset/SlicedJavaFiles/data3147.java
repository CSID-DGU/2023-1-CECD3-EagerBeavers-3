public class Main{	public static void main(String[] args) throws Exception {
		Class<?> here = new Object(){}.getClass().getEnclosingClass();
		try {
			String packageName = here.getPackage().getName();
			packageName = "src/" + packageName.replaceAll("\\.", "/") + "/";
			System.setIn(new FileInputStream(packageName + "input.txt"));
//			System.setOut(new PrintStream(new FileOutputStream(packageName + "output.txt")));
		} catch (FileNotFoundException e) {
		} catch (NullPointerException e) {
		}

		Object o = Class.forName(here.getName()).newInstance();
		o.getClass().getMethod("run").invoke(o);
	}
}