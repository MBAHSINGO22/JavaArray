package PERTEMUAN6;

public class DataRandom {

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


    // Metode utama yang dijalankan saat program dijalankan
    public static void main(String[] args) {
        // Membuat array ukuran dengan beberapa nilai
        int[] ukuran = {1000, 10000, 100000};

        // Iterasi untuk setiap ukuran array
        for (int jumlah : ukuran) {
            // Membuat array baru dengan ukuran yang sesuai
            int[] data = new int[jumlah];
            // Mengisi array dengan angka acak
            for (int i = 0; i < jumlah; i++) {
                data[i] = (int) (Math.random() * jumlah); 
            }

            // Menghitung waktu awal eksekusi
            long startTime = System.nanoTime();
            // Melakukan quicksort pada array
            quickSortDescending(data, 0, data.length - 1);
            // Menghitung waktu akhir eksekusi
            long endTime = System.nanoTime();

            // Menghitung durasi eksekusi
            long duration = (endTime - startTime);

            // Mencetak ukuran array dan durasi eksekusi
            System.out.println("Ukuran array: " + jumlah + ", Waktu eksekusi: " + duration + " nanosecond");
        }
    }
}