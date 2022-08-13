package MentoringWithAhmed.Constructor;

public class Baby {
    String name;
    String gender;
    double height;
    double weight;
    String eyecolor;
    int brainCapacity;


    public Baby() {
        System.out.println("I am a junior Ahmet, Hello World");
    }//as default this constructor is embedded (integrated)
// there are two difference between constructor and method
        //constructor doesn't have return type
        //constructor must have same name of the class
        // you can directly give the value
        //you can create and object and assign the value
        //you can create a method and initialize it
public void setName(String name){
    this.name=name;

        }
        public void setGender(String sex){
    }
    public void Baby(){
 // method has return type
 // methods might have same name of the class or not
        //SECOND STEP OF KNOWING CONSTRUCTOR
        //*you can directly give the value for the variables
        //*you can create and object and assign the value
        //*you can create a method and initialize it
        //* you can initialize the variables with CONSTRUCTOR
    }
    public Baby (String gender){
        this.gender = gender;
        System.out.println("I am seniorAhmet, Hello World");
    }
    public Baby(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    public Baby(String name, String gender, double height){
        this.name = name;
        this.gender = gender;
        this.height = height;
    }

    public Baby(String name, String gender, double height, double weight, String eyecolor, int brainCapacity) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.eyecolor = eyecolor;
        this.brainCapacity = brainCapacity;
    }
}









