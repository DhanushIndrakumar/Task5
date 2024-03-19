import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question3 {
    public static void main(String args[]){
        List<String> names=new ArrayList<>(
            Arrays.asList("Rahul","Ankit","Aniket","Ankita","Deepak",
            "Madhav","Ammu","Ashraya","Aadrika","Ramya" ));
        System.out.println("The original list: "+names);

        List<String> finalNames=names.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());

        System.out.println("List containing only the names starting with 'A':"+finalNames);



    }
    
}
