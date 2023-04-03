import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    double soles;
    int opcion;
    double tasaDeCambio = 0;
    String moneda = "";
    String moneda1 = "";
    
    Object[] options = {"Convertir Monedas","Conversor de Temperatura", "Salir"};
    int choice = JOptionPane.showOptionDialog(null, "¿Que desea hacer?", "Convertir", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    if (choice == 2) {
    	JOptionPane.showMessageDialog(null, "Programa cerrado");
    	System.exit(0);
    }
    
    if (choice == 0) {
    	
    	do {
    	      String[] optionss = { "Convertir Soles a Dólares estadounidenses", "Convertir Soles a Euros", "Convertir Soles a Libras esterlinas", "Convertir Soles a Yen japonés", "Convertir Soles a Won surcoreano", "Convertir Dólares estadounidenses a Soles", "Convertir Euros a Soles", "Convertir Libras esterlinas a Soles", "Convertir Yen japonés a Soles", "Convertir Won surcoreano a Soles" };
    	      JComboBox<String> comboBox = new JComboBox<>(optionss);
    	      int result = JOptionPane.showConfirmDialog(null, comboBox, "Elige a qué moneda deseas convertir:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    	      if (result == JOptionPane.OK_OPTION) {
    	        opcion = comboBox.getSelectedIndex();
    	      } else {
    	        return;
    	      }

    	      switch (opcion) {
    	        case 0:
    	          tasaDeCambio = 0.27;
    	          moneda1 = "soles peruanos";
    	          moneda = "dólares estadounidenses";
    	          break;
    	        case 1:
    	          tasaDeCambio = 0.24;
    	          moneda1 = "soles peruanos";
    	          moneda = "euros";
    	          break;
    	        case 2:
    	          tasaDeCambio = 0.22;
    	          moneda1 = "soles peruanos";
    	          moneda = "libras esterlinas";
    	          break;
    	        case 3:
    	          tasaDeCambio = 35.28;
    	          moneda1 = "soles peruanos";
    	          moneda = "yen japonés";
    	          break;
    	        case 4:
    	          tasaDeCambio = 347.19;
    	          moneda1 = "soles peruanos";
    	          moneda = "won surcoreano";
    	          break;
    	        case 5:
    	          tasaDeCambio = 3.75;
    	          moneda1 = "dolares estadounidense";
    	          moneda = "soles peruanos";
    	          break;
    	        case 6:
    	          tasaDeCambio = 4.09;
    	          moneda1 = "euros";
    	          moneda = "soles peruanos";
    	          break;
    	        case 7:
    	          tasaDeCambio = 4.65;
    	          moneda1 = "libras esterlinas";
    	          moneda = "soles peruanos";
    	          break;
    	        case 8:
    	          tasaDeCambio = 0.028;
    	          moneda1 = "Yen japonés";
    	          moneda = "soles peruanos";
    	          break;
    	        case 9:
    	          tasaDeCambio = 0.0029;
    	          moneda1 = "Won surcoreano";
    	          moneda = "soles peruanos";
    	          break;          
    	        default:
    	          JOptionPane.showMessageDialog(null, "Opción inválida.");
    	          return;
    	      }
    	      String inputString = JOptionPane.showInputDialog(null, "Ingresa la cantidad que deseas convertir:");
    	      soles = Double.parseDouble(inputString);

    	      double resultado;

    	      if(opcion <5){
    	         resultado=soles * tasaDeCambio; 
    	         JOptionPane.showMessageDialog(null, soles + " "+moneda1 + " equivalen a " + resultado + " " + moneda + ".", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    	      }else{
    	         resultado=soles * tasaDeCambio; 
    	         JOptionPane.showMessageDialog(null, soles + " " +moneda1+" equivalen a "+resultado+" soles peruanos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    	      }

    	      opcion = JOptionPane.showConfirmDialog(null, "¿Deseas convertir a otra moneda?", "Confirmación", JOptionPane.YES_NO_OPTION);
    	    } while (opcion == JOptionPane.YES_OPTION);
    	    JOptionPane.showMessageDialog(null, "Programa terminado");
    	    return;	
    }
    if (choice == 1) {
        double temperatura = 0;
        String temp = "";
        String temp1 = "";
        double valor = 0;
    	
    	do {
  	      String[] optionss = { "Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius", "Kelvin a Grados Celcius", "Kelvin a Grados Farenheit"};
  	      JComboBox<String> comboBox = new JComboBox<>(optionss);
  	      int result = JOptionPane.showConfirmDialog(null, comboBox, "Elige una opcion para convertir:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
  	      if (result == JOptionPane.OK_OPTION) {
  	        opcion = comboBox.getSelectedIndex();
  	      } else {
  	        return;
  	      }

  	      switch (opcion) {
  	        case 0:
  	          temp1 = "Grados Celcius";
  	          temp = "Grados Farenhet";
  	          valor = 1.8;
  	          break;
  	        case 1:
  	          temp1 = "Grados Celcius";
  	          temp = "Kelvin";
  	          valor = 273.15;
  	          break;
  	        case 2:
  	          temp1 = "Grados Farenheit";
  	          temp = "Grados Celcius";
  	          valor = 0.56;
  	          break;
  	        case 3:
  	          temp1 = "Kelvin";
  	          temp = "Grados Celcius";
  	          valor = 273.15;
  	          break;
  	        case 4:
  	          temp1 = "Kelvin";
  	          temp = "Grados Farenheit";
  	          valor = 1.8;
  	          break;  
  	        default:
  	          JOptionPane.showMessageDialog(null, "Opción inválida.");
  	          return;
  	      }
  	      String inputString = JOptionPane.showInputDialog(null, "Ingresa la cantidad que deseas convertir:");
  	      temperatura = Double.parseDouble(inputString);
  	      
  	      double valor1=0;
  	    if(opcion == 0){
	         valor1=(temperatura * valor)+32; 
	         JOptionPane.showMessageDialog(null, temperatura + " "+temp1 + " equivalen a " + valor1 + " " + temp + ".", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	      }if(opcion == 1){
	         valor1=temperatura + valor; 
	         JOptionPane.showMessageDialog(null, temperatura + " "+temp1 + " equivalen a " + valor1 + " " + temp + ".", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	      }if(opcion == 2) {
	    	  valor1= ((temperatura -32)*valor);
	    	  JOptionPane.showMessageDialog(null, temperatura + " "+temp1 + " equivalen a " + valor1 + " " + temp + ".", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	      }if(opcion == 3) {
	    	  valor1 = temperatura - valor;
	    	  JOptionPane.showMessageDialog(null, temperatura + " "+temp1 + " equivalen a " + valor1 + " " + temp + ".", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	      }if(opcion ==4) {
	    	  valor1 = ((temperatura-273.15)*valor+32);
	    	  JOptionPane.showMessageDialog(null, temperatura + " "+temp1 + " equivalen a " + valor1 + " " + temp + ".", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	      }
  	      

  	      opcion = JOptionPane.showConfirmDialog(null, "¿Deseas convertir a otra temperatura?", "Confirmación", JOptionPane.YES_NO_OPTION);
  	    } while (opcion == JOptionPane.YES_OPTION);
  	    JOptionPane.showMessageDialog(null, "Programa terminado");
  	    return;	
    }
    

  }

}