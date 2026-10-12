public class stringMethodExample {
    public static void main(String[] args) {
        String str= "Ms.teja";
        System.out.println(str.charAt(3));
        for(int i=0;i<str.length();i++) {
            System.out.println("character at index"+i+" is"+str.charAt(i));
        }
        if(str.charAt(0)=='M'){
            System.out.println("character starting from M");
        }
      String fileName="file.pdf";
      if(fileName.endsWith(".pdf")){
          System.out.println("it is a pdf file");
      }
      else{
          System.out.println("not a pdf file");
      }

    }
}
