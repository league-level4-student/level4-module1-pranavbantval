package _05_Enum_Stuff;

import java.util.Random;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public void Zodiacs() {
		Zodiac[] data =  Zodiac.values();
		Random r = new Random();
	int x=	r.nextInt(12);
	Zodiac f = data[x];
	
	switch(f) {
	case CAPRICORN: {
		JOptionPane.showMessageDialog(null, "You are a caprisun [insert horoscope]");
		break;
	}
case AQUARIUS: {
	JOptionPane.showMessageDialog(null, "You are an aquarius [insert horoscope]");
		break;
	}

case PISCES: {
	JOptionPane.showMessageDialog(null, "You are a pisces [insert horoscope]");
	break;
}
case ARIES: {
	JOptionPane.showMessageDialog(null, "You are an aries [insert horoscope]");
	break;
}
case TAURUS: {
	JOptionPane.showMessageDialog(null, "You are a taurus [insert horoscope]");
	break;
}
case GEMINI: {
	JOptionPane.showMessageDialog(null, "You are a gemini [insert horoscope]");
	break;
}
case CANCER: {
	JOptionPane.showMessageDialog(null, "You are a cancer [insert horoscope]");
	break;
}
case LEO: {
	JOptionPane.showMessageDialog(null, "You are a leo [insert horoscope]");
	break;
}
case VIRGO: {
	JOptionPane.showMessageDialog(null, "You are a virgo [insert horoscope]");
	break;
}
case LIBRA: {
	JOptionPane.showMessageDialog(null, "You are a libra [insert horoscope]");
	break;
}
case SCORPIO: {
	JOptionPane.showMessageDialog(null, "You are a scorpio [insert horoscope]");
	break;
}
case SAGITTARIUS: {
	JOptionPane.showMessageDialog(null, "You are a sagittarius [insert horoscope]");
	break;
}

	}
	}
	public static void main(String[] args) {
		_00_Horoscope x = new _00_Horoscope();
		x.Zodiacs();
	}
	// 3. Make a main method to test your method
	
}
