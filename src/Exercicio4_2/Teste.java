package Exercicio4_2;

public class Teste {

	public static void main(String[] args) {
		SomadorExistente existente = new SomadorExistente();
		SomadorAdapter adapter = new SomadorAdapter(existente);
				Cliente cliente = new Cliente(adapter);
				cliente.executar();
			}
		}
