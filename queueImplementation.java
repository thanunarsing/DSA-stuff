public class queueImplementation {
    int arr[];
    int rear;
    int n;
    public queueImplementation(int n) {
        this.n=n;
        this.arr=new int[n];
        this.rear=-1;
        }
    public boolean isFull(){
        return rear==n-1;
    }
    public boolean isEmpty(){
        return rear==-1;
    }
    public void add(int data){
        if(isFull()){
            return;
        }
        arr[++rear]=data;
        return;
    }
    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];

        }
        rear--;
        return front;
    }
    public int peek(){
        return arr[0];
    }
public static void main(String args[]){
        queueImplementation q=new queueImplementation(5);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
     }
}
