public class Main{    public static void main(String[] args) throws Exception{
        FastReader sc=new FastReader(); 
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        int n=sc.nextInt();
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<n;i++) {
            map.put(sc.next(), 1);
        }
        ArrayList<String> list=new ArrayList<String>();
        int count=0;
        if(!map.containsKey("purple")) {
            count++;
            list.add("Power");
        }
if(!map.containsKey("green")) {
    count++;
    list.add("Time");
        }

if(!map.containsKey("blue")) {
    count++;
    list.add("Space");
}

if(!map.containsKey("orange")) {
    count++;
    list.add("Soul");
}

if(!map.containsKey("red")) {
    count++;
    list.add("Reality");
}

if(!map.containsKey("yellow")) {
    count++;
    list.add("Mind");
}System.out.println(count);
    for(String s:list) {
        System.out.println(s);
    }
    }
}