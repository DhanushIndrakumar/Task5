import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String args[]){
        List<String> listNames=new ArrayList<>(Arrays.asList("abc","","def","jkl","","","def"));
        List<String> filteredList=listNames.stream().filter(n->!(n.isEmpty())).collect(Collectors.toList());
        System.out.println(filteredList);

    }
    
}
