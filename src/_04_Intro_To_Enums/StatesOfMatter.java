package _04_Intro_To_Enums;

import java.util.Random;

import _04_Intro_To_Enums.IntroToEnums.DataTypes;

public class StatesOfMatter{
public enum StateOfMatter {
	SOLID, LIQUID, GAS, PLASMA, BOSE_EINSTEIN_CONDENSATE 

}

public static void main(String[] args) {
	Random x = new Random();
int	x1 = x.nextInt(5);
	StateOfMatter[] data = StateOfMatter.values();
	StateOfMatter data1 = data[x1];
	switch(data1) {
	// Notice that 'DataTypes.' is not requires when accessing categories
	case SOLID:{
		System.out.println("SOLID");
		break;
	}
	case LIQUID:{
System.out.println("LIQUID");
		break;
	}
	case GAS:{
		System.out.println("GAS");
		break;
	}
	case PLASMA:{
		System.out.println("PLASMA");
		break;
	}
	case BOSE_EINSTEIN_CONDENSATE:{
		System.out.println("BOSE_EINSTEIN_CODENSATE");
		break;
	}
	}
}

}