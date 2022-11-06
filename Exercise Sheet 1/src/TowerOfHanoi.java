public class TowerOfHanoi {

    static void tower_of_hanoi(int n, char from_rod, char to_rod, char helper_rod) {
        // Base case
        if (n == 1) {
            System.out.println("Take disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        tower_of_hanoi(n-1, from_rod, helper_rod, to_rod);
        System.out.println("Take disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        tower_of_hanoi(n-1, from_rod, helper_rod, to_rod);
    }

    public static void main(String[] args) {
        int n = 3;

//        Moving the n discs from Rod A to Rod C, with helper Rod B
//
//        Rod A     Rod B     Rod C
//         |          |         |
//         |          |         |
//         |          |         |
//        ---        ---       ---

        tower_of_hanoi(n, 'A', 'C', 'B');
    }
}
