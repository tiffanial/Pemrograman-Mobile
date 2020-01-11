package com.tiffanial.pahlawan;

import java.util.ArrayList;

public class PahlawanData {
    public static String [][] data = new String[][] {
            {"0", "FATMAWATI",
                    "Pahlawan yang menjahit bendera merah putih pertama\n" +
                    "Fatmawati yang bernama asli Fatimah adalah istri dari Presiden Indonesia pertama Soekarno. Ia menjadi Ibu Negara Indonesia pertama dari tahun 1945 hingga tahun 1967 dan merupakan istri ke-3 dari Presiden Pertama Indonesia, Soekarno.", "https://cdns.klimg.com/merdeka.com/i/w/tokoh/2012/03/15/4638/200x300/fatmawati-soekarno.jpg"},
            {"1", "CUT NYAK DIEN",
                    "Pahlawan yang berperang mengusir penjajah Belanda dari Aceh\n" +
                    "Cut Nyak Dhien adalah seorang Pahlawan Nasional Indonesia dari Aceh yang berjuang melawan Belanda pada masa Perang Aceh. Setelah wilayah VI Mukim diserang, ia mengungsi, sementara suaminya Ibrahim Lamnga bertempur melawan Belanda.", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Tjoet_Nya%27_Dhien.jpg/220px-Tjoet_Nya%27_Dhien.jpg",},
            {"2", "MARTHA CHRISTINA TIAHAHU",
                    "Pahlawan yang berperang mengusir penjajah dari Maluku",
                    "https://cdns.klimg.com/merdeka.com/i/w/tokoh/2012/03/15/4587/200x300/martha-christina-tijahahu.jpg",
                    "Martha Christina Tiahahu adalah seorang gadis dari Desa Abubu di Pulau Nusalaut. Lahir sekitar tahun 1800 dan pada waktu mengangkat senjata melawan penjajah Belanda berumur 17 tahun.",
                    "4 Januari 1800",
                    "2 Januari 1818"},
            {"3", "DEWI SARTIKA",
                    "Pahlawan yang membangkitkan semangat kaum wanita di dunia pendidikan",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Raden_Dewi_Sartika.jpg/220px-Raden_Dewi_Sartika.jpg",
                    "Raden Dewi Sartika adalah tokoh perintis pendidikan untuk kaum wanita. Ia diakui sebagai Pahlawan Nasional oleh Pemerintah Indonesia pada tahun 1966. ",
                    "4 Desember 1884",
                    "11 September 1947"},
            {"4", "CUT NYAK MEUTIA",
                    "Pahlawan yang berperang melawan penjajah Belanda dari Aceh",
                    "https://2.bp.blogspot.com/-iGAIXA104co/Vmj8m-BunkI/AAAAAAAAA5w/Wja9oDsNag4/s1600/Cut%2BMutia.jpg",
                    "Tjoet Nyak Meutia adalah pahlawan nasional Indonesia dari daerah Aceh. Ia dimakamkan di Alue Kurieng, Aceh. Ia menjadi pahlawan nasional Indonesia berdasarkan Surat Keputusan Presiden Nomor 107/1964 pada tahun 1964.",
                    "1870",
                    "24 Oktober 1910"}
    };

    public static ArrayList<Pahlawan> getListData(){
        ArrayList<Pahlawan> list = new ArrayList<>();
        for (String[] aData : data){
            Pahlawan pahlawan = new Pahlawan();
            pahlawan.setId(Integer.parseInt(aData[0]));
            pahlawan.setName(aData[1]);
            pahlawan.setDescription(aData[2]);
            pahlawan.setPhoto(aData[3]);
            list.add(pahlawan);
        }
        return list;
    }
}

