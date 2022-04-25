public class Main {
    public static void main(String[] args) {
        // Задание 1
        int i = 1;
        while(i <= 10){
            System.out.print (i + " ");
            i++;
        }
        System.out.println(" ");
        for (int q = 10; q>= 1; q--){
            System.out.print (q + " ");
        }
        System.out.println(" ");
        // Задание 2
        for (int day = 3; day <= 31; day = day + 7 ){
            System.out.println ("Сегодня пятница " + day + " число. Необходимо подготовить отчет.");
        }
        // Задание 3
        int beforeOurYear = 1822;
        int afterOurYear = 2122;
        for (int startComet = 0; startComet <= afterOurYear ; startComet = startComet + 79){
            if (startComet <= beforeOurYear){
                continue;
            }
            System.out.println (startComet);

        }
    }
}



