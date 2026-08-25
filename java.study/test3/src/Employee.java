public class Employee {
    String name;
    int basePay;

    Employee(String name , int basePay){
        this.name = name;
        this.basePay = basePay;
    }

    int getPay(){
        return basePay;
    }

    void printInfo(){
        System.out.println("직원이름은"+name+"이고 급여는"+basePay+"입니다");
    }

    public static void main(String[] args) {
        Employee em[] = new Employee[2];
        em[0] = new Employee("이순신",3100000);
        em[1] = new ContractEmployee("홍길동",2000000,300000);
        System.out.println(em[0].getPay());
        System.out.println(em[1].getPay());
        System.out.println(em[0].basePay + em[1].basePay + em[1].basePay);
    }

}

class ContractEmployee extends Employee{
    int bonus;
    ContractEmployee(String name , int basePay , int bouns){
        super(name,basePay);
        this.bonus = bouns;

    }
    int getPay(){
        return  basePay+bonus;
    }
    void printInfo(){
        System.out.println("계약직 직원이름은"+name+"이고 급여는"+basePay+"입니다");
    }
}
