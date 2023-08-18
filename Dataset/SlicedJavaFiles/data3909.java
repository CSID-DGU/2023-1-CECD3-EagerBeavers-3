public class Main{    public static void main(String[] args) throws IOException {
        Soumit sc = new Soumit();

        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-->0){
            int n = sc.nextInt();
            int[] arr = sc.nextIntArray(n);

            Stack<Node> mainstk = new Stack<>();

            Node pnode = new Node();
            pnode.stk.push(1);
            pnode.sb.append("1");
            mainstk.push(pnode);
            sb.append(pnode.sb).append("\n");

            for(int i=1;i<n;i++){
                int val = arr[i];
                if(val==1){
                    Node node = new Node();
                    node.stk.push(1);
                    node.sb.append(mainstk.peek().sb).append(".1");
                    mainstk.push(node);
                    sb.append(node.sb).append("\n");
                }
                else {
                    while (true) {
                        Node node = mainstk.pop();
                        if (node.stk.peek()==val-1) {
                            node.stk.push(val);
                            if(mainstk.isEmpty()){
                                node.sb = new StringBuilder();
                                node.sb.append(val);
                                sb.append(val).append("\n");
                            }
                            else{
                                Node peeknode = mainstk.peek();
                                node.sb = new StringBuilder();
                                node.sb.append(peeknode.sb).append(".").append(val);
                                sb.append(peeknode.sb).append(".").append(val).append("\n");
                            }
                            mainstk.push(node);
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(sb);

        sc.close();
    }
}