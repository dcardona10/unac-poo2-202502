package co.edu.unac.oop2.recording;

public class Personal {

    private String id;
    private String name;
    private String email;
    private String phone;

    private static final String NAME_REGEX = "^[a-zA-Z]*$";
    private static final String EMAIL_REGEX = "^(.+)@(.+)$";
    private static final String PHONE_REGEX = "(?:\\d{3}-){2}\\d{4}";


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameException {
        if (name.matches(NAME_REGEX)) {
            this.name = name;
        } else {
            throw new NameException("Name does not comply with naming requirements: only alphabets allowed.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailException {
        if (email.matches(EMAIL_REGEX)) {
            this.email = email;
        } else {
            throw new EmailException("Email does not comply with formatting");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws PhoneException {
        if (phone.matches(PHONE_REGEX)) {
            this.phone = phone;
        } else {
            throw new PhoneException("Phone does not comply with formatting");
        }
    }

    @Override
    public String toString() {
        return "Personal{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
