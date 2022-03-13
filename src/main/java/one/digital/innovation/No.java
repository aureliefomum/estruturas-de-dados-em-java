package one.digital.innovation;

public class No <T> {
    private T conteudo;
    private No proximoNo;
//create empty constructor
    public No() {
        this.proximoNo = null;
    }

    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public one.digital.innovation.No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(one.digital.innovation.No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringEncadeado(){
        String str = "No{" +
                "conteudo=" + conteudo +
                ")";

        if(proximoNo != null){
            str += "->" + proximoNo.toString()
        }else{
            str += "->null";
        }
        return str;
    }
}
