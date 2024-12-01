public class regpro {

    private String codigo;
    private String data;
    private String pais;
   

    public regpro(String codigo, String data, String pais) {
        this.codigo = codigo;
        this.data = data;
        this.pais = pais;
        
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getdata() {
        return data;
    }
    public void setpais(String pais) {
        this.pais = pais;
    }
    public String getpais() {
        return pais;
    }

}
    

