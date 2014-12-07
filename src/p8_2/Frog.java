package p8_2;

class Characteristic
{
	private String s;
	Characteristic(String s)
	{
		this.s = s;
		System.out.println("Creating Characteristic" + s);
	}
	
	protected void dispose()
	{
		System.out.println("disposing Characteristic " + s);
	}
}

class Description
{
	private String s;
	Description(String s)
	{
		this.s = s;
		System.out.println("Creating Description " + s);
	}
	
	protected void dispose()
	{
		System.out.println("disposing Description " + s);
	}
}

class LivingCreature
{
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("Basic Living Creature");
	
	LivingCreature()
	{
		System.out.println("LivingCreature");
	}
	
	//dispose  销毁
	protected void dispose()
	{
		System.out.println("LivingCreature dispose");
		t.dispose();
		p.dispose();
	}
}


class Animal extends LivingCreature
{
	private Characteristic p = new Characteristic("has heart");
	private Description t = new Description("Animal not vegetable");
	Animal()
	{
		System.out.println("Animal()");
	}
	protected void dispose()
	{
		System.out.println("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

//amphibian  两栖动物
class Amphibian extends Animal
{
	private Characteristic p = new Characteristic("can live in water");
	private Description t = new Description("Both water and land");
	
	Amphibian()
	{
		System.out.println("Anphibian()");
	}
	
	protected void dispose()
	{
		System.out.println("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	
	
}

//frog 青蛙
public class Frog extends Amphibian
{
	private Characteristic p = new Characteristic("Croaks");//呱呱地叫
	private Description t = new Description("Eats Bugs");
	public Frog()
	{
		System.out.println("Frog()");
	}
	protected void dispose()
	{
		System.out.println("Frog dispose");
	
	t.dispose();
	p.dispose();
	super.dispose();
	}
	
	public static void main(String[] args)
	{
		Frog frog = new Frog();
		System.out.println("Bye!");
		frog.dispose();
		
	}
}
