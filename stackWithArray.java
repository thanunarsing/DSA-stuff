public class stackWithArray {
    int[] arr;
    int top;
    int n;

    public stackWithArray(int n) {
        this.n = n;
        this.arr = new int[n];
        this.top=-1;
    }
    public void push(int data){
        if(isFull()){
            return;
        }
        top++;
        arr[top]=data;
        return;
    }
    public boolean isFull(){
        if(top==n-1){
            return true;
        }
        else
            return false;
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        return arr[top--];
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[top];
    }

    public static void main(String args[]){
        stackWithArray s=new stackWithArray(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
