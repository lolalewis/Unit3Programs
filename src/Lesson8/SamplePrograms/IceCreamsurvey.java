
package Lesson8.SamplePrograms;


public class IceCreamsurvey {

   
    public static void main(String[] args) {
       String survey [][]= {
           {"Emily","Chocloate"},
           {"Matt", "Vanilla"},
           {"Luke","Strawberry"},
           {"Tristan","Chocloate"},
           {"Laura", "Vanilla"},
           {"Jason","Strawberry"},
           {"Lucas","Chocolate"},
           {"Zach", "Strawberry"},
           {"Jacob", "Chocolate"},
           {"Tanner", "Strawberry"}
       };
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                System.out.println(j==0? "Name:" : "Flavour:");
                System.out.println("\t" + survey [i][j] + "\t");
            }
             System.out.println("");
        }
        String cpeople[]= filter(survey,"Chocolate");
        String vpeople[]= filter(survey,"Vanilla");
        String speople[]= filter(survey,"Starwberry");
        
        System.out.println("\n\nHere is a list of chocolate people");
        for (int i = 0; i < cpeople.length; i++) {
            System.out.println(cpeople[i] + ", ");
        }
        
         System.out.println("\n\nHere is a list of vanilla people");
        for (int i = 0; i < vpeople.length; i++) {
            System.out.println(vpeople[i] + ", ");
        }
        
         System.out.println("\n\nHere is a list of starwberry people");
        for (int i = 0; i < speople.length; i++) {
            System.out.println(speople[i] + ", ");
        }
    }
    public static String[] filter (String data [][], String flav){
        String results="";
        //go thru data looking for flav in spot [1]
        for (int i = 0; i < 10; i++) {
            if(flav.equals(data[i][1]))
                results+= data[i][0] + ",";  //matt , jason
        }
        return results.split(","); // splits String at every , into an array item
    }
}
