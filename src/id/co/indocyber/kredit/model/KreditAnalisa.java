/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.kredit.model;



/**
 *
 * @author user
 */
public class KreditAnalisa {
    private int jumlahTanggungan;
    private double hargaBarang;
    private double uangMuka;
    private double gajiPokok;
    private double bonus;
    private double penghasilanTambahan;
    private int lamaKredit;
    private double persenanBunga;
    private double bungaCicilan;
    private double pokokCicilan;
    private double totalKredit;
    private double cicilanPerBulan;
    private double limitPinjaman;
    private double totalPenghasilan;
    

    public KreditAnalisa( double gajiPokok, double bonus, double penghasilanTambahan, double uangMuka, double hargaBarang, int lamaKredit, int jumlahTanggungan) {
        //this.hargaBarang = hargaBarang;
        //this.uangMuka = uangMuka;
        this.gajiPokok = gajiPokok;       
        this.bonus = bonus;
        this.penghasilanTambahan = penghasilanTambahan;
        this.uangMuka = uangMuka;
        this.hargaBarang = hargaBarang;
        this.lamaKredit = lamaKredit;
        this.jumlahTanggungan = jumlahTanggungan;
    }

    
    
    public double PokokCicilan(){
        pokokCicilan = hargaBarang - uangMuka;
        return pokokCicilan;
    }
    public double persenBunga(){
        persenanBunga = 0.0;
//        switch (lamaKredit) {
//            case 3:
//                persenanBunga = 0.012;
//                break;
//            case 6:
//                persenanBunga = 0.015;
//                break;
//            case 12:
//                persenanBunga = 0.02;
//                break;
//            case 18:
//                persenanBunga = 0.025;
//                break;
//            case 24:
//                persenanBunga = 0.03;
//                break;
//            default:
//                break;
//        }
        if (lamaKredit == 3){
            persenanBunga = 0.012;
        } else if ( lamaKredit == 6){
            persenanBunga = 0.015;
        } else if ( lamaKredit == 12){
            persenanBunga = 0.02;
        } else if ( lamaKredit == 18){
            persenanBunga = 0.025;
        } else if ( lamaKredit == 24){
            persenanBunga = 0.03;
        }
        
        return persenanBunga; 
    }
   
    
    
    
    
    public double BungaCicilan(){
        bungaCicilan = (pokokCicilan*persenanBunga*(lamaKredit/12.0));
        return bungaCicilan;
    }
    private double TotalKredit(){
        totalKredit = pokokCicilan + bungaCicilan;
        return totalKredit;
    }
    public double CicilanPerBulan(){
        cicilanPerBulan = totalKredit / lamaKredit;
        return cicilanPerBulan;
    }
    public double TotalPenghasilan(){
        totalPenghasilan = gajiPokok + penghasilanTambahan + bonus;
        return totalPenghasilan;
    }
    public double LimitPinjaman(){
        limitPinjaman = (totalPenghasilan/(jumlahTanggungan+1));
        return limitPinjaman;
    }
    public String AnalisaKredit(){
        String hasilKredit =" ";
        if (limitPinjaman > cicilanPerBulan){
            hasilKredit = ("Kredit anda disetujui");
        } else {
            hasilKredit = ("Kredit anda tidak disetujui");
        }
            return hasilKredit;
    }    

    /**
     * @return the jumlahTanggungan
     */
    public int getJumlahTanggungan() {
        return jumlahTanggungan;
    }

    /**
     * @param jumlahTanggungan the jumlahTanggungan to set
     */
    public void setJumlahTanggungan(int jumlahTanggungan) {
        this.jumlahTanggungan = jumlahTanggungan;
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the uangMuka
     */
    public double getUangMuka() {
        return uangMuka;
    }

    /**
     * @param uangMuka the uangMuka to set
     */
    public void setUangMuka(double uangMuka) {
        this.uangMuka = uangMuka;
    }

    /**
     * @return the gajiPokok
     */
    public double getGajiPokok() {
        return gajiPokok;
    }

    /**
     * @param gajiPokok the gajiPokok to set
     */
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the penghasilanTambahan
     */
    public double getPenghasilanTambahan() {
        return penghasilanTambahan;
    }

    /**
     * @param penghasilanTambahan the penghasilanTambahan to set
     */
    public void setPenghasilanTambahan(double penghasilanTambahan) {
        this.penghasilanTambahan = penghasilanTambahan;
    }

    /**
     * @return the lamaKredit
     */
    public int getLamaKredit() {
        return lamaKredit;
    }

    /**
     * @param lamaKredit the lamaKredit to set
     */
    public void setLamaKredit(int lamaKredit) {
        this.lamaKredit = lamaKredit;
    }

    /**
     * @return the bunga
     */
    public double getpersenanBunga() {
        return persenanBunga;
    }

    /**
     * @param persenanBunga the bunga to set
     */
    public void setBunga(double persenanBunga) {
        this.persenanBunga = persenanBunga;
    }

}
