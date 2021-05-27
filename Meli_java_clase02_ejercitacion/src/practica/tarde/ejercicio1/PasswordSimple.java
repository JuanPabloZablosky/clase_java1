package practica.tarde.ejercicio1;

import java.util.regex.Pattern;

public class PasswordSimple extends Password
{
    private String pwd;
    private final Pattern patron = Pattern.compile("^(?=.*[0-9])(?=.*[a-z]).{8,20}$");

    public PasswordSimple(){ }

    @Override
    public String getPwd() {
        return pwd;
    }

    @Override
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public Pattern getPatron() {
        return patron;
    }

}
