public class stringMethods3 {
    public static void main(String[] args) {
    String str=" ,welcome , to jenny's ,lectures";
        //System.out.println(str.split(" "));
        String[] words =str.split(" ,",0);
        for (String word:words){
            System.out.println(word);
        }
        String email="Info@jennyslectures.com";
        String[] partsOfEmail=email.split("@");
        for(String poe:partsOfEmail) {
            System.out.println(poe);
           // System.out.println("Username:"+partsOfEmail[0]);
            //System.out.println("Domain:"+partsOfEmail[1]);
        }//or
        System.out.println("Username:"+partsOfEmail[0]);
        System.out.println("Domain:"+partsOfEmail[1]);

    }
}
