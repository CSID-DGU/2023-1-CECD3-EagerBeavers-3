public class Main{    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        // code goes here
        int t = fr.nextInt();
        while (t-- > 0){
            int n = fr.nextInt();
            int[] arr = fr.nextIntArray(n);
            sb.append(1).append("\n");
            List<Integer> state = new ArrayList<>();
            state.add(1);
            for(int i = 1; i < n; i++){
                List<Integer> nextState = new ArrayList<>();
                boolean found = false;
                int till = -1;
                for(int j = state.size() - 1; j >= 0; j--){
                    if(state.get(j) + 1 == arr[i]){
                        till = j;
                        found = true;
                        break;
                    }
                }
                if(found){
                    for(int j = 0; j < till; j++){
                        nextState.add(state.get(j));
                    }
                    nextState.add(arr[i]);
                    sb.append(nextState.get(0));
                    for(int z = 1; z < nextState.size(); z++){
                        sb.append(".").append(nextState.get(z));
                    }
                    sb.append("\n");
                }
                if(!found){
                    nextState.addAll(state);
                    nextState.add(arr[i]);
                    sb.append(nextState.get(0));
                    for(int z = 1; z < nextState.size(); z++){
                        sb.append(".").append(nextState.get(z));
                    }
                    sb.append("\n");
                }
                state = nextState;
            }
        }
        System.out.print(sb.toString());
    }
}