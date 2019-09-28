package Model;

public class Person {

    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eyes_color;
    private String birth_year;
    private String gender;

    public Person(String name, String height, String mass, String hair_color, String skin_color, String eyes_color, String birth_year, String gender) {
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hair_color = hair_color;
        this.skin_color = skin_color;
        this.eyes_color = eyes_color;
        this.birth_year = birth_year;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public String getEyes_color() {
        return eyes_color;
    }

    public void setEyes_color(String eyes_color) {
        this.eyes_color = eyes_color;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "Name = " + name + '\n' +
                "Height = " + height + '\n' +
                "Mass = " + mass + '\n' +
                "Hair Color = " + hair_color + '\n' +
                "Skin Color = " + skin_color + '\n' +
                "Eyes Color = " + eyes_color + '\n' +
                "Birth Year = " + birth_year + '\n' +
                "Gender = " + gender + '\n'
                ;
    }
}
