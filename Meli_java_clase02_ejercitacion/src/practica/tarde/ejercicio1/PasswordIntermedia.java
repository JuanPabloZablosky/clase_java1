package practica.tarde.ejercicio1;

import java.util.regex.Pattern;

public class PasswordIntermedia extends Password{
    private String pwd;
    private final Pattern patron = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$");

    public PasswordIntermedia(){ }

    @Override
    public String getPwd() {
        return pwd;
    }

    @Override
    public void setPatron(Pattern patron) {
        super.setPatron(patron);
    }

    @Override
    public Pattern getPatron() {
        return patron;
    }
}
