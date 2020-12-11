import java.math.*;
import java.io.*;
public class LargeSum{
	public static void main(String[] args)throws Exception{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		String[] input = new String[100];
		int index = 0;
		BigInteger value = new BigInteger("0");
		while((st=br.readLine())!=null){
			input[index]=st;
			index++;
		}
		for(int i=0;i<100;i++){
			BigInteger current = new BigInteger(input[i]);
			value = value.add(current);
		}
		System.out.println("Answer:"+value);
	}
}