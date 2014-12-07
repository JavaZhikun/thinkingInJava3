package p8_2;

public class Woodwind extends Wind
{
	void play(Note n )
	{
		System.out.println("Woodwind.play()" + n);
	}
	
	String what()
	{
		return "Woodwind";
	}

}
