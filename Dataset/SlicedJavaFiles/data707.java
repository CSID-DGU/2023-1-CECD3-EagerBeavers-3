public class Main{	public static void main(String arg[])throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		Pattern p1 = Pattern.compile("R\\d+C\\d+");
		Pattern p2 = Pattern.compile("\\d+");
		for(int i=0;i<t;i++){
			String input = in.readLine();
			Matcher m1 = p1.matcher(input);
			Matcher m2 = p2.matcher(input);
			if(m1.matches()){
				String result = "";
				if(m2.find()){
					result = m2.group();
				}
				if(m2.find()){
					result = encode(Long.parseLong(m2.group()))+result;
				}
				System.out.println(result);
			}
			else {
				String result = "R";
				if(m2.find()){
					result += m2.group();
				}				
				result += "C";
				System.out.println(result+decode(input.replaceAll(m2.group(),"")));
			}
		}
	}
}