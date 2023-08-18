public class Main{  public static void main(String[] args) throws IOException {
    try (ChainReaction instance = new ChainReaction()) {
      instance.solve();
    }
  }
}