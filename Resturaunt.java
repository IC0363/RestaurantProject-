public class Resturaunt {
    public static void main(String[]args){
        Supply List = new Supply();
        List.addFood("Fish");
        List.addFood("Milk");
        List.addFood("Beef");
        List.addFood("Bread");

        List.display();
        Salary waiter = new Salary(8,15,"Emily","Waitress");
        System.out.println(waiter);
        Salary chef = new Salary(10, 25, "John", "Chef" ); 
        System.out.println(chef);
        Salary HeadChef = new Salary(10, 30, "Joe", "Head Chef"); 
        System.out.println(HeadChef);
        Salary Manager = new Salary(10, 35.50, "Bob", "Manager"); 
        System.out.println(Manager);



        

    }
    
}
