public class empmain {
    public static void main(String[] args) {
       employee e = new employee(123, "atchu", true, 5000, 1233456890L);
       employee e1 = new employee(123, "atchu", true, 5000, 1233456890L);
      e.setEmp_no(123);
      e.setEmp_name("atchu");
      e.setEmp_punch(true);
      e.setEmp_sal(5000);
      e.setPf_no(1233456890l);

      System.out.println(e.getEmp_no());
      System.out.println(e.getEmp_name());
      System.out.println(e.isEmp_punch());
      System.out.println(e.getEmp_sal());
      System.out.println(e.getPf_no());
      System.out.println(e);


        
        
}
}