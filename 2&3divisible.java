//in a list of integers you have find it should divisible by 2 and 3 and i have to do sum 
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,6,9,12,15,18);

        int sum = list.stream()
                .filter(n -> n % 2 == 0 && n % 3 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}


//with loop

int sum = 0;

for(int n : list){
    if(n % 2 == 0 && n % 3 == 0){
        sum += n;
    }
}

System.out.println(sum);
