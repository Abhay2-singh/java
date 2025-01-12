import java.util.ArrayList;

public class demo2 
{
    public static void main(String[] args) {
        ArrayList<String> mylist=new ArrayList<String>();
        mylist.add("indore");
        mylist.add("goa");
        mylist.add("bhind");
        for(String S:mylist){
            System.out.println(S);
        }
    }
}
