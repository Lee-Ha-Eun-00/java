import java.util.Scanner;
public class Task2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("연산>> ");
		float number1 = scanner.nextFloat();
		String operater = scanner.next();
		float number2 = scanner.nextFloat();
		float result;
		
		if(operater.equals("+"))
		{
			result = number1 + number2;
			System.out.println(number1+operater+number2+"의 계산 결과는 "+ result);
		}
		else if(operater.equals("-"))
		{
			result = number1 - number2;
			System.out.println(number1+operater+number2+"의 계산 결과는 "+ result);
		}
		else if(operater.equals("*"))
		{
			result = number1 * number2;
			System.out.println(number1+operater+number2+"의 계산 결과는 "+ result);
		}
		else if(operater.equals("/"))
		{
			if(number2 == 0)
			{
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else
			{
				result = number1 / number2;
				System.out.println(number1+operater+number2+"의 계산 결과는 "+ result);
			}
		}		
		else
		{
			System.out.println("연산자 오류");
		}
		scanner.close();

	}

}