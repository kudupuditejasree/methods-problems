public class stringMethods2 {
    public static void main(String[] args) {
        String str="Teja sree";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(3));
        System.out.println(str.substring(2,8));
        String replacedString=str.replace('e','@');
        System.out.println(replacedString);
        System.out.println(str.replace("sree","sri"));
        System.out.println(str.replace("","b"));
        String fileName="demo.file.pdf";
        System.out.println(fileName.substring(fileName.lastIndexOf('.')+1));
        String email="Info@jennyslectures.com";
        String domainName=email.substring(email.indexOf('@')+1);
        System.out.println(domainName);
        String str1="    Teja sree     ";
        System.out.println(str1.trim());
        System.out.println(str.equals(str1));
        System.out.println(str.trim().equals(str1.trim()));


    }
}
