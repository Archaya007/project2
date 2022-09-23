public class Student {
    

        private int rollNo;
    
        private String firstName;
    
        private String lastName;
    
        private String dob;
    
        public Student(int rollNo,String firstName,String lastName,String dob){
    
            this.rollNo=rollNo;
    
            this.firstName=firstName;
    
            this.lastName=lastName;
    
            this.dob=dob;
    
        }
    
        public int getRollNo() {
    
            return rollNo;
    
        }
    
        public String getFirstName() {
    
            return firstName;
    
        }
    
        public String getLastName() {
    
            return lastName;
    
        }
    
        public String getDob() {
    
            return dob;
    
        } 
        public void setRollNo(int rollNo) {

            this.rollNo = rollNo;
    
        }
    
        public void setFirstName(String firstName) {
    
            this.firstName = firstName;
    
        }
    
        public void setLastName(String lastName) {
    
            this.lastName = lastName;
    
        }
    
        public void setDob(String dob) {
    
            this.dob = dob;
    
        }
    
}
