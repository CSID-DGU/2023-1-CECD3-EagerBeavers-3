public class Main{	public static void main(String[] args) {

		Input input = new Input();
		input = SystemInput();
		List<String> resultList = run(input);
		for(String result:resultList){
			System.out.println(result);
		}

	}
}