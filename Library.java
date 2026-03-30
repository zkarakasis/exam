public class Title {
    private int id;
    private String title;

    //constructor
    public Title(int id, String title){
        this.id = id;
        this.title = title;
    }

    //setters
    public void setId(int id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
    return title;
    }

    @Override
    public String toString(){
        return "id: "+id+" Title: "+title;
    }
}

public class Member {
    private int id;
    private String name;
    private static final int MAX_ON_LOAN = 6;

    //Constructor
    public Member(int id, String name){
        this.id = id;
        this.name = name;
    }

    //Setters
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    //Geeters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public int getMaxOnLoan(){
        return MAX_ON_LOAN;
    }

    @Override
    public String toString(){
        return "Member id: "+id+". Member name: "+name+".";
    }

}

public class Journal extends Title {
    private String editor;

    public Journal(int id, String title, String editor){
        super(id, title);
        this.editor = editor;
    }

    public void setEditor(String editor){
        this.editor = editor;
    }

    public String getEditor(){
        return editor;
    }

    @Override
    public String toString(){
        return "blah blah blah";
    }
}

public class Student {
    private String name;
    private String regNumber;
    private int stageOfStudies;
    private int credits;

    public Student(String name, String regNumber){
        setName(name);
        setRegNumber(regNumber);
        this.stageOfStudies = 1;
        this.credits = 0;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRegNumber(String regNumber){
        this.regNumber = regNumber;
    }

    public void setStageOfStudies(int stageOfStudies){
        this.stageOfStudies = stageOfStudies;
    }

    public void setCredits(int credits){
        this.credits = credits;
    }

    public String getName(){
        return name;
    }

    public String getRegNumber(){
        return regNumber;
    }

    public int getStageOfStudies(){
        return stageOfStudies;
    }

    public int getCredits(){
        return credits;
    }

    public boolean doesStudentPass(){
        return credits == 120;
    }

     public void newStage(){
        if(doesStudentPass){
            stage++;
            credits = 0;
        }
     }

     public void passModule(int moduleCredits){
        stage += moduleCredits;
        if(credits == 120){
            newStage();
        }
     }
}

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width){
        setHeight(height);
        setWidth(width);
    }

    public Rectangle(){}

    public void setHeight(double height){
        if(height >= 0.1 && height <= 20.0){
            this.height = height;
        }
    }
    public void setWidth(double width){
        if(width >= 0.1 && width <= 20.0){
            this.width = width;
        }
    }    

    public double getHeight(){
        return height;
    }
    
    public double getWidth(){
        return width;
    }

    public double getPerimeter(){
        return 2 * (getHeight() + getWidth());
    }

    public double getArea(){
        return getHeight() * getWidth();
    }

    public boolean isSquare(){
        return getHeight() == getWidth();
    }

    public static void main (String[]args ){
        Rectangle r1 = new Rectangle();

        System.out.println("Initial height: "+r1.getHeight());
        System.out.println("Initial width: "+r1.getWidth());

        r1.setHeight(5.0);
        r1.setWidth(7.0);

        System.out.println("New height: "+r1.getHeight());
        System.out.println("New width: "+r1.getWidth());
    }
}
