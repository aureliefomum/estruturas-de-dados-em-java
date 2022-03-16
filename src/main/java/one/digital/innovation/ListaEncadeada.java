package one.digital.innovation;

public class ListaEncadeada <T> {
    //creating the entry point reference node
    No <T> referenciaEntrada;
    //creating constructor function

    public ListaEncadeada(){
        //set entry point node to null
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No <T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            //take new item(novoNo) and make it point to first item(referenciaEntrada) a
            referenciaEntrada = novoNo;
            return ;
        }
        //take head((NoAuxiliar) make it point to new item(referenciaEntrada which has novoNo)
        No<T> noAuxiliar = referenciaEntrada;
        //run for loop until you get to the end of the list, which is the last node
        for(int i = 0; i< this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        //once you get to end of list add your new node(novoNo)
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){

        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i<= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
     return noRetorno;
    }

    public T remove(int index){
        No <T> noParaRemover = this.getNo(index);
        //Check if you are removing first node, if yes, assign it to entry point node
        if(index == 0){
            referenciaEntrada = noParaRemover.getProximoNo();
            return noParaRemover.getConteudo();
        }
        No<T> noAnterior = getNo(index-1);
        noAnterior.setProximoNo(noParaRemover.getProximoNo());
        return noParaRemover.getConteudo();
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

private void validaIndice(int index){
    if(index >= size()){
        int ultimoIndice = size() - 1;
        throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index + " desta lista. Esta lista só vai até o indice " + ultimoIndice + "." );
    }
}




    //create isEmpty method
 public boolean isEmpty(){
        return referenciaEntrada == null;
 }

 @Override
    public String toString(){
        String strRetorno = "";
        No <T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i <this.size(); i++){
            strRetorno += "No{conteudo " + noAuxiliar.getConteudo() + "}--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
                strRetorno += "null";

        return strRetorno;
 }


}
