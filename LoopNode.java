public class LoopNode {
    int data;
    LoopNode next=this;
    public LoopNode(int data){
        this.data = data;
    }
    public LoopNode next(){
        return this.next;
    }
    public int getData(){
        return this.data;
    }

    
    public void after(LoopNode node){
        LoopNode nextNext = next;
        this.next = node;
        node.next=nextNext;
    }

    public void removeNext(){
        
        LoopNode newNext = next.next;
        this.next=newNext;
    }
}
