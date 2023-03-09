package Fontes;

public class MensagemBoasVindas {

    private String mensagem;

   //Construtor de Objeto na Classe
   public MensagemBoasVindas(String mens){
	   	 super();
         this.mensagem = mens; 
   }
  
   // Exibição da parte fixa da mensagem
   public String exibirMensAbertura(){
           String mensAbertura;
           mensAbertura = "Ola! Seja bem vindo a sua calculadora pessoal,";
           System.out.print(mensAbertura);
           return mensAbertura;
   }
   
   // Exibição da mensagem
   public String exibirMensComplemento(){
	     String mensComplemento = this.mensagem+"!/nConfira os resultados dos testes no painel da JUNIT!";
         System.out.println(this.mensagem+'!');
         System.out.println("Confira os resultados dos testes no painel da JUNIT!");
         return mensComplemento;
   }   
    
}
