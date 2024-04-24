public class OperasiString{
    public static void main(String[] args){
        int i;
        double d;
        float f;
        String kota="Banjarbaru";

        System.out.println(kota);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);

        // System.out.println(uniskaString);

        // System.out.println(kota.toUpperCase());
        // System.out.println(kota.toLowerCase());
        // System.out.println(kota.substring(5));
        // System.out.println(kota.substring(1,6));

        String hariIni = "2024-04-24";
        String tahun = hariIni.substring(0,4);
        String bulan = hariIni.substring(5,7);
        String hari = hariIni.substring(8);

        String dmY = hari + "-" + bulan + "-" +tahun;

        System.out.println(tahun);
        System.out.println(bulan);
        System.out.println(hari + "-" + bulan + "-" +tahun);
        System.out.println(dmY.replace("-","/"));


        //hasil = 24 April 2024
        String bulanIndo;

        switch(bulan){
            case "01":
                bulanIndo = "Januari";
                break;
            case "02":
                bulanIndo = "Februari";
                break;
            case "03":
                bulanIndo = "Maret";
                break;
            case "04":
                bulanIndo = "April";
                break;
            case "05":
                bulanIndo = "Mei";
                break;
            case "06":
                bulanIndo = "Juni";
                break;
            case "07":
                bulanIndo = "Juli";
                break;
            case "08":
                bulanIndo = "Agustus";
                break;
            case "09":
                bulanIndo = "September";
                break;
            case "10":
                bulanIndo = "Oktober";
                break;
             case "11":
                bulanIndo = "November";
                break;
             case "12":
                bulanIndo = "Desember";
                break;
            default:
                bulanIndo = "Tidak Valid";
                break;
        }
        System.out.println(hari + " " + bulanIndo + " " +tahun);
          

    }
}