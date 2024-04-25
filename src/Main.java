public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,7};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
        int[] arr2={2,4,6,8,9};
        int maxSum=arr2[1];
        int minSum=arr2[1];
        for (int i : arr2) {
            if (i > maxSum) {
                maxSum = i;
            }
            if (i<minSum){
                minSum=i;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила "+maxSum+" рублей");

        System.out.println("Минимальная сумма трат за неделю составила "+minSum+" рублей");
        int[] salaries={2,4,7,8,9};
        int sumSalaries=salaries[0];
for (int salary : salaries){
    sumSalaries +=salary;
}
        double averageSalary= (double)sumSalaries/salaries.length;
        System.out.println("Средняя сумма трат за месяц составила "+averageSalary+" рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1;i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}