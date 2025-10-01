import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            nodes[i] = new Node((char)('A'+i));
        }

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            char root = st.nextToken().charAt(0);
            char left =  st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            Node parent = nodes[root - 'A'];
            parent.left  = (left  == '.') ? null : nodes[left  - 'A'];
            parent.right = (right == '.') ? null : nodes[right - 'A'];


        }

        //
        Node root = nodes[0]; //항상 A부터 시작하므로

        // 전위
        preorder(root);
        sb.append('\n');

        // 중위
        inorder(root);
        sb.append('\n');

        // 후위
        postorder(root);
        sb.append('\n');

        System.out.print(sb.toString());
    }

    static StringBuilder sb = new StringBuilder();
    static Node[] nodes = new Node[26]; //알파벳 저장용 노드 리스트

    static class Node {
        char value;
        Node left;
        Node right;

        public Node(char value){
            this.value = value;
        }
    }

    static void preorder(Node node){
        if(node == null) return;
        sb.append(node.value);
        preorder(node.left);
        preorder(node.right);
    }

    static void inorder(Node node){
        if(node == null) return;

        inorder(node.left);
        sb.append(node.value);
        inorder(node.right);
    }

    static void postorder(Node node){
        if(node == null) return;

        postorder(node.left);
        postorder(node.right);
        sb.append(node.value);
    }
}
