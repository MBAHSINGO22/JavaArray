package PERTEMUAN6;

public class Larik {

    // Metode untuk melakukan quicksort pada array secara descending
    public static void quickSortDescending(int[] array, int awal, int akhir) {
        // Jika indeks awal kurang dari indeks akhir, lanjutkan
        if (awal < akhir) {
            // Menggunakan metode parameter untuk mendapatkan posisi pivot
            int N = parameter(array, awal, akhir);
            // Melakukan quicksort pada subarray sebelum pivot
            quickSortDescending(array, awal, N - 1);
            // Melakukan quicksort pada subarray setelah pivot
            quickSortDescending(array, N + 1, akhir);
        }
    }

    // Metode untuk menentukan posisi pivot dan mengurutkan array berdasarkan pivot
    private static int parameter(int[] array, int awal, int akhir) {
        // Mengambil elemen pertama sebagai pivot
        int pivot = array[awal];
        // Indeks untuk menyimpan posisi elemen yang lebih besar dari pivot
        int i = awal;

        // Iterasi untuk menemukan posisi pivot dan mengurutkan elemen
        for (int j = awal + 1; j <= akhir; j++) {
            // Jika elemen lebih besar dari pivot, geser ke posisi yang tepat
            if (array[j] > pivot) { 
                i++;
                // Menukar elemen
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Menukar pivot dengan elemen di posisi yang tepat
        int temp = array[i];
        array[i] = array[awal];
        array[awal] = temp;

        // Mengembalikan posisi pivot
        return i;
    }

    // Metode untuk mencetak array
    public static void printArray(int[] array) {
        // Iterasi untuk mencetak setiap elemen array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}




