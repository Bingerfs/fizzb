
public class Program {
	public static void main(String[] args)
	{
		jugarFizzbuzz();
    }

    public static Object verificarNumero(int numero){
		if (esMultiploDe(numero, 15))
			return "FizzBuzz";
		if(esMultiploDe(numero, 3))
			return "Fizz";
		if(esMultiploDe(numero, 5))
			return "Buzz";
		return numero;
	}

    public static void jugarFizzbuzz(){
		Object resultado="";
		for(int numero = 0; numero < 100; numero++) {
			resultado=verificarNumero(numero);
			System.out.println(resultado);
		}
	}

	public static boolean esMultiploDe(int dividendo, int divisor){
	    return dividendo%divisor == 0;
    }
}
