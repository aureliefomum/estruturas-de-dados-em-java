package one.digital.innovation;

public class ListaEncadeada <T> {
    //creating the entry point reference node
    No <T> referenciaEntrada;
    //creating constructor function

    public ListaEncadeada(){
        //set entry point node to null
        this.referenciaEntrada = null;
    }

    public vod add(T conteudo){
        No <T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return ;
        }
        No<T> noAuxiliar = referenciaEntrada;
        //run for loop until you get to the end of the list, which is the last node
        for(int i = 0; i< this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximo();
        }
        //once you get to end of list add your new node(novoNo)
        noAuxiliar.setProximoNo(novoNo);
    }
   // create size method, returns length of list
public int size(){
        int tamanhoLista = 0;
        No <T> referenciaAux = referenciaEntrada;
        while(true){
            //check if there is no node ahead of first node
               if(referenciaAux != null){
                   tamanhoLista++;
               // check there is a node ahead of current node
                if(referenciaAux.getProximoNo() != null){
                    //if yes, go to next node
referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return tamanhoLista;
}
    //create isEmpty method
 public boolean isEmpty(){
        return referenciaEntrada == null;
 }

}
