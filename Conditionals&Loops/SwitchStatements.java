import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println();
        // String fruit=in.next();

// switch (fruit) {
//     case "mango":
//     System.out.println("king of fruits");
//        break;
//      case "apple":
//     System.out.println("sweet of fruits");
//        break;
//     case "orange":
//     System.out.println("orange of fruits");
//        break;
//        case "grapes":
//     System.out.println("grapes of fruits");
//        break;

//     default:
//     System.out.println("plezs enter valid fruit");
       
// }



// enhanced switch stmt
  
// switch(fruit){
//     case "mango"-> System.out.println("king");
//     case "apple"-> System.out.println("apple");
//     case "orange"-> System.out.println("oragne");
//     case "grapes"-> System.out.println("grapess");
//      default-> System.out.println("king");

// }





       //nested switch 
       System.out.println("enter emply id");
       int emp_id=in.nextInt();
       String dept=in.next();

       switch (emp_id) {
        case 1:
        System.out.println("anat");
            break;
         case 2:
         System.out.println("shashank");
                 break;
            case 3:
            System.out.println("empl no 3");
            switch (dept) {
                case "IT":
                System.out.println("IT dept");
                    
                    break;
                 case "mngnt " :
                 System.out.println("manegement dept"); 
                  break;
                  default:
                  System.out.println("no dept entered");}
                  break;
                default:
                System.out.println("enter crt emp_id");
                    break;
           
       }

}
}
