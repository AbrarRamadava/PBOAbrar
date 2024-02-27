public class HandPhone {

  String jenis_hp;
  int tahun_pembuatan;

  public String setDataHp(String jenisHp, int tahunPembuatan) {
    this.jenis_hp = jenisHp;
    this.tahun_pembuatan = tahunPembuatan;
    return "Data HP telah disimpan";
  }

  public String getJenisHp() {
    return jenis_hp;
  }

  public int getTahunPembuatan() {
    return tahun_pembuatan;
  }

  public static void main(String[] args) {
    HandPhone hp = new HandPhone();

    hp.setDataHp("IPHONE 15 PRO", 2023);

    System.out.println("Jenis HP: " + hp.getJenisHp());
    System.out.println("Tahun Pembuatan: " + hp.getTahunPembuatan());
  }
}