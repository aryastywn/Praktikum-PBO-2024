abstract class Helm {
    protected String kode; // Remove 'final' keyword
    protected String merk; // Remove 'final' keyword
    protected int stok;

    public Helm(String kode, String merk, int stok) {
        this.kode = kode;
        this.merk = merk;
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) { // Provide setter method
        this.kode = kode;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) { // Provide setter method
        this.merk = merk;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Kode: " + kode + "\nMerk: " + merk + "\nStok: " + stok ;
    }

    public abstract String getJenis();
    public abstract String getAdditionalInfo();
}