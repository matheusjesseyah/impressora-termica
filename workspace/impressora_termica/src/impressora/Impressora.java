package impressora;


import java.net.Socket;  //biblioteca usada para estabelecer uma conexão com a rede
import java.io.OutputStream;  //bibioteca usada para enviar e receber dados

public class Impressora {

	public static void main(String[] args) {
		//tratamento de exceções
		try {
			
			Socket impressora = new Socket("10.26.49.41", 9100);
			OutputStream saida = impressora.getOutputStream();
			
			saida.write("Matheus Jade\n\n".getBytes("CP850"));
			
			//imprimir
			saida.flush();
			
			//encerrar conexção
			impressora.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
