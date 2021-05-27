package practica.tarde.ejercicio1;
import java.util.regex.*;

public class Password {

    private String pwd;
    private Pattern patron;

    public Password(){ }

    public Password(Pattern patron){
        setPatron(patron);
    }

    public void setValue(String pwd) throws Exception {
        Matcher match = getPatron().matcher(pwd);
        boolean esContraseña = match.find();
        if (esContraseña){
            setPwd(pwd);
        }else{
            String pattern = getPatron().toString();
            throw new PatternSyntaxException("La contraseña es incorrecta", pattern, -1);
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Pattern getPatron() {
        return patron;
    }

    public void setPatron(Pattern patron) {
        this.patron = patron;
    }
}
