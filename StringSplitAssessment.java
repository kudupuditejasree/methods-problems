public class StringSplitAssessment {
    public static void main(String[] args) {
        String date="2026-10-13";
        String[] parts=date.split("-");
        /*for(String part:parts) {
            System.out.println(part);
        }*/
        System.out.println("year:"+parts[0]);
        System.out.println("month:"+parts[1]);
        System.out.println("day:"+parts[2]);
    }
}
