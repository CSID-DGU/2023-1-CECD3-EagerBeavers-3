public class Main{    public static void main(String[] args) {
        int n = readInt();
        long[] a = readLongArray(n);
        HashMap<Long, List<Block>> blocks = new HashMap<>();
        for (int j = 0; j < n; j++) {
            long sum = 0;
            for (int i = j; i >= 0; i--) {
                sum += a[i];
                if (!blocks.containsKey(sum))
                    blocks.put(sum, new LinkedList<>());
                List<Block> blockList = blocks.get(sum);
                if (blockList.size() > 0 && blockList.get(blockList.size() - 1).r == j) continue;
                blockList.add(new Block(i, j));
            }
        }

        List<Block> bestBlocks = new LinkedList<>();
        for(long sum : blocks.keySet()) {
            List<Block> blockList = blocks.get(sum);
            List<Block> curBest = new LinkedList<>();
            int lastR = -1;
            for(Block block : blockList) {
                if (block.l > lastR) {
                    curBest.add(block);
                    lastR = block.r;
                }
            }
            if (curBest.size() > bestBlocks.size()) {
                bestBlocks = curBest;
            }
        }

        writer.println(bestBlocks.size());
        for(Block block : bestBlocks) {
            writer.printf("%d %d\n", block.l + 1, block.r + 1);
        }

        writer.flush();
    }
}