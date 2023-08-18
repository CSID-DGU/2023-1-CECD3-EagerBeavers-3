public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] parsedString;
        int objectNum = 0;
        int xStart=0;
        int yStart=0;

        parsedString = in.readLine().split(" ");
        xStart = Integer.parseInt(parsedString[0]);
        yStart = Integer.parseInt(parsedString[1]);
        objectNum = Integer.parseInt(in.readLine());

        int[] xLocs = new int[objectNum+1];
        int[] yLocs = new int[objectNum+1];
        int[] bitMasks = new int[1<<objectNum];
        Arrays.fill(bitMasks, -1);
        int[] previous = new int[1<<objectNum];

        xLocs[objectNum]=xStart;
        yLocs[objectNum]=yStart;
        for(int i=0; i<objectNum; i++){
            parsedString = in.readLine().split(" ");
            xLocs[i] = Integer.parseInt(parsedString[0]);
            yLocs[i] = Integer.parseInt(parsedString[1]);
        }

        //go through all pairs and find time requirement for each pair of objects
        //the entry at point [i][j] is equal to the time it takes to get from point i to point j
        int[][] times = new int[objectNum+1][objectNum+1];
        for(int i=0;i<=objectNum;i++){
            for(int j=0; j<=objectNum;j++){
                times[i][j] = times[j][i] = (xLocs[i]-xLocs[j])*(xLocs[i]-xLocs[j])+(yLocs[i]-yLocs[j])*(yLocs[i]-yLocs[j]);
            }
        }

        //each value in bitmasks represents the minimum time necessary to get
        //the unmasked bits
        //so bitmasks[5] (5=101) is the fastest time in which you can get
        //items 1 and 3
        bitMasks[0] = 0; //collecting zero objects takes 0 time
        //1<<n makes the n+1 position in the bit string = 1
        //1<<2 = 100
        for (int i=0; i<(1<<objectNum); i++){
            if(bitMasks[i]==-1) {

            }else{
                for(int j=0; j<objectNum; j++){
                    if(((1<<j)&i) == 0){ //if our current j object hasn't been picked up yet
                        int curState = (1<<j) | i; //ith state after picking up j object
                        int curTime = bitMasks[i] + 2*times[objectNum][j]; //time required to get object j from bag at state i

                        if(bitMasks[curState] == -1 || curTime < bitMasks[curState]){
                            bitMasks[curState] = curTime; //put fastest time in for gettingto our current state
                            previous[curState] = i;
                        }


                        for(int k=0; k<objectNum; k++){
                            if(((1<<k) & curState) == 0){ //if the kth position in our current state hasn't been picked up
                                int kState = ((1<<k) | curState); //curstate after picking pu kth object
                                //kTime is time it takes to go from bag, to j, to k and back
                                int kTime = bitMasks[i] + times[objectNum][j] + times[j][k] + times[k][objectNum];

                                if(bitMasks[kState] == -1 || kTime < bitMasks[kState]){
                                    bitMasks[kState] = kTime;  //put shortest tiem in for getting to kState
                                    previous[kState] = i;
                                }
                            }
                        }
                        break;
                    }
                }
            }

        }

        int finalState = (1<<objectNum)-1;

        System.out.println(bitMasks[finalState]);

        Deque<Integer> outputQ = new ArrayDeque<Integer>();
        outputQ.add(0);
        int curState = finalState;
        while(curState>0){
            //1100 ^ 1101 = 0001
            //difference is the objects picked up in this state but not in previous state
            int difference = curState ^ previous[curState];
            int firstItem = -1;
            int secondItem = -1;

            for(int i=0; i<objectNum; i++){
                if(((1<<i)&difference)>0){ //if the ith object was picked up in this state
                    secondItem=firstItem; //keep track of how many items are picked up
                    firstItem=i;
                }
            }

            if(secondItem!=-1){
                //put in two items followed by a return to 0

                outputQ.add(firstItem+1);
                outputQ.add(secondItem+1);
                outputQ.add(0);
            }
            else{
                outputQ.add(firstItem + 1);
                outputQ.add(0);
            }

            curState = previous[curState];
        }

        System.out.print(outputQ.removeLast());
        while(!outputQ.isEmpty()){
            System.out.print(" ");
            System.out.print(outputQ.removeLast());
        }
    }
}