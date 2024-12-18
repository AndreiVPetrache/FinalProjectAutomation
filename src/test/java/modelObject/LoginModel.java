package modelObject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginModel extends BaseModel{
    private String registeredUserEmail;
    private String registeredUserPassword;
    private String registeredUserName;

    public LoginModel(String jsonFilePath) {super(jsonFilePath);}
}
