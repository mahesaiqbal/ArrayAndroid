package com.example.arrayandroid.data;

import com.example.arrayandroid.model.KelompokDua;

import java.util.ArrayList;

public class KelompokDuaData {

    public static String[][] kelompok2 = new String[][] {
            { "1512530153", "Reza Surya Putra" },
            { "1512530179", "Indah Mulyati" },
            { "1512530203", "Anindita Fadhilah Ardyputri" },
            { "1512530286", "Andri Juni Pratomo" },
            { "1611530039", "Muhammad Royhan" },
            { "1611530047", "Muhammad Ridhwansyah" },
            { "1611530054", "Mahesa Iqbal Ridwansyah" },
            { "1611530070", "Iqbal Pienandoro Jati" },
            { "1612530012", "Muhammad Faidul Abror" }
    };

    public static ArrayList<KelompokDua> getKelompokDuaList() {

        KelompokDua kelompokDua = null;
        ArrayList<KelompokDua> list = new ArrayList<>();

        for(int i = 0; i < kelompok2.length; i++) {
            kelompokDua = new KelompokDua();
            kelompokDua.setNim(kelompok2[i][0]);
            kelompokDua.setNama(kelompok2[i][1]);

            list.add(kelompokDua);
        }

        return list;

    }
}
