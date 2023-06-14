package Question_AggregationComposition;

class AddressInfo{
    public String street;
    public String city;
    public String state;
    public String postalCode;

    AddressInfo(String street, String city, String state, String postalCode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }
}

class InsuranceInfo{
    public String policyName;
    public int policyId;

    InsuranceInfo(String policyName, int  policyId){
        this.policyName = policyName;
        this.policyId = policyId;
    }
}

class Employee{
    public String name;

    AddressInfo addressInfo;
    InsuranceInfo insuranceInfo;

    Employee(String name, AddressInfo addressInfo, InsuranceInfo insuranceInfo){
        this.name = name;
        this.addressInfo = addressInfo;
        this.insuranceInfo = insuranceInfo;
    }
    public void display(){
        System.out.println(name);
        System.out.println("Address Info is " + addressInfo.street + " " + addressInfo.city + " " + addressInfo.state + " " + addressInfo.postalCode);
        System.out.println("Insurance info is " + insuranceInfo.policyName + " " + insuranceInfo.policyId);
    }
}


public class Aggregation_Employee
{
    public static void main(String[] args) {
        AddressInfo aInfo = new AddressInfo("Backer Street", "London", "Uk", "221B");
        InsuranceInfo iInfo = new InsuranceInfo("Consulting Detective", 007);

        Employee e = new Employee("Sherlock", aInfo, iInfo);

        e.display();
    }
}
