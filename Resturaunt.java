public class Resturaunt {
    public static void main(String[]args){
        Supply List = new Supply();
        List.addFood("Fish");
        List.addFood("Milk");
        List.addFood("Beef");

        List.display();
        Salary waiter = new Salary();
        System.out.println("Pay and hours for waiter: " +waiter);
        Salary chef = new Salary(10, 20); 
        System.out.println("Pay and hours for chef: " +chef);
        Salary HeadChef = new Salary(10, 30); 
        System.out.println("Pay and hours for chef: " +HeadChef);
        Salary Manager = new Salary(10, 35.50); 
        System.out.println("Pay and hours for chef: " +Manager);



        

    }
    
}
