public class Method{
    public static String tanggalIndo(String tanggal){

        String tahun = tanggal.substring(0,4);
        String bulan = tanggal.substring(5,7);
        String hari = tanggal.substring(8);

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

        if (bulanIndo.equals("Tidak Valid")){
            return "Tidak Valid";
        } else {
            return hari + " " + bulanIndo + " " + tahun;
        }

    }
    public static void main(String[] args){
        String hariIni = "2024-04-24";
        String besok = "2024-04-25";
        String bulanDepan = "2024-05-24";
        String tanggalSalah = "2024-13-24";

        System.out.println(tanggalIndo(hariIni));
        System.out.println(tanggalIndo(besok));
        System.out.println(tanggalIndo(bulanDepan));
        System.out.println(tanggalIndo(tanggalSalah));

    }
}