import java.util.*;
import static java.lang.Integer.parseInt;

public class Array_List {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<Person> persons=new ArrayList<>();
        String i;
        while ((i=input.next())!="0")
        {
            StringTokenizer t=new StringTokenizer(i,",");
            Person p =new Person(t.nextToken(),parseInt (t.nextToken()));
            persons.add(p);
            input.nextLine();

    }
        for (Person element: persons) {
            System.out.println("element");

        }
    }}


