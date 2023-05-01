package personuni;

public class Person {
    private String name;
    private String mailAddress;

    public Person (String name ,String mailAddress){
        this.name =name ;
        this .mailAddress = mailAddress;
    }
   
    public String getName (){
        return this.name;
    }

    public String getMailAddress(){
        return this.mailAddress;
    }

    public String toString (){
        return name + "," + mailAddress;
    }
    
}
