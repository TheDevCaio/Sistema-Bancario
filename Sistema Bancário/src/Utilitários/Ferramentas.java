package Utilitários;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Ferramentas {
	
    static DecimalFormat decimalFormat = new DecimalFormat("###,###,##0.00", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
	public static String doubleToString(Double valor) {
		
	return decimalFormat.format(valor);	
	
	}
}
