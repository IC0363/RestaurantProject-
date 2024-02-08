public class Supply{// be able to add food and remove food, how much food, object
    ArrayList <String> foods = new ArrayList<String>();// ArrayList: Holds different types of foods
    ArrayList <Integer> numFood = new ArrayList<Integer>();// ArrayList: Holds the number of foods  


    private int totalFood;
    private String nameOffood;


}
public Supply(int t, String n){
    totalFood = t;
    nameOffood = n;

}
public int getTotal(){ // getter
    return totalFood;
}
public String getName(){// getter
    return nameOffood;
}
public void setTotal(int tot){// setter
    totalFood = tot;
}
public void setName(int na){// setter
    nameofFood = na;
}