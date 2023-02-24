package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        float salaryAfterTaxes=0f;
        if (salary < 0)
            System.out.println("wrong input!");
        else if (salary > 0 && salary <= 10000)
            salaryAfterTaxes = (float) (salary - salary*0.15);
        else if (salary > 10000 && salary <= 20000)
            salaryAfterTaxes = (float) (salary - salary*0.18);
        else
            salaryAfterTaxes = (float) (salary - salary*0.2);
        System.out.println(salaryAfterTaxes);

    }
}
