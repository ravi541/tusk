package Test;

  
import java.util.ArrayList;
import java.util.List;
 
public class RemoveDup {
 
    public int findDuplicateNumber(List numbers){
         
        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate = total - (highestNumber*(highestNumber+1)/2);
        return duplicate;
    }
     
    public int getSum(List numbers){
         
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }
     
    public static void main(String a[]){
        List numbers = new ArrayList();
        for(int i=1;i<30;i++){
            numbers.add(i);
        }
        //add duplicate number into the list
        numbers.add(22);
        RemoveDup dn = new RemoveDup();
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
    }
}