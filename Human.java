import java.util.ArrayList;
import java.util.List;

public class Human {
    private Human gender;
    private Human father;
    private Human mother;
    private List<Human> children;
    private String fullName;
    private int birthYear;

    public Human(Human gender, Human father, Human mother, String fullName, int birthYear) {
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<Human>();
        this.fullName = fullName;
        this.birthYear = birthYear;

        
    }

    @Override
    public String toString() {
        return String.format("Full name : %s %d\n", this.fullName, this.birthYear);
    }

    public Human getFather(){
        return father;

    }
    public Human getMother(){
        return mother;

    }
    public List<Human> getChildren(){
        return children;

    }
    public Human getGender() {
        return gender;
    }
    public String getFullName(){
        return fullName;
    }
    public int getBirthYear(){
        return birthYear;
    }



public void addChild(Human child){
    int Parentmin = 18;
    if (child.getBirthYear() > this.getBirthYear() + Parentmin ) {
        this.children.add(child);

    } else {
        System.out.printf("Родители не могут быть моложе %s лет \n", Parentmin);

    }

}
public String getInfo(){
    StringBuilder sb = new StringBuilder();
    sb.append("имя: ");
    sb.append(fullName);
    sb.append(", ");
    sb.append(getMother());
    sb.append(", ");
    sb.append(getFather());
    sb.append(", ");
    sb.append(getChildren());
    return sb.toString();
}

public String getMotherInfo(){
    String res = "мать: ";
    if (mother != null){
        res += mother.getFullName();

    } else {
        res += "Неизвестна";

    }
    return res;
}
public String getFatherInfo(){
    String res = "отец: ";
    if (father != null){
        res += father.getFullName();
    } else {
        res += "Неизвестен";
    }
    return res;
}
public String getChildrenInfo() {
    StringBuilder res = new StringBuilder();
    res.append("дети: ");
    if (children.size() != 0) {
        res.append(children.get(0).getFullName());
        for(int i = 1; i < children.size(); i++) {
            res.append(", ");
            res.append(children.get(i).getFullName());
        }
    }else {
        res.append("Отсутствуют");

    }
    return res.toString();


    }
    
}
    

