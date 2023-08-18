public class Main{	public static void main(String[] args) {
		try (final Scanner sc = new Scanner(System.in)) {
			final int n = sc.nextInt();
			
			long[] array = new long[n];
			for(int i = 0; i < n; i++){ array[i] = sc.nextLong(); }
			
			TreeSet<Long> value_set = new TreeSet<Long>();
			for(int i = 0; i < n; i++){ value_set.add(array[i]); }
			ArrayList<Long> value_list = new ArrayList<Long>(value_set);
			
			BigInteger answer = BigInteger.ZERO;
			final int bit_n = value_list.size();
			BIT cnt_bit = new BIT(bit_n);
			BIT val_bit = new BIT(bit_n);
			
			for(int i = n - 1; i >= 0; i--){
				final long value = array[i];
				final int value_index = Collections.binarySearch(value_list, value);
				
				int upper_pos = Collections.binarySearch(value_list, value + 2);
				if(upper_pos < 0){ upper_pos = (-upper_pos) - 1; }
				if(0 <= upper_pos && upper_pos < bit_n){
					final long upper_sum = val_bit.sum(upper_pos, bit_n) - cnt_bit.sum(upper_pos, bit_n) * value;
					answer = answer.add(BigInteger.valueOf(upper_sum));
				}
				
				int lower_pos = Collections.binarySearch(value_list, value - 2);
				if(lower_pos < 0){ lower_pos = (-lower_pos) - 2; }
				if(0 <= lower_pos && lower_pos < bit_n){
					final long lower_sum = val_bit.sum(0, lower_pos + 1) - cnt_bit.sum(0, lower_pos + 1) * value;
					answer = answer.add(BigInteger.valueOf(lower_sum));
				}
				
				cnt_bit.add(value_index, 1);
				val_bit.add(value_index, value);
				//System.out.println(answer);
			}
			
			System.out.println(answer);
		}
	}
}