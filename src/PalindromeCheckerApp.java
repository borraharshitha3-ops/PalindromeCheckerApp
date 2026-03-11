class Node{
    char data;
    Node next;

    Node(char data){
        this.data = data;
        this.next = null;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";

        Node head = null;
        Node tail = null;

        for(char c : word.toCharArray()){

            Node newNode = new Node(c);

            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }

        }

        String original = word;
        String reversed = "";

        Node current = head;

        while(current != null){
            reversed = current.data + reversed;
            current = current.next;
        }

        if(original.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}