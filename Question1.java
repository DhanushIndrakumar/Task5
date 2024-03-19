import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question1{
    public static void main(String[] args){
        //creating a list of string to store lower case values
        List<String> list = new ArrayList<String>(Arrays.asList("kanya","koma","kova"));
        List<String> st=list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(st);
    }
}