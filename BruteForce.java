import java.util.Arrays;
import java.util.ArrayList;

public class Bruteforce{
static int toInt(boolean bool) {
return (bool) ? 1 : 0;
}

public static void main(String[] args) {
for(int i =0; i<1000; i++) {
ArrayList<Integer> digits = new ArrayList(Arrays.asList(i%10, (i/10)%10, (i/100)%10));

//rule 1
if ((digits.get(0)!=2)&&(digits.get(1)!=8)&&(digits.get(2)!=6)) continue;

//rule 2
if ((toInt(digits.contains(6)) + toInt(digits.contains(1)) + toInt(digits.contains(4))) != 1) continue;
else if ((digits.get(0)==4)||(digits.get(1)==1)||(digits.get(2)==6)) continue;

//rule 3
if ((toInt(digits.contains(2)) + toInt(digits.contains(0)) + toInt(digits.contains(6))) != 2) continue;
else if ((digits.get(0)==6)||(digits.get(1)==0)||(digits.get(2)==2)) continue;

//rule 4
if (digits.contains(7)) continue;
if (digits.contains(3)) continue;
if (digits.contains(8)) continue;

//rule 5
if ((toInt(digits.contains(7)) + toInt(digits.contains(8)) + toInt(digits.contains(0))) != 1) continue;
else if ((digits.get(0)==0)||(digits.get(1)==8)||(digits.get(2)==7)) continue;

System.out.println(i);
return;
}
System.out.println("no solution");
}
}
