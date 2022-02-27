public class TestClass5026211167 {

    public static void main(String[] args){
        
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results
        ComputeMethods5026211167 cm = new ComputeMethods5026211167();

	//celcius
        double celcius = cm.fToC(100);
        System.out.println("100 F = "+ celcius + " C");

	//hypotenuse
        double hypotenuse = cm.hypotenuse (5,12);
        System.out.println("Hypotenuse = " + hypotenuse);

	//rolldice
        int rollDice = cm.roll();
        System.out.println("Roll 2 Dice result = " + rollDice);

    }
}