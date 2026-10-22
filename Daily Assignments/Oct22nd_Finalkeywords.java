package DailyAssignments;

class Company {
    final String COMPANY_NAME = "Tech Solutions Pvt. Ltd.";
    final int MAX_EMPLOYEES = 100;

    void displayDetails() {
        System.out.println("Company Name  : " + this.COMPANY_NAME);
        System.out.println("Max Employees : " + this.MAX_EMPLOYEES);
    }
}

public class Oct22nd_Finalkeywords {

    public static void main(String[] args) {
        Company company = new Company();
        company.displayDetails();

        // Step 4: remove the // to see the final-variable error
        // company.COMPANY_NAME = "Max";
    }
}