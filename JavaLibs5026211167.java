import javax.swing.JOptionPane;
public class JavaLibs5026211167{
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null,
            "HALO!\nSelamat Datang!\nDisini saya ingin bertanya beberapa hal pribadi pada kamu!",
            "JAVALIBS GAME DEWANG",
            1);

        String input1 = (String)JOptionPane.showInputDialog(null,
            "Nama kamu siapa?",
            "NAMA",
            2,
            null,
            null,
            "Type something here..");


        String input2 = (String)JOptionPane.showInputDialog(null,
            "Umur kamu berapa?",
            "UMUR",
            2,
            null,
            null,
            "Type something here..");
        
        JOptionPane.showMessageDialog(null,
            "Halo "+ input1 + "(" +input2+ ")");
        

        JOptionPane.showMessageDialog(null,
            "Kita lanjut ke pertanyaan berikutnya oke!");
        

        String[] acceptableValues = {"Goreng-gorengan", "Seafood", "Rebus-rebusan"};
        String input3 = (String)JOptionPane.showInputDialog(null,
            "Kamu suka tipe makanan apa?",
            "Makan",
            2,
            null,
            acceptableValues,
            acceptableValues[1]);

        String input4 = (String)JOptionPane.showInputDialog(null,
            "Berapa budget kamu untuk sekali makan?",
            "BIAYA",
            2,
            null,
            null,
            "Type something here..");

        String input5 = (String)JOptionPane.showInputDialog(null,
            "Apa nama restoran favoritmu untuk makan makanan kesukaanmu?",
            "Restoran",
            2,
            null,
            null,
            "Type something here..");

        String input6 = (String)JOptionPane.showInputDialog(null,
            "Jam berapa biasanya kamu pergi ke "+input5+"?",
            "Waktu",
            2,
            null,
            null,
            "Type something here..");

        String[] acceptableValues2 = {"Pasangan", "Teman", "Keluarga"};
        String input7 = (String)JOptionPane.showInputDialog(null,
            "Biasanya kamu pergi ke "+input5+" dengan siapa?",
            "Teman pergi",
            2,
            null,
            acceptableValues2,
            acceptableValues2[2]);

        String input8 = (String)JOptionPane.showInputDialog(null,
            "Apa alasan kamu sangat suka dengan "+input5+ "?",
            "Alasan sangat suka",
            2,
            null,
            null,
            "Type something here..");

        String input9 = (String)JOptionPane.showInputDialog(null,
            "Dari 1-10, Seberapa besar kamu akan merekomendasikan "+input5+" ke orang yang kamu kenal?",
            "Rekomendasi",
            2,
            null,
            null,
            "Type something here..");
        
        String input10 = (String)JOptionPane.showInputDialog(null,
            "Mengapa kamu memberi nilai tersebut?",
            "Nilai",
            2,
            null,
            null,
            "Type something here..");

        JOptionPane.showMessageDialog(null,
            "Wah, sekarang aku paham!\n"+input1+ " sangat suka tipe makanan "+input3+"!, kemudian budget untuk sekali makan kamu sebesar "+input4+"\nRestoran favorit kamu ternyata "+input5+
            " ya!, mirip denganku!\nKemudian kamu sering pergi ke sana sekitar jam "+input6+"!, dan biasanya sih bersama "+input7+".\nTernyata alasan kamu suka "+input5+" adalah karena restoran tersebut "
            +input8+". Kemudian kamu akan merekomendasikan "+input5+" ke orang yang kamu kenal dengan nilai sebesar "+input9+"! dengan alasan "+input10+".\nWah keren deh! senang berkenalan denganmu!\nSampai Jumpa Lagi!!!"
            );
    }    
    
}
