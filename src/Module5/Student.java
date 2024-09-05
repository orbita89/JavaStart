package Module5;

public class Student {
    String surname; //у каждого студента свое значение
    double averageMark; //у каждого студента свое значение
    int age; //у каждого студента свое значение
    static int baseScholarship = 110; //одно значение у всех студентов
    int calculateScholarship(){ //обычный метод - может работать с полями экземпляра
        if(averageMark >= 9){
            return (int)(baseScholarship * 1.6);
        }else if(averageMark >= 8){
            return (int)(baseScholarship * 1.4);
        }else if(averageMark >= 6){
            return (int)(baseScholarship * 1.2);
        }else if(averageMark >= 5){
            return baseScholarship;
        }else{
            return 0;
        }
    }
    static void raseScholarship(double k){ //статический метод - может обращаться
        // только к статическому полю
        baseScholarship = (int)(baseScholarship * k);
    }

    public class Purchase {
        String name;
        int price;
        double weight;
        static double nds = 0.2;
        int cost(){
            return (int)(weight * price * (1 + nds));
        }
        static void changeNds(double value){
            nds = value;
        }
    }

    public class Aap {
        Purchase milk = new Purchase();

        int a = milk.cost();
        double as = milk.weight;
    }
}
