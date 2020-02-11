
public class Program {
	public static void main(String[] args)
	{
		jugarFizzbuzz();
    }

    public static Object verificarNumero(int i){
		if (i % 15 == 0)
			return "FizzBuzz";
		if(i % 3 == 0)
			return "Fizz";
		if(i % 5 == 0)
			return "Buzz";
		return i;
	}

    public static void jugarFizzbuzz(){
		Object resultado="";
		for(int i = 0; i < 100; i++) {
			resultado=verificarNumero(i);
			System.out.println(resultado);
		}
	}
}
