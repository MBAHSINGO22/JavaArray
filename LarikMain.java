package PERTEMUAN6;

public class LarikMain {

    // Metode utama yang dijalankan saat program dijalankan
    public static void main(String[] args) {
        // Membuat array integer dengan beberapa nilai
        int[] data = {5, 8, 26, 15, 11, 31, 7, 40, 23, 25};

        // Mencetak array sebelum diurutkan
        System.out.println("Array sebelum diurutkan:");
        Larik.printArray(data);

        // Memanggil metode quickSortDescending untuk mengurutkan array secara descending
        Larik.quickSortDescending(data, 0, data.length - 1);

        // Mencetak array setelah diurutkan
        System.out.println("\nArray setelah diurutkan:");
        Larik.printArray(data);
    }
}

