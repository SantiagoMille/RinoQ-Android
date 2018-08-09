package appgem.itesm.com.appgem.Ind_Class;

/**
 * Created by santi on 6/29/2018.
 */

public class MenuOption {
    private String texto;
    private String icono;

    public MenuOption(String texto, String icono){
        this.texto = texto;
        this.icono = icono;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }
}
