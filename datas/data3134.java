public class Main{  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    double maxSpeed = in.nextInt();
    double len = in.nextInt();
    double delayDist = in.nextInt();
    double delaySpeed = in.nextInt();
    
    // two cases: I reach the delayPoint at a speed higher than the delaySpeed, or I don't.
    double timeToDelayAtMax = travelS(a, 0.0, maxSpeed, delayDist);
    double timeToDelayAtDelay = travelS(a, 0.0, delaySpeed, delayDist);
    if (Math.abs(timeToDelayAtMax-timeToDelayAtDelay) < 0.00001) {
      // I can reach the delayPoint without being delayed
      double time = travelS(a, 0.0, maxSpeed, len);
      System.out.printf("%.9f\n", time);
      return;
    }
    
    // binary search to find best velocity to stop acceleration in beginning
    double lowV = delaySpeed;
    double highV = maxSpeed;
    int loopCount = 1000;
    double[] initial = null;
    double[] secondary = null;
    while (loopCount-->0) {
      double guessV = (lowV+highV)/2.0;
      initial = travelA(a, 0.0, guessV);
      secondary = travelA(a, guessV, Math.min(delaySpeed, maxSpeed));
      if (initial[1] + secondary[1] < delayDist) { // okay, we can go faster
        lowV = guessV;
      } else {
        highV = guessV;
      }
    }
    double totalTime = 0.0;
    double finalSpeed = 0.0;
    initial = travelA(a, 0.0, lowV);
    secondary = travelA(a, lowV, delaySpeed);
    totalTime = initial[0] + secondary[0];
    double totalDist = initial[1] + secondary[1];
    totalTime += (delayDist-totalDist)/maxSpeed;
    
    // now we have delayDist to go, and we are at delaySpeed
    totalTime += travelS(a, delaySpeed, maxSpeed, len-delayDist);
    System.out.printf("%.9f\n", totalTime);
  }
}