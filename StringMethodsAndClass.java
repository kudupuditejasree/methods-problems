public class StringMethodsAndClass {
    public static void main(String[] args) {
        String str="Teja Sree";
        String str4="teja sree";
        String str1="";
        String str2=null;
        String str3="\n ";
        String str5=new String("teja sree");
        String fruit1="apple";
        String fruit2="banana";
        System.out.println(fruit2.compareTo(fruit1));
        System.out.println(str==str5);
        System.out.println(str4.equals(str5));
        System.out.println(str.length());
        //String str1="";
        System.out.println(str.equals(str4));
        System.out.println(str.equalsIgnoreCase(str4));
        System.out.println(str1.isEmpty());
        System.out.println(str3.isBlank());
        System.out.println(str2);
        System.out.println(str+str2);
        System.out.println(str.compareTo(str4));
        System.out.println(str4.compareTo(str));
        System.out.println("tej".compareTo("teju"));
        System.out.println(str.indexOf('j'));
        System.out.println(str.indexOf('e',2));
        System.out.println(str.indexOf("ja",0));
        System.out.println(str.lastIndexOf('a',7));
        System.out.println(str.lastIndexOf("ree",9));
        if(str2!=null && str2.isEmpty()){
            System.out.println("string is empty");
        }
        else{
            System.out.println("string is either null or empty");
        }
        System.out.println(str.contains("ree"));
        System.out.println(str.contains(""));
        System.out.println(str.contains("sree"));
        System.out.println(str.contains("Sree"));
        System.out.println(str.startsWith("Te"));
        System.out.println(str.startsWith("Sree",5));
        System.out.println(str.startsWith("Teja",2));
        System.out.println(str.endsWith("ree"));



    }
}
