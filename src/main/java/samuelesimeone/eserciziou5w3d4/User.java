package samuelesimeone.eserciziou5w3d4;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {
    private String name;
    private String surname;

    public String firmaUser(){
        return "Firma: " + getName() + " " + getSurname();
    }
}

