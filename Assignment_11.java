import java.util.*;
class ArrayList{
    private int x[];
    private int index = 0;
    private double size;
    ArrayList(int size){
        x =  new int[size];
        index = -1;
        this.size = size;
    }
    public void add(int data){
        if(index == size-1){
            int temp[] = x;
            this.size =  this.size *1.5;
            x = new int[(int)this.size];
            for(int i=0;i<=index;i++){
                x[i] =temp[i];
            }
            index++;
            x[index] = data;
        }
        else{
          index++;
          x[index] = data;
        }
    }
    public void traverse(){
        if(index==-1)
        System.out.println("List is empty");
        else for(int i=0;i<=index;i++) System.out.println(x[i]);
    }

}
public class Assignment_11{
    public static void main(String args[]){
        ArrayList a = new ArrayList(10);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        a.add(sc.nextInt());
        a.traverse();
    }
}