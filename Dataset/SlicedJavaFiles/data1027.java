public class Main{  public static void main(String... args) throws Exception {
    br = new BufferedReader(new InputStreamReader(System.in));
    pw = new PrintWriter(new BufferedOutputStream(System.out));
    new P1177B().run();
    br.close();
    pw.close();
    System.err.println("\n[Time : " + (System.currentTimeMillis() - startTime) + " ms]");
    long gct = 0, gcc = 0;
    for (GarbageCollectorMXBean garbageCollectorMXBean : ManagementFactory.getGarbageCollectorMXBeans()) {
      gct += garbageCollectorMXBean.getCollectionTime();
      gcc += garbageCollectorMXBean.getCollectionCount();
    }
    System.err.println("[GC time : " + gct + " ms, count = " + gcc + "]");
  }
}