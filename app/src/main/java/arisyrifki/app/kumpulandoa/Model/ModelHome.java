package arisyrifki.app.kumpulandoa.Model;

/**
 * Created by rfkchrl on 11/11/2018.
 */

public class ModelHome {
    private String jadwal;
    private String waktu;

    /* *Constructor * Menginisialisasikan Variable  */
    public ModelHome(String jadwal, String waktu) {
        this.jadwal = jadwal;
        this.waktu = waktu;
    }

    public String getJadwal() {
        return jadwal;
    }

    public String getWaktu() {
        return waktu;
    }
}
