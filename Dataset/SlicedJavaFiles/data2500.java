public class Main{    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] numbersAsString = input.lines()
                                        .skip(1)
                                        .findFirst()
                                        .get()
                                        .split(" ");
        int[] numbers = Arrays.stream(numbersAsString).mapToInt(Integer::parseInt).toArray();
        List<PairOfInt> sameSumBlocks = findSameSumBlocks(numbers);
        System.out.println(sameSumBlocks.size());
        sameSumBlocks.forEach(System.out::println);
    }
}