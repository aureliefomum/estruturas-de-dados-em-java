package one.digital.innovation;

public class ListaEncadeada <T> {
    //creating the entry point reference node
    No <T> referenciaEntrada;
    //creating constructor function

    public ListaEncadeada(){
        //set entry point node to null
        this.referenciaEntrada = null;
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
