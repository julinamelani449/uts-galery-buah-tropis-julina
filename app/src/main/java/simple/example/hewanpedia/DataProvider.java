package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Galery;
import simple.example.hewanpedia.model.Hijau;
import simple.example.hewanpedia.model.Kuning;

public class DataProvider {
    private static List<Galery> galeries = new ArrayList<>();

    private static List<Hijau> initDataHijau(Context ctx) {
        List<Hijau> hijaus = new ArrayList<>();
        hijaus.add(new Hijau("Jeruk Nipis", "Indonesia","Buah ini mengandung vitamin C cukup tinggi. Minum air hangat yang diseduh bersama air perasannya saja bisa menjauhkan kulit dari jerawat, kusam, dan pencernaan yang tak lancar.", R.drawable.hijau_1));
        hijaus.add(new Hijau("Jambu Biji", "Indonesia","Buah jambu merupakan sumber berbagai vitamin yang dibutuhkan oleh kulit. ", R.drawable.hijau_2));
        hijaus.add(new Hijau("Pepaya", "Indonesia","Pepaya mengandung sodium yang sangat rendah dan ini berarti buah tersebut sangat tinggi kandungan airnya.", R.drawable.hijau_3));
        hijaus.add(new Hijau("Sukun", "Indonesia","Buah sukun berasal dari daerah sekitar Pulau Papua (Oseania). Buah ini di sebagian tempat dimanfaatkan sebagai makanan pokok karena memiliki kandungan karbohidrat yang cukup tinggi. ", R.drawable.hijau_4));
        hijaus.add(new Hijau("Alpukat", "Indonesia","Buah dengan vitamin B ini sangat bergizi karena mengandung 3 hingga 30 persen minyak dengan komposisi yang sama dengan minyak zaitun. ", R.drawable.hijau_5));
        hijaus.add(new Hijau("Sirsak", "Indonesia","Buah sirsak banyak ditemukan di daerah beriklim tropis. Buah bernama latin Annona muricata ini sangat mudah ditemukan di Indonesia dan umum dijadikan santapan.", R.drawable.hijau_6));
        return hijaus;
    }

    private static List<Kuning> initDataKuning(Context ctx) {
        List<Kuning> kunings = new ArrayList<>();
        kunings.add(new Kuning("Pisang", "Indonesia","Buah pisang merupakan pelembap alami yang kaya vitamin A dan C, sehingga cocok digunakan sebagai masker untuk kulit kering. ", R.drawable.kuning_1));
        kunings.add(new Kuning("Belimbing", "Indonesia","Kadang disebut belimbing, carambola, atau star fruit. Buah berbentuk bintang ini kerap diolah menjadi campuran rujak manis atau es buah. ", R.drawable.kuning_2));
        kunings.add(new Kuning("Nangka", "Indonesia","Sering dijadikan sebagai simbol ketahanan pangan keluarga karena ukurannya yang besar, satu buah cukup untuk banyak orang.", R.drawable.kuning_3));
        kunings.add(new Kuning("Durian", "Indonesia","Disebut juga sebagai “Raja Buah”, sangat digemari di kawasan Asia Tenggara. Indonesia dipercaya sebagai daerah asal buah durian.", R.drawable.kuning_4));
        kunings.add(new Kuning("Mangga", "Indonesia","Mangga merupakan pelembap alami yang kaya vitamin A, vitamin C, dan vitamin E.", R.drawable.kuning_5));
        kunings.add(new Kuning("Nanas", "Indonesia","Buah ini kerap dituding bisa mengakibatkan keputihan. Padahal nanas kaya vitamin C yang dibutuhkan kulit untuk memproduksi kolagen. ", R.drawable.kuning_6));
        return kunings;
    }

    private static void initAllBuahs(Context ctx) {
        galeries.addAll(initDataHijau(ctx));
        galeries.addAll(initDataKuning(ctx));
    }

    public static List<Galery> getAllBuah(Context ctx) {
        if (galeries.size() == 0) {
            initAllBuahs(ctx);
        }
        return galeries;
    }

    public static List<Galery> getBuahsByTipe(Context ctx, String jenis) {
        List<Galery> buahsByType = new ArrayList<>();
        if (galeries.size() == 0) {
            initAllBuahs(ctx);
        }
        for (Galery h : galeries) {
            if (h.getJenis().equals(jenis)) {
                buahsByType.add(h);
            }
        }
        return buahsByType;
    }

}
