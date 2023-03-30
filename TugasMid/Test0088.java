/*Nama : Riany Rezeqy Utamie 
Nim : 13020210088*/

public class Test0088{    
   public static void main(String[] args){
        // Instansi objek balok1 dari Class Balok() →default const.
        Balok balok1 = new Balok();
        // Instansi objek balok2 dari Class Balok(20,35, 15)→param const.
        Balok balok2 = new Balok(20, 35, 15);
        // Setter set nilai l = 5 dari konstruktor Balok()
        balok1.setL(5);
        // Setter set nilai p = 25 dari konstruktor Balok()
        balok1.setP(25);
        // Setter set nilai t = 10 dari konstruktor Balok(20,35, 15)
        balok2.setT(10);
        // Memanggil method info dari konstruktor Balok ()
        balok1.info();
        // Memanggil method info dari konstruktor Balok(20,35, 15)
        balok2.info();
    }
}

// class Balok
class Balok extends PersegiPanjang {
    int t;
    public Balok() {
        // Berisi nilai panjang & lebar yang diperoleh dari konstruktor superclass PersegiPanjang serta tinggi=15
        super();
        this.t = 15;
    }
    
    public Balok(int p, int l, int t) {
        // Berisi nilai pada saat runtime p <- p, l <- l dari konstruktor superclass PersegiPanjang t <- t;
        super(p, l);
        this.t = t;
    }
    //  Getter Setter class balok
    public int getT() {
        return t;
    }
    public void setT(int t) {
        this.t = t;
    }    
    public int volume() {
        // fungsi untuk menghitung volume balok : p x l x t
        return getP() * getL() * t;
    }
    
    public void info() {
        // Menampilkan nilai panjang, lebar, tinggi, Luas, dan volume balok
        System.out.println("Panjang : " + getP());
        System.out.println("Lebar : " + getL());
        System.out.println("Tinggi : " + t);
        System.out.println("Luas : " + luas());
        System.out.println("Volume balok : " + volume());
    }
}

// class PersegiPanjang
class PersegiPanjang {
    int p, l;
    
    public PersegiPanjang() {
        // berisi nilai p=30 & lebar=20
        this.p = 30;
        this.l = 20;
    }
    public PersegiPanjang(int p, int l) {
        // berisi nilai pada saat runtime p <- p, l <- l
        this.p = p;
        this.l = l;
    }
    
    // Getter Setter class PersegiPanjang
    public int getP() {
        return p;
    }
    public void setP(int p) {
        this.p = p;
    }
    public int getL() {
        return l;
    }
    public void setL(int l) {
        this.l = l;
    }
    public int luas() {
        // Menghitung luas persegi panjang : p x l
        return
		p*l;
	}
    public int keliling(){
    return 2 * (p + l);
    }
}
