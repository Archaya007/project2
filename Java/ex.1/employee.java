import javafx.application.Preloader.StateChangeNotification;

public class employee {
        private int emp_no;
        private String emp_name;
        private boolean emp_punch;
        private float  emp_sal;
        private long pf_no;
        static {
            System.out.println("Static ");
        }
        {
            System.out.println("Non Static");
        }
        
     public employee(int emp_no, String emp_name, boolean emp_punch, float emp_sal, long pf_no) {
            this.emp_no = emp_no;
            this.emp_name = emp_name;
            this.emp_punch = emp_punch;
            this.emp_sal = emp_sal;
            this.pf_no = pf_no;
            System.out.println("constructor call");
        }
        

    public int getEmp_no() {
        return emp_no;
    }


    public String getEmp_name() {
        return emp_name;
    }


    public boolean isEmp_punch() {
        return emp_punch;
    }


    public float getEmp_sal() {
        return emp_sal;
    }


    


    public long getPf_no() {
        return pf_no;
    }


    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setEmp_punch(boolean emp_punch) {
        this.emp_punch = emp_punch;
    }

    public void setEmp_sal(float emp_sal) {
        this.emp_sal = emp_sal;
    }

    

    public void setPf_no(long pf_no) {
        this.pf_no = pf_no;
    }


    @Override
    public String toString() {
        return "employee [emp_name=" + emp_name + ", emp_no=" + emp_no + ", emp_punch=" + emp_punch + ", emp_sal="
                + emp_sal + ", pf_no=" + pf_no + "]";
    }


    


    }



    