package modelObject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterModel extends BaseModel {
    private String genderField;
    private String passwordField;
    private String daysField;
    private String monthsField;
    private String yearsField;
    private String firstNameField;
    private String lastNameField;
    private String addressField;
    private String countryField;
    private String stateField;
    private String cityField;
    private String zipCodeField;
    private String phoneNumberField;
    private String userName;
    private String userEmail;

    public RegisterModel(String jsonFilePath) {super(jsonFilePath);
    }


}
