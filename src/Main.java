public class Main {

    public static void main(String[] args) {
        int [] arr = {7, 8, 5, 6, 0, 1, 9, 2, 4, 3};
        ShellSort s = new ShellSort(arr);
        s.sort();
        s.print();

    }
}
