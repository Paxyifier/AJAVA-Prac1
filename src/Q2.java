class Generic <T extends Number>{
        T[] t;
public Generic(T[] arr) {
        this.t = arr;
        }
public double average() {
        double sum = 0.0;
        for( T num:t) {
        sum=sum+num.doubleValue();
        }
        return sum/this.t.length;
        }
        }

public class Q2 {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[] {1,2,3,4,5,6};
        Double[] dobArr = new Double[] {1.5,2.5,3.5,4.5,5.5,6.5};

        Generic<Integer> genInt = new Generic(intArr);
        Generic<Double> genDob = new Generic(dobArr);

        System.out.println("Integer Array Average: "+Double.toString(genInt.average()));
        System.out.println("Double Array Average: "+Double.toString(genDob.average()));
        System.out.println("Both arrays are "+(genInt.average()==genDob.average()?"Equal":"not Equal;"));
    }
}
