package mainmember;

public class Member {
 
    private String nama,team;
    private double penampilan,suara,atitude;
    private double nilai;
    private int umur;
    
     
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public double getPenampilan() {
        return penampilan;
    }

    public void setPenampilan(int penampilan) {
        this.penampilan = penampilan;
    }

    public double getSuara() {
        return suara;
    }

    public void setSuara(int suara) {
        this.suara = suara;
    }

    public double getAtitude() {
        return atitude;
    }

    public void setAtitude(int atitude) {
        this.atitude = atitude;
    }

    public double getNilai() {
        return nilai = (penampilan +atitude+suara)/3;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
