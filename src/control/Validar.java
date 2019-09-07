package control;

public class Validar {
	String ruc;
	int longitud;
	int total;
	int aux;

	public boolean validarCedula(String cedula) {
		ruc = cedula;
		longitud = ruc.length();
		total = 0;

		if (ruc != "" && longitud == 13) {
			for (int i = 0; i < longitud - 4; i++) {
				if (i % 2 == 0) {
					aux = Character.getNumericValue(ruc.charAt(i)) * 2;
					if (aux > 9)
						aux -= 9;
					total += aux;

				} else {
					total += Character.getNumericValue(ruc.charAt(i));

				}

			}
			if ((total % 10) != 0)
				total = 10 - total % 10;
			else
				total = 0;
		}

		if (Character.getNumericValue(ruc.charAt(longitud - 4)) == total) {
			return true;
		} else {
			System.out.println("Invalida");
			return false;
		}

	}

}
