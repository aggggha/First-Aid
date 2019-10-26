package org.bekadesain.firstaid;

import java.util.ArrayList;

public class CasesData {
    private static String [] casesNames = {
            "Digigit Serangga",
            "Diare",
            "Mimisan",
            "Kram",
            "Disengat Lebah",
            "Sunburn",
            "Mabuk Laut / Darat",
            "Lebam",
            "Luka Bakar Ringan",
            "Asma",
            "Luka Bakar Berat",
            "Keracunan Makanan",
    };
    private static String[] casesSuggestionDetails = {
            "Pengompresan dengan kain flanel yang telah dibasahi. Ini adalah cara terbaik karena pembengkakan akan mengempis dengan sendirinya dalam waktu beberapa hari. Pengolesan balsam atau minyak panas justru tidak akan memberi efek apa-apa.",
            "Dalam keadaan darurat, larutkan satu sendok makan garam dan satu sendok makan gula kedalam segelas air matang. Minuman ini akan menggantikan cairan yang hilang dari tubuh penderita. Namun jika masih bisa mendapatkan minuman yang mengandung elektrolit atau kalori semacam oralit, berikanlah secepatnya.",
            "Duduk dengan posisi badan condong ke depan. Tekan hidung dengan ibu jari dan telunjuk selama 10-15 menit. Bernapaslah lewat mulut. Penekanan ini dapat segera menghentikan pendarahan pada hidung. Namun jika lebih dari 15 menit darah tetap mengalir, segera bawa ke dokter.",
            "Istirahatkan bagian tubuh yang menegang. Nyamankan posisi dan pijatlah bagian yang kram berlawanan arah dengan kontraksi. Semisal jika terjadi pada kaki, tekuk telapak kaki ke arah dalam. Lakukan berulang kali hingga membaik.",
            "Keluarkan sengat yang masih tertinggal di dalam kulit dengan pinset. Tekan perlahan agar racunnya keluar, bersihkan, lalu lakukan cara yang sama dengan penanganan digigit serangga.",
            "Gosokkan ketimun atau kentang pada kulit yang perih karena terlalu lama berjemur di bawah sinar matahari. Kedua jenis sayuran ini mengandung senyawa yang dapat mendinginkan luka bakar dan bisa mengurangi timbulnya pembengkakan.",
            "Sebelum melakukan perjalanan, minumlah air secukupnya karena salah satu penyebab mabuk perjalanan adalah dehidrasi. Lalu ganjal perut dengan makanan kecil seperti biskuit dan konsumsilah permen jahe. Selain obat anti mabuk, cara ini bisa membantu Anda mencegah mabuk.",
            "Kompres dengan air dingin atau es batu yang telah dibalut dengan kain atau handuk secepatnya. Balurkan krim khusus lebam jika memang diperlukan.",
            "Membasuh sambil mendinginkannya dengan air mengalir selama 10-15 menit. Keringkan dengan kassa medis dan hindari penggunaan handuk kasar atau kapas karena bisa menempel pada luka. Setelah itu, oleskan krim antibiotik.",
            "Posisikan penderita untuk duduk tegak dan bersandar. Tujuannya adalah untuk membuatnya merasa nyaman dan mempermudahnya menarik napas dalam-dalam sambil mengontrolnya. Setelah tenang, beri obat asma.",
            "Menyingkirkan semua benda terbakar yang masih melekat pada tubuh (baju, kain, dan lain sebagainya), let it cool off, sambil lekas menelepon ambulans untuk penanganan cepat dan tepat.",
            "Atasi dengan susu karena kandungan di dalamnya amat baik untuk menetralisir racun. Selain itu, berikan obat penyerap racun secepatnya, seperti Norit."
    };
    private static String[] casesAvoidDetails = {
            "Penggarukan. Sebab aktivitas ini akan menyebar racun yang ada hingga bengkak membesar dan muncul di area lain.",
            "Menganggap remeh. Diare yang berlarut-larut bisa mengakibatkan dehidrasi akut yang berujung pada melemahnya fungsi organ tubuh dan juga kematian.",
            "Mendongakkan wajah yang justru akan mengakibatkan aliran darah dari rongga hidung tertelan. Hal ini dapat mengiritasi lambung dan mengakibatkan sesak napas saat darah masuk ke dalam paru-paru. Anda juga tidak direkomendasikan untuk memasukkan penyumbat dalam bentuk apapun karena justru akan menambah luka baru akibat gesekan benda kasar.",
            "Dipaksakan tetap beraktivitas karena bisa mengakibatkan kerusakan otot.",
            "Meninggalkan sengat. Karena bengkak akan semakin parah hingga perlu penanganan serius dari ahli medis.",
            "Menggaruk atau mengopek bagian kulit yang kering dan gatal.",
            "Mengonsumsi makanan yang sarat lemak dan minyak. Reaksi kedua kandungan ini pada tubuh adalah memudahkan pengonsumsinya merasa mual. Selain itu, hindari membaca saat kendaraan tengah melaju ataupun memakai minyak panas untuk menggosok leher dan kepala. Terkadang aromanya akan membuat Anda semakin pusing.",
            "Menempelkan es langsung pada permukaan kulit dalam waktu yang cukup lama (lebih dari 10 menit) karena akan menurunkan pasokan darah di bawah kulit, atau yang biasa disebut iskemia.",
            "Mengoleskan pasta gigi, kecap atau mentega karena akan menjadikan luka semakin lama sembuh dan meninggalkan bekas pada kulit.",
            "Jangan meminta penderita untuk tiduran. Sebab justru pada posisi ini laju pernapasan akan lebih sulit.",
            "Menyiramnya dengan air atau mengompresnya karena hal ini sangat berbahaya dan bisa mengakibatkan hipotermia.",
            "Menganggap ini hal biasa. Karena jika keracunan semakin parah bisa menimbulkan diare, dehidrasi akut, bahkan kematian."
    };
    private static String[] casesImages = {
            "https://dl.kaskus.id/bit.ly/TbhB1d",
            "https://hellosehat.com/wp-content/uploads/2016/09/obat-diare-anak-dan-dewasa.jpg",
            "https://img-z.okeinfo.net/library/images/2018/05/23/mm0coh1a2eczqaffs41q_13629.jpg",
            "https://thumbor.medkomtek.com/eRT1QANULBqIlK_m19l6C3Uqse8=/1280x720/smart/filters:quality(75):strip_icc():format(jpeg)/klikdokter-media-buckets/medias/2294361/original/058472300_1532819697-Tips-Mudah-Atasi-Kram-Otot-By-Seasontime-shutterstock_615197759.jpg",
            "https://hellosehat.com/wp-content/uploads/2018/09/5-Perawatan-Rumahan-Untuk-Mengobati-Sengatan-Lebah.jpg",
            "https://cdn-prod.medicalnewstoday.com/content/images/articles/318/318319/a-man-with-sunburn.jpg",
            "https://kapalaku.com/gambar/mabuk-laut.jpg",
            "https://dl.kaskus.id/bit.ly/npN9jj",
            "https://hellosehat.com/wp-content/uploads/2018/09/derajat-luka-bakar.jpg",
            "https://res.cloudinary.com/dk0z4ums3/image/upload/v1469591829/attached_image/asma-alodokter.jpg",
            "https://res.cloudinary.com/dk0z4ums3/image/upload/v1555063088/attached_image/mengenal-jenis-dan-cara-menghilangkan-bekas-luka-bakar-alodokter.jpg",
            "https://res.cloudinary.com/dk0z4ums3/image/upload/v1569571524/attached_image/keracunan-makanan-alodokter.jpg"
    };

    static ArrayList<Cases> getListData() {
        ArrayList<Cases> list = new ArrayList<>();
        for (int i = 0; i < casesNames.length; i++) {
            Cases cases = new Cases();
            cases.setCasesName(casesNames[i]);
            // case.setSuggestionDetail(casesSuggestionDetails[i]);
            // case.setPrecautionDetail(casesPrecautionDetails[i]);
            cases.setPhoto(casesImages[i]);
            cases.setCasesSuggestion(casesSuggestionDetails[i]);
            cases.setCasesAvoid(casesAvoidDetails[i]);
            list.add(cases);
        }
        return list;
    }
}
