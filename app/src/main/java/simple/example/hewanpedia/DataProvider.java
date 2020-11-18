package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;
import simple.example.hewanpedia.model.Ikan;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Ikan> initDataAyam(Context ctx) {
        List<Ikan> ayams = new ArrayList<>();
        ayams.add(new Ikan("Tuna", "Asia",
                "Tuna dikenal memiliki nilai komersial tinggi karena berukuran besar, dengan beratnya mulai 35 hingga 350 kg.", R.drawable.ikan_tuna));
        ayams.add(new Ikan("Kakap", "Riau - Indonesia",
                "Ikan kakap yang biasa dikonsumsi adalah ikan kakap merah (red snapper) dan ikan kakap putih (white seabass).", R.drawable.ikan_kakap));
        ayams.add(new Ikan("Makarel", "Indonesia - Asia",
                "Ikan makarel memiliki tubuh langsing dan berwarna keperakan seperti tuna, walau ukurannya jauh lebih kecil.\n" +
                        "\n" +
                        "Ikan yang lebih banyak tinggal di laut dalam ini, dikenal dengan kandungan asam lemak omega 3 dan omega 6 yang tinggi.", R.drawable.ikan_makarel));
        ayams.add(new Ikan("Tongkol", "Asia",
                "Jenis ikan laut ini memiliki banyak kandungan nutrisi yang salah satunya adalah zat besi, Zat besi sangat bermanfaat bagi tubuhmu dalam pembentukan sel-sel darah merah.", R.drawable.ikan_tongkol));
        ayams.add(new Ikan("Cakalang", "Sulawesi Dan Maluku",
                "Cakalang memiliki warna lebih terang dibanding tongkol, sehingga sering disebut tongkol putih.\n" +
                        "\n" +
                        "Perbedaan yang terlihat mencolok terletak pada bentukan badannya yang lebih gemuk dibanding tongkol.", R.drawable.ikan_cakalang));
        ayams.add(new Ikan("Kembung", "Indonesia",
                "Berasal dari keluarga yang sama dengan ikan tongkol, tuna, dan cakalang, ikan ini memiliki ukuran lebih kecil dibandingkan yang lainnya.", R.drawable.ikan_kembung));
        return ayams;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataAyam(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
