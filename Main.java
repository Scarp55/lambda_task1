package lambda_task1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = Calculator.instance.get();
		int a = calc.plus.apply(1, 2);
		int b = calc.minus.apply(1,1);
		int c= calc.devide.apply(a, b); //при делении на 0 будет ошибка
		calc.println.accept(c);
	}

}
