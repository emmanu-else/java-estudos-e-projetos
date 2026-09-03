
public class HorasMinutosSegundos
{
	public static void main(String[] args) {
		System.out.println("====Conversão de horas, minutos e segundos====");
		
		double Horas = 12;
		
		double HorasParaMinutos = Horas * 60;
		System.out.println("12 horas equivalem há: " + HorasParaMinutos + " minutos");
		
		double MinutosParaSegundos = Horas * 3600;
		System.out.println("12 horas equivalem há: "+ MinutosParaSegundos + " segundos");
	}
	
	
}
