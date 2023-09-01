/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author MAHADEV
 */
public class Validation {
    private Pattern name;
    private Pattern phoneno;
    private Pattern password;
    private Pattern email;
    
    private Matcher matcher;
    private static final String NAME_PATTERN="^[A-Za-z]{3,25}$";
    private static final String PHONE_PATTERN="^[0-9]{10}$";
    private static final String PASSWORD_PATTERN="^[A-Za-z0-9]{4,10}$";
    private static final String EMAIL_PATTERN="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z-]+(\\.[A-Za-z]+)*(\\.[A-Za-z]{2,3})$";
    //private static final String EMAIL_PATTERN="^[
    public Validation()
    {
        name=Pattern.compile(NAME_PATTERN);
        phoneno=Pattern.compile(PHONE_PATTERN);
        password=Pattern.compile(PASSWORD_PATTERN);
        email=Pattern.compile(EMAIL_PATTERN);
        
    }
    public boolean nameVlidate(final String name1)
    {
        matcher=name.matcher(name1);
        return matcher.matches();
    }
    public boolean phoneVlidate(final String phone1)
    {
        matcher=phoneno.matcher(phone1);
        return matcher.matches();
    }
    public boolean passwordVlidate(final String pass )
    {
        matcher=password.matcher(pass);
        return matcher.matches();
    }
    public boolean emailVlidate(final String email1)
    {
        matcher=email.matcher(email1);
        return matcher.matches();
    }
    
}
